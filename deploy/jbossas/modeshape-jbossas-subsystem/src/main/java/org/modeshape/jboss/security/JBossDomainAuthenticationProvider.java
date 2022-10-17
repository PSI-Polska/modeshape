/*
 * ModeShape (http://www.modeshape.org)
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
package org.modeshape.jboss.security;

import java.util.Map;
import javax.jcr.Credentials;

import org.modeshape.jboss.service.RepositoryService;
import org.modeshape.jcr.ExecutionContext;
import org.modeshape.jcr.security.EnvironmentAuthenticationProvider;

/**
 * {@link org.modeshape.jcr.security.EnvironmentAuthenticationProvider} used to interact with the security subsystem from a
 * JBoss Application Server.
 *
 * @author Horia Chiorean (hchiorea@redhat.com)
 * @see <a href="http://issues.jboss.org/browse/MODE-2411">MODE-2411</a>
 */
public class JBossDomainAuthenticationProvider extends EnvironmentAuthenticationProvider {

    @Override
    public void initialize() {
        // We don't use this authentication provider, authentication should be handled by our custom authentication provider
        // Body of this method is removed, because it wasn't compatible with Wildfly 26
    }


    @Override
    public ExecutionContext authenticate( Credentials credentials, String repositoryName, String workspaceName,
                                          ExecutionContext repositoryContext, Map<String, Object> sessionAttributes ) {
        return null;
    }


    @Override
    protected RepositoryService environment() {
        return (RepositoryService)super.environment();
    }

}
