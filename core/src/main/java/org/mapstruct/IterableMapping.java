/**
 *  Copyright 2012-2013 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Configures the mapping between two iterable types, e.g. {@code List<String>} and {@code List<Date>}.
 *
 * @author Gunnar Morling
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface IterableMapping {

    /**
     * A format string as processable by {@link SimpleDateFormat} if the annotated method maps from an iterable of
     * {@code String} to an iterable {@link Date} or vice-versa. Will be ignored for all other element types.
     *
     * @return A date format string as processable by {@link SimpleDateFormat}.
     */
    String dateFormat();
}