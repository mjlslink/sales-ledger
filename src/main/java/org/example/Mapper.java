package org.example;

import org.example.carinventory.model.CarInventory;
import org.example.carinventory.model.CarInventoryEntity;

public class Mapper {
    public static CarInventory toDto(CarInventoryEntity carInventoryEntity) {
        return new CarInventory(carInventoryEntity.getId(),
                carInventoryEntity.getVin(),
                carInventoryEntity.getPurchaseDate(),
                carInventoryEntity.getRestocked(),
                carInventoryEntity.getReordered());
    }
}
