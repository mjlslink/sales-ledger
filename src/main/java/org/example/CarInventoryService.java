package org.example;

import org.example.carinventory.model.CarInventory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarInventoryService {

    private final CarInventoryRepository repository;

    CarInventoryService(CarInventoryRepository repository) {
        this.repository = repository;
    }

    public List<CarInventory> getAllInventory() {
        return repository.findAll().stream()
                .map(Mapper::toDto)
                .collect(Collectors.toList());
    }
}
