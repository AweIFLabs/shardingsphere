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

package org.apache.shardingsphere.distsql.handler.engine.update.rdl.rule.spi.database;

import org.apache.shardingsphere.distsql.handler.aware.DistSQLExecutorDatabaseAware;
import org.apache.shardingsphere.distsql.handler.aware.DistSQLExecutorRuleAware;
import org.apache.shardingsphere.infra.rule.ShardingSphereRule;
import org.apache.shardingsphere.infra.spi.annotation.SingletonSPI;
import org.apache.shardingsphere.infra.spi.type.typed.TypedSPI;
import org.apache.shardingsphere.sql.parser.statement.core.statement.SQLStatement;

/**
 * Database rule definition executor.
 * 
 * @param <T> type of SQL statement
 * @param <R> type of rule
 */
@SingletonSPI
public interface DatabaseRuleDefinitionExecutor<T extends SQLStatement, R extends ShardingSphereRule> extends TypedSPI, DistSQLExecutorDatabaseAware, DistSQLExecutorRuleAware<R> {
    
    /**
     * Check before update.
     *
     * @param sqlStatement SQL statement
     */
    void checkBeforeUpdate(T sqlStatement);
    
    @Override
    Class<T> getType();
}
