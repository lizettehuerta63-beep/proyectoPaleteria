package com.example.demo.controller;
import com.example.demo.model.Sale;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SaleController {
    @GetMapping
    public List<Sale> getLocalSales() {
        List<Sale> sales = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("sales.csv"))) {
            String line;
            br.readLine(); // Saltar los encabezados
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                sales.add(new Sale(data[0], data[1], data[2], Integer.parseInt(data[3]), Double.parseDouble(data[4])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sales;
    }
}
