package org.example.carinventory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor
public class CarInventory {

    private Integer id;
    private String vin;
    private Date purschaseDate;
    private Boolean restocked;
    private Boolean reordered;
}
