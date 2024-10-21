drop table car_inventory;

create table car_inventory(
    id INTEGER PRIMARY KEY  AUTO_INCREMENT,
    vin VARCHAR(200),
    purchase_date DATE,
    restocked boolean,
    reordered boolean
);