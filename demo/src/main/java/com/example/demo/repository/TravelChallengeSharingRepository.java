package com.example.demo.repository;

import com.example.demo.model.TravelChallengeSharing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelChallengeSharingRepository extends MongoRepository<TravelChallengeSharing, String> {
}
