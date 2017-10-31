/*
 * Copyright 2017 JBoss Inc
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

package io.apicurio.hub.api.bitbucket;

import org.junit.Assert;
import org.junit.Test;

import io.apicurio.hub.api.github.GitHubResourceResolver;

/**
 * @author eric.wittmann@gmail.com
 */
public class BitBucketResourceResolverTest {

    /**
     * Test method for {@link GitHubResourceResolver#resolve(String)}.
     */
    @Test
    public void testResolve() {
        BitBucketResource resource = BitBucketResourceResolver.resolve("https://bitbucket.org/innodays/apicurio_test/src/notmaster/api/fourthAPI.json");
        Assert.assertNotNull(resource);
        Assert.assertEquals("innodays", resource.getTeam());
        Assert.assertEquals("apicurio_test", resource.getRepository());
        Assert.assertEquals("notmaster", resource.getSlug());
        Assert.assertNull(resource.getBranch());
        Assert.assertEquals("api/fourthAPI.json", resource.getResourcePath());
        
        resource = BitBucketResourceResolver.resolve("https://bitbucket.org/apicurio/apicurio-test/src/46163f44a4a398e0101ee9ff10affbbf57e066f9/apis/pet-store.json?at=master&fileviewer=file-view-default");
        Assert.assertNotNull(resource);
        Assert.assertEquals("apicurio", resource.getTeam());
        Assert.assertEquals("apicurio-test", resource.getRepository());
        Assert.assertEquals("master", resource.getBranch());
        Assert.assertEquals("46163f44a4a398e0101ee9ff10affbbf57e066f9", resource.getSlug());
        Assert.assertEquals("apis/pet-store.json", resource.getResourcePath());

        resource = BitBucketResourceResolver.resolve("https://bitbucket.org/apicurio/apicurio-test/raw/46163f44a4a398e0101ee9ff10affbbf57e066f9/apis/pet-store.json");
        Assert.assertNotNull(resource);
        Assert.assertEquals("apicurio", resource.getTeam());
        Assert.assertEquals("apicurio-test", resource.getRepository());
        Assert.assertNull(resource.getBranch());
        Assert.assertEquals("46163f44a4a398e0101ee9ff10affbbf57e066f9", resource.getSlug());
        Assert.assertEquals("apis/pet-store.json", resource.getResourcePath());
        
    }

}
