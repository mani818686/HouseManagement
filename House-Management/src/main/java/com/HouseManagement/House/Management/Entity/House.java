package com.HouseManagement.House.Management.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
    @Id
    private  String houseId;
    private  String houseNo;
    private String status;
    private String type;
}