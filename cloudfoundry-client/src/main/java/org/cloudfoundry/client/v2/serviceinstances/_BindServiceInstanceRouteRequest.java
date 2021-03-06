/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v2.serviceinstances;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.cloudfoundry.AllowNulls;
import org.cloudfoundry.Nullable;
import org.immutables.value.Value;

import java.util.Map;

/**
 * The request payload to Bind Service Instance To a Route
 */
@Value.Immutable
abstract class _BindServiceInstanceRouteRequest {

    /**
     * Key/value pairs of all arbitrary parameters to pass along to the service broker
     */
    @AllowNulls
    @JsonProperty("parameters")
    @Nullable
    abstract Map<String, Object> getParameters();

    /**
     * The route id
     */
    @JsonIgnore
    abstract String getRouteId();

    /**
     * The service instance id
     */
    @JsonIgnore
    abstract String getServiceInstanceId();

}
