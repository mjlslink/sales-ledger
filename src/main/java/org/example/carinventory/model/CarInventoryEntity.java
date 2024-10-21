package org.example.carinventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name="car_inventory")
public class CarInventoryEntity {
    @Id
    private Integer id;
    private String vin;
    private Date purchaseDate;
    private Boolean restocked;
    private Boolean reordered;

}
