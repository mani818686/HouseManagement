package com.HouseManagement.House.Management.service;

import com.HouseManagement.House.Management.Entity.House;
import com.HouseManagement.House.Management.repository.Houserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Houseserviceimpl implements Houseservice {
    @Autowired
    private Houserepository houserepository;


    @Override
    public House savehouse(House house) {
        return houserepository.save(house);
    }
    public List<House> getallhouses(){
        return  houserepository.findAll();
    }

    @Override
    public House gethousebyID(String Id) {
        Optional<House> house=houserepository.findByHouseId(Id);
        return house.get();
    }

    @Override
    public String deletehouseById(String Id) {
        houserepository.deleteByHouseId(Id);
        return "Car with Id "+Id+" is Deleted Successfully!!";
    }

    @Override
    public House gethousebyType(String type) {
        return houserepository.findByType(type);
    }
}
