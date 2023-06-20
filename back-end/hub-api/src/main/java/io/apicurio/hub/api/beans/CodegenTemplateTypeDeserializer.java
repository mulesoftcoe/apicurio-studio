package io.apicurio.hub.api.beans;

import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

// Custom deserializer for CodegenTemplateType enum
public class CodegenTemplateTypeDeserializer extends StdDeserializer<CodegenTemplateType> {
    protected CodegenTemplateTypeDeserializer() {
        super(CodegenTemplateType.class);
    }

    @Override
    public CodegenTemplateType deserialize(com.fasterxml.jackson.core.JsonParser jsonParser, com.fasterxml.jackson.databind.DeserializationContext deserializationContext) throws IOException, IOException {
        String templateName = jsonParser.readValueAs(String.class);
        for (CodegenTemplateType type : CodegenTemplateType.values()) {
            if (type.templateName.equalsIgnoreCase(templateName)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid template name: " + templateName);
    }
}
