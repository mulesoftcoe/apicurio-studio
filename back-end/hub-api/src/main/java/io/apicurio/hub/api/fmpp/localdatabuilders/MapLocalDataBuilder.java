/*
 * Copyright 2014 Attila Szegedi, Daniel Dekany, Jonathan Revusky
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.hub.api.fmpp.localdatabuilders;

import io.apicurio.hub.api.fmpp.Engine;
import io.apicurio.hub.api.fmpp.LocalDataBuilder;
import io.apicurio.hub.api.fmpp.TemplateEnvironment;

import java.util.Map;

/**
 * Trivial local data builder that returns the <code>Map</code> passed to
 * its constructor.
 */
public class MapLocalDataBuilder implements LocalDataBuilder {
    private final Map map;
    
    public MapLocalDataBuilder(Map map) {
        this.map = map;
    }

    public Map build(Engine eng, TemplateEnvironment env) throws Exception {
        return map;
    }

}
