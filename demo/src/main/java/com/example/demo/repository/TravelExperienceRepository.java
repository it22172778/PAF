package com.example.demo.repository;

import com.example.demo.model.TravelExperience;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelExperienceRepository extends MongoRepository<TravelExperience, String> {
}
