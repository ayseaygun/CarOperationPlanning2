package com.cchcaroperationplanning.caroperationplanning.Repository;

import com.cchcaroperationplanning.caroperationplanning.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
