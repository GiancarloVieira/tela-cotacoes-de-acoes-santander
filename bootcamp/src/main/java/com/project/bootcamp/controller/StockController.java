package com.project.bootcamp.controller;

import com.project.bootcamp.model.dto.StockDTO;
import org.apache.tomcat.jni.Local;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@RequestBody StockDTO dto) {
        return ResponseEntity.ok(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll(){
        List<StockDTO> lista = new ArrayList<>();
        StockDTO dto = new StockDTO();
        dto.setId(1L);
        dto.setName("Magazine Luiza");
        dto.setPrice(100D);
        dto.setVariation(10D);
        dto.setDate(LocalDate.now());
        lista.add(dto);

        return ResponseEntity.ok(lista);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable Long id){
        List<StockDTO> lista = new ArrayList<>();
        StockDTO dto1 = new StockDTO();
        dto1.setId(1L);
        dto1.setName("Magazine Luiza");
        dto1.setPrice(100D);
        dto1.setVariation(10D);
        dto1.setDate(LocalDate.now());

        StockDTO dto2 = new StockDTO();
        dto2.setId(2L);
        dto2.setName("Ponto Frio");
        dto2.setPrice(200D);
        dto2.setVariation(5D);
        dto2.setDate(LocalDate.now());

        lista.add(dto1);
        lista.add(dto2);

        StockDTO dtoSelect = lista.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();
        return ResponseEntity.ok(dtoSelect);
    }

}
