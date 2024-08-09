/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sql.parser.statement.core.value.literal.impl;

import lombok.Getter;
import org.apache.groovy.parser.antlr4.util.StringUtils;
import org.apache.shardingsphere.sql.parser.statement.core.value.literal.LiteralValue;

/**
 * String literal value.
 */
@Getter
public final class StringLiteralValue implements LiteralValue<String> {
    
    private final String value;
    
    public StringLiteralValue(final String value) {
        this.value = value.substring(1, value.length() - 1);
    }
    
    /**
     * Get special escape sequences string.
     *
     * @param value string text
     * @return String literal value
     */
    public static StringLiteralValue getStandardEscapesStringLiteralValue(final String value) {
        return new StringLiteralValue(StringUtils.replaceStandardEscapes(value));
    }
}
