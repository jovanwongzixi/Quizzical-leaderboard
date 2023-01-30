package io.github.jovanwongzixi.quizzicalleaderboard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "leaderboard")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leaderboard {
    @Id
    private ObjectId id;
    private String name;
    private Integer score;
}
