// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

import com.nimbusds.oauth2.sdk.ClientCredentialsGrant;

import java.util.Set;

class ClientCredentialRequest extends MsalRequest{

    ClientCredentialRequest(ClientCredentialParameters parameters,
                            ConfidentialClientApplication application,
                            RequestContext requestContext){
        super(application, createMsalGrant(parameters), requestContext );
    }

    private static OAuthAuthorizationGrant createMsalGrant(ClientCredentialParameters parameters){

        return new OAuthAuthorizationGrant(new ClientCredentialsGrant(), parameters.scopes(), parameters.withClaims());
    }
}
