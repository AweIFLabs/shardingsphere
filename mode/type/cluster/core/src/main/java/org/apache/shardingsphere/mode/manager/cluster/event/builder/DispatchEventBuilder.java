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

package org.apache.shardingsphere.mode.manager.cluster.event.builder;

import org.apache.shardingsphere.infra.spi.annotation.SingletonSPI;
import org.apache.shardingsphere.mode.event.DataChangedEvent;
import org.apache.shardingsphere.mode.event.DataChangedEvent.Type;

import java.util.Collection;
import java.util.Optional;

/**
 * Dispatch event builder.
 * 
 * @param <T> type of event
 */
@SingletonSPI
public interface DispatchEventBuilder<T> {
    
    /**
     * Get subscribed keys.
     *
     * @return subscribed keys
     */
    Collection<String> getSubscribedKeys();
    
    /**
     * Get subscribed types.
     *
     * @return subscribed types
     */
    Collection<Type> getSubscribedTypes();
    
    /**
     * Create dispatch event.
     *
     * @param event registry center data changed event
     * @return dispatch event
     */
    Optional<T> build(DataChangedEvent event);
}
