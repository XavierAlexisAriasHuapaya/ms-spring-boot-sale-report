package dev.arias.huapaya.ms_sale_report.service.interfaces;

import java.util.List;

import dev.arias.huapaya.ms_sale_report.model.Sale;

public interface SaleService {
    
    public List<Sale> findAll();

}
