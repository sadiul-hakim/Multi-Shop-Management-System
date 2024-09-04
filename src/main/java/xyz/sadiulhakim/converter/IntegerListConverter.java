package xyz.sadiulhakim.converter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Slf4j
@Component
public class IntegerListConverter implements AttributeConverter<List<Integer>, String> {
    private final ObjectMapper mapper;

    public IntegerListConverter(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String convertToDatabaseColumn(List<Integer> attribute) {
        try {
            return mapper.writeValueAsString(attribute);
        } catch (Exception ex) {
            log.error("IntegerListConverter.convertToDatabaseColumn() :: {}", ex.getMessage());
            return "";
        }
    }

    @Override
    public List<Integer> convertToEntityAttribute(String dbData) {
        try {
            return mapper.convertValue(dbData, new TypeReference<>() {
            });
        } catch (Exception ex) {
            log.error("IntegerListConverter.convertToEntityAttribute() :: {}", ex.getMessage());
            return Collections.emptyList();
        }
    }
}
