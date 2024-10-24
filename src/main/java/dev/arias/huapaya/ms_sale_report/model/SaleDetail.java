package dev.arias.huapaya.ms_sale_report.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetail {

    @Id
    private String id;

    private Long product;

    private Long typeAffectation;

    private Long quantity;

    private BigDecimal salePrice;

    private BigDecimal discount;

    private BigDecimal totalAmount;

    private Boolean procentageDiscount;

}
