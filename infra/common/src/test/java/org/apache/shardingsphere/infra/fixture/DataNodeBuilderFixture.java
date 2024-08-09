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

package org.apache.shardingsphere.infra.fixture;

import org.apache.shardingsphere.infra.datanode.DataNode;
import org.apache.shardingsphere.infra.datanode.DataNodeBuilder;
import org.apache.shardingsphere.infra.datanode.DataNodeUtils;
import org.apache.shardingsphere.infra.rule.attribute.datasource.DataSourceMapperRuleAttribute;

import java.util.Collection;
import java.util.LinkedList;

public final class DataNodeBuilderFixture implements DataNodeBuilder<FixtureRule> {
    
    @Override
    public Collection<DataNode> build(final Collection<DataNode> dataNodes, final FixtureRule rule) {
        Collection<DataNode> result = new LinkedList<>();
        for (DataNode each : dataNodes) {
            result.addAll(DataNodeUtils.buildDataNode(each, rule.getAttributes().getAttribute(DataSourceMapperRuleAttribute.class).getDataSourceMapper()));
        }
        return result;
    }
    
    @Override
    public int getOrder() {
        return 3;
    }
    
    @Override
    public Class<FixtureRule> getTypeClass() {
        return FixtureRule.class;
    }
}
