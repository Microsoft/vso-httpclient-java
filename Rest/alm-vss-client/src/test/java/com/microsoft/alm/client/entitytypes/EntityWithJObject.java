// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.entitytypes;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class EntityWithJObject {
    private int fieldA;
    private ObjectNode fieldB;
    private String fieldC;

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(final int fieldA) {
        this.fieldA = fieldA;
    }

    public ObjectNode getFieldB() {
        return fieldB;
    }

    public void setFieldB(final ObjectNode fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldC() {
        return fieldC;
    }

    public void setFieldC(final String fieldC) {
        this.fieldC = fieldC;
    }
}
