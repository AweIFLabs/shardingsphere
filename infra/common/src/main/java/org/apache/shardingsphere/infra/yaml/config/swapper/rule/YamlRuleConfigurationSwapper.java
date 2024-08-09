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

package org.apache.shardingsphere.infra.yaml.config.swapper.rule;

import org.apache.shardingsphere.infra.config.rule.RuleConfiguration;
import org.apache.shardingsphere.infra.spi.annotation.SingletonSPI;
import org.apache.shardingsphere.infra.spi.type.ordered.OrderedSPI;
import org.apache.shardingsphere.infra.util.yaml.swapper.YamlConfigurationSwapper;
import org.apache.shardingsphere.infra.yaml.config.pojo.rule.YamlRuleConfiguration;

/**
 * YAML rule configuration swapper.
 * 
 * @param <Y> type of YAML rule configuration
 * @param <T> type of rule configuration
 */
@SingletonSPI
public interface YamlRuleConfigurationSwapper<Y extends YamlRuleConfiguration, T extends RuleConfiguration> extends YamlConfigurationSwapper<Y, T>, OrderedSPI<T> {
    
    /**
     * Get YAML rule tag name.
     *
     * @return YAML rule tag name
     */
    String getRuleTagName();
}
