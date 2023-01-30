package io.github.jovanwongzixi.quizzicalleaderboard;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository extends MongoRepository<Leaderboard, ObjectId> {
}
