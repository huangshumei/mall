package com.jianf.commons.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.jianf.commons.utils.SensitiveInfoUtils;

import java.io.IOException;

/**
 * Created by fengjian on 2017/4/7.
 */
public class SensitivePhoneSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String mobile, JsonGenerator jen, SerializerProvider serializerProvider) throws IOException {
        jen.writeString( SensitiveInfoUtils.sensitiveMobile(mobile));
    }
}
