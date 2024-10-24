package dev.arias.huapaya.ms_sale_report.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    @Id
    private String id;

    private Long document;

    private Long paymentCondition;

    private Long paymentStatus;

    private Long pettyCash;

    private Long deliveryStatus;

    private Long client;

    private Long store;

    private String serie;

    private Integer issued;

    private LocalDate operationDate;

    private LocalDate deliveryDate;

    private LocalDate expirationDate;

    private String observation;

    private List<SaleDetail> saleDetails;

    private BigDecimal freeAmount;

    private BigDecimal exemptAmount;

    private BigDecimal taxableAmount;

    private BigDecimal taxAmount;

    private BigDecimal subTotal;

    private BigDecimal discount;

    private BigDecimal saleAmount;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private Boolean status;

}
