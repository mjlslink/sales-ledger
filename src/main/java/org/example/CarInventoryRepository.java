package org.example;

import org.example.carinventory.model.CarInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarInventoryRepository extends JpaRepository<CarInventoryEntity, Integer> {
}