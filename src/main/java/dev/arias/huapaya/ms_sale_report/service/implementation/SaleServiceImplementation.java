package dev.arias.huapaya.ms_sale_report.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.arias.huapaya.ms_sale_report.model.Sale;
import dev.arias.huapaya.ms_sale_report.persistence.repository.SaleRepository;
import dev.arias.huapaya.ms_sale_report.service.interfaces.SaleService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SaleServiceImplementation implements SaleService {

    private final SaleRepository saleRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Sale> findAll() {
        return this.saleRepository.findAll();
    }

}
