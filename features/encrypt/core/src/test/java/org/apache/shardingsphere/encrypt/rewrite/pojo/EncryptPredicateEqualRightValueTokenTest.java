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

package org.apache.shardingsphere.encrypt.rewrite.pojo;

import org.apache.shardingsphere.encrypt.rewrite.token.pojo.EncryptPredicateEqualRightValueToken;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class EncryptPredicateEqualRightValueTokenTest {
    
    @Test
    void assertToStringWithoutPlaceholderWithoutTableOwnerWithEqual() {
        EncryptPredicateEqualRightValueToken actual = new EncryptPredicateEqualRightValueToken(0, 0, Collections.singletonMap(0, "a"), Collections.emptyList());
        assertThat(actual.toString(), is("'a'"));
    }
    
    @Test
    void assertToStringWithPlaceholderWithoutTableOwnerWithEqual() {
        EncryptPredicateEqualRightValueToken actual = new EncryptPredicateEqualRightValueToken(0, 0, Collections.emptyMap(), Collections.singleton(0));
        assertThat(actual.toString(), is("?"));
    }
}
