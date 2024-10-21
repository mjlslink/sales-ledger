package org.example;

import org.example.carinventory.model.CarInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarInventoryController {

    private final CarInventoryService service;

    @Autowired
    public CarInventoryController(CarInventoryService carInventoryService) {
        this.service = carInventoryService;
    }

    @GetMapping("/")
    public ResponseEntity<List<CarInventory>> getALlCarImventory() {
        return new ResponseEntity<List<CarInventory>>(service.getAllInventory(), HttpStatus.OK);
    }
}
