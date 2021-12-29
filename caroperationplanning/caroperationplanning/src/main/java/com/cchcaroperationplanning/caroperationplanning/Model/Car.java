package com.cchcaroperationplanning.caroperationplanning.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "car")
public class Car {

    @Id
    String ıd;

    @Column
    String carName;

    @Column
    String carModel;

    public Car(String ıd, String carName, String carModel) {
        this.ıd = ıd;
        this.carName = carName;
        this.carModel = carModel;
    }

    public String getId() {
        return ıd;
    }

    public void setId(String ıd) {
        this.ıd = ıd;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
