/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.guvnor.services.backend.config;

import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;

import org.jboss.errai.bus.server.annotations.Service;
import org.kie.guvnor.services.config.ResourceConfigService;
import org.kie.guvnor.services.config.model.ResourceConfig;
import org.uberfire.backend.vfs.Path;

import static java.util.Collections.*;

@Service
@ApplicationScoped
public class ResourceConfigServiceImpl implements ResourceConfigService {

    @Override
    public ResourceConfig getConfig( final Path resource ) {
        return new ResourceConfig();
    }

    @Override
    public Map<String, Object> toMap( final ResourceConfig config ) {
        return new HashMap<String, Object>() {{
            put( "other", "content" );
        }};
    }
}
