package com.HouseManagement.House.Management.repository;

import com.HouseManagement.House.Management.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface Houserepository extends JpaRepository<House,String> {
    Optional<House> findByHouseId(String id);
    String deleteByHouseId(String houseid);
    House findByType(String type);
}
