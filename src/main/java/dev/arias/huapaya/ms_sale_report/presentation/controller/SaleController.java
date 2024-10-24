package dev.arias.huapaya.ms_sale_report.presentation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.arias.huapaya.ms_sale_report.model.Sale;
import dev.arias.huapaya.ms_sale_report.service.interfaces.SaleService;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@AllArgsConstructor
@RestController
@RequestMapping(path = "sale")
public class SaleController {

    private final SaleService saleService;


    @GetMapping
    public ResponseEntity<?> findAll() {
        Map<String, Object> response = new HashMap<>();
        List<Sale> listSale = this.saleService.findAll();
        response.put("data", listSale);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    

}
