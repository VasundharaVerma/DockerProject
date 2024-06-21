package com.agilePeople.SimpleInterest.repository;

import com.agilePeople.SimpleInterest.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


 @Repository
 public interface CityRepository extends CrudRepository<City, Long> {

}
