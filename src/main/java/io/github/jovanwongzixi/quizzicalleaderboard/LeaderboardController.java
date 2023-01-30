package io.github.jovanwongzixi.quizzicalleaderboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
//@CrossOrigin(origins = "http://localhost:4173/Quizzical")
@RequestMapping("api/leaderboard")
public class LeaderboardController {
    @Autowired
    private LeaderboardService service;

    @GetMapping("/get")
    public ResponseEntity<List<Leaderboard>> getEntireLeaderboard(){
        return new ResponseEntity<>(service.entireLeaderboard(), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Leaderboard> addLeaderboard(@RequestBody Map<String, String> payload){
        return new ResponseEntity<>(service.createLeaderboard(payload.get("name"), Integer.valueOf(payload.get("score"))),HttpStatus.CREATED);
    }
}
