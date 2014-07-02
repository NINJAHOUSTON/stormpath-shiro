/*
 * Copyright 2013 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.shiro.authc

import com.stormpath.sdk.provider.GoogleProviderData
import com.stormpath.sdk.provider.ProviderAccountRequest
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNull

/**
 * @since 0.6.0
 */
class GoogleAuthenticationTokenTest {

    @Test
    void test() {
        def token = new GoogleAuthenticationToken("fooGoogleCode")
        def request = token.providerAccountRequest
        assertEquals("google", request.providerData.providerId)
        assertEquals("fooGoogleCode", ((GoogleProviderData)((ProviderAccountRequest)token.getCredentials()).getProviderData()).code)
        assertNull(token.getPrincipal())
    }

}
