package pub.wii.cook.java.base;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;

public class JacksonUtils {
    private final static SimpleModule simpleModule =
            new SimpleModule().addSerializer(Double.class, new JsonSerializer<Double>() {
        @Override
        public void serialize(Double value,
                              JsonGenerator jsonGenerator,
                              SerializerProvider serializerProvider) throws IOException {
            if (value == null || Double.isNaN(value) || Double.isInfinite(value)) {
                // jsonGenerator.writeNull();
                jsonGenerator.writeString("0.0");
            } else {
                jsonGenerator.writeString(String.valueOf(value));
            }
        }
    });
    public final static ObjectMapper MAPPER = new ObjectMapper()
            .registerModule(simpleModule)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);
}
