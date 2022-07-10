package com.HouseManagement.House.Management.service;

import com.HouseManagement.House.Management.Entity.House;

import java.util.List;

public interface Houseservice {
    public House savehouse(House house);

    public List<House> getallhouses();

    public House gethousebyID(String id);

    public String deletehouseById(String id);

    House gethousebyType(String type);
}

