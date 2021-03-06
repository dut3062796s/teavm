/*
 *  Copyright 2019 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.cache;

import java.util.EnumSet;
import org.teavm.model.AccessLevel;
import org.teavm.model.AnnotationContainerReader;
import org.teavm.model.ElementModifier;
import org.teavm.model.ElementReader;

class CachedElement implements ElementReader {
    EnumSet<ElementModifier> modifiers;
    CachedAnnotations annotations;
    AccessLevel level;
    String name;

    @Override
    public AccessLevel getLevel() {
        return level;
    }

    @Override
    public EnumSet<ElementModifier> readModifiers() {
        return modifiers.clone();
    }

    @Override
    public boolean hasModifier(ElementModifier modifier) {
        return modifiers.contains(modifier);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public AnnotationContainerReader getAnnotations() {
        return annotations;
    }
}
