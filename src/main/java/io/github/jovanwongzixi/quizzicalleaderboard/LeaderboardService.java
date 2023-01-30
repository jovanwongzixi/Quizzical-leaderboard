package io.github.jovanwongzixi.quizzicalleaderboard;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {
    @Autowired
    private LeaderboardRepository repository;
    public List<Leaderboard> entireLeaderboard(){
        return repository.findAll();
    }
    public Leaderboard createLeaderboard(String name, Integer score){
        ObjectId id = new ObjectId();
        return repository.insert(new Leaderboard(id, name, score));
    }
}
