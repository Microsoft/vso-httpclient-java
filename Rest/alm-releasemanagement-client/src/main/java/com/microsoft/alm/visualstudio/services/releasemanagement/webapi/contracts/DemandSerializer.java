// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DemandSerializer extends JsonSerializer<Demand> {

    /**
     * Serializes ReferenceLinks to JSON
     * 
     * @param value
     * @param writer
     * @param serializer
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
    public void serialize(Demand value, JsonGenerator writer, SerializerProvider serializer)
        throws IOException,
            JsonProcessingException {
        if (value != null) {
            writer.writeObject(value.toString());
        }
    }
}
