package xyz.sadiulhakim.product.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import xyz.sadiulhakim.product.ProductDTO;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProductDTOConverter implements AttributeConverter<ProductDTO, String> {
    private final ObjectMapper mapper;

    @Override
    public String convertToDatabaseColumn(ProductDTO attribute) {
        try {
            return mapper.writeValueAsString(attribute);
        } catch (Exception ex) {
            log.error("ProductDTOConverter.convertToDatabaseColumn() :: {}", ex.getMessage());
            return "";
        }
    }

    @Override
    public ProductDTO convertToEntityAttribute(String dbData) {
        try {
            return mapper.convertValue(dbData, ProductDTO.class);
        } catch (Exception ex) {
            log.error("ProductDTOConverter.convertToEntityAttribute() :: {}", ex.getMessage());
            return new ProductDTO();
        }
    }
}
