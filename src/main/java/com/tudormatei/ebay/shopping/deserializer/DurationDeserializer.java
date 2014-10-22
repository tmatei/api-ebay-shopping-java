package com.tudormatei.ebay.shopping.deserializer;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Duration;

public class DurationDeserializer extends JsonDeserializer<Duration> {

    @Override
    public Duration deserialize(JsonParser parser, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {

        String string = parser.getText().trim();
        if(string.length() == 0)
            return null;

        return Duration.parse(string);
    }
}