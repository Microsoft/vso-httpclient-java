// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.model;

public class VssServiceException extends VssException {

    public VssServiceException() {
        super();
    }

    public VssServiceException(final String message, final Exception innerException) {
        super(message, innerException);

    }

    public VssServiceException(final String message) {
        super(message);

    }

}
