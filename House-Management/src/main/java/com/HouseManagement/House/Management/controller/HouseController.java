package com.HouseManagement.House.Management.controller;

import com.HouseManagement.House.Management.Entity.House;
import com.HouseManagement.House.Management.service.Houseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HouseController {
 @Autowired
    private Houseservice houseservice;
    @PostMapping("/saveHouse")
    public House saveHouse(@RequestBody House house) {
        return houseservice.savehouse(house);
    }
    @GetMapping("/getAllHouse")
    public List<House> gethouses() {
        return houseservice.getallhouses();
    }
    @RequestMapping(value = "/getHouse", method = RequestMethod.GET)
    public House getHouseById(@RequestParam("id") String Id) {
        return houseservice.gethousebyID(Id);
    }

    @RequestMapping(value = "/getByType", method = RequestMethod.GET)
    public House getHouseByType(@RequestParam("type") String type) {
        return houseservice.gethousebyType(type);
    }
    @DeleteMapping("/deleteHouse")
    public String deleteHouseById(@RequestParam("id") String id) {

        return houseservice.deletehouseById(id);
    }


}
