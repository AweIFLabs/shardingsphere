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

package org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.dbdiscovery.distsql.parser.statement.DropDatabaseDiscoveryRuleStatement;
import org.apache.shardingsphere.distsql.parser.statement.rdl.drop.DropRuleStatement;
import org.apache.shardingsphere.encrypt.distsql.parser.statement.DropEncryptRuleStatement;
import org.apache.shardingsphere.readwritesplitting.distsql.parser.statement.DropReadwriteSplittingRuleStatement;
import org.apache.shardingsphere.shadow.distsql.parser.statement.DropShadowRuleStatement;
import org.apache.shardingsphere.sharding.distsql.parser.statement.DropShardingBindingTableRulesStatement;
import org.apache.shardingsphere.sharding.distsql.parser.statement.DropShardingBroadcastTableRulesStatement;
import org.apache.shardingsphere.sharding.distsql.parser.statement.DropShardingTableRuleStatement;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.SQLCaseAssertContext;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop.impl.DropDatabaseDiscoveryRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop.impl.DropEncryptRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop.impl.DropReadwriteSplittingRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop.impl.DropShadowRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop.impl.DropShardingBindingTableRulesStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop.impl.DropShardingBroadcastTableRulesStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.drop.impl.DropShardingTableRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.SQLParserTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropDataBaseDiscoveryRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropEncryptRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropReadWriteSplittingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShadowRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingBindingTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingBroadcastTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingTableRuleStatementTestCase;

/**
 * Drop RDL statement assert.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DropRuleStatementAssert {
    
    /**
     * Assert drop RDL statement is correct with expected parser result.
     *
     * @param assertContext assert context
     * @param actual actual drop RDL statement
     * @param expected expected drop RDL statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final DropRuleStatement actual, final SQLParserTestCase expected) {
        if (actual instanceof DropDatabaseDiscoveryRuleStatement) {
            DropDatabaseDiscoveryRuleStatementAssert.assertIs(assertContext, (DropDatabaseDiscoveryRuleStatement) actual, (DropDataBaseDiscoveryRuleStatementTestCase) expected);
        } else if (actual instanceof DropEncryptRuleStatement) {
            DropEncryptRuleStatementAssert.assertIs(assertContext, (DropEncryptRuleStatement) actual, (DropEncryptRuleStatementTestCase) expected);
        } else if (actual instanceof DropReadwriteSplittingRuleStatement) {
            DropReadwriteSplittingRuleStatementAssert.assertIs(assertContext, (DropReadwriteSplittingRuleStatement) actual, (DropReadWriteSplittingRuleStatementTestCase) expected);
        } else if (actual instanceof DropShardingBindingTableRulesStatement) {
            DropShardingBindingTableRulesStatementAssert.assertIs(assertContext, (DropShardingBindingTableRulesStatement) actual, (DropShardingBindingTableRulesStatementTestCase) expected);
        } else if (actual instanceof DropShardingBroadcastTableRulesStatement) {
            DropShardingBroadcastTableRulesStatementAssert.assertIs(assertContext, (DropShardingBroadcastTableRulesStatement) actual, (DropShardingBroadcastTableRulesStatementTestCase) expected);
        } else if (actual instanceof DropShardingTableRuleStatement) {
            DropShardingTableRuleStatementAssert.assertIs(assertContext, (DropShardingTableRuleStatement) actual, (DropShardingTableRuleStatementTestCase) expected);
        } else if (actual instanceof DropShadowRuleStatement) {
            DropShadowRuleStatementAssert.assertIs(assertContext, (DropShadowRuleStatement) actual, (DropShadowRuleStatementTestCase) expected);
        }
    }
}
