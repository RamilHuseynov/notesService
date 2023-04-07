package com.project.notesservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "like")
@AllArgsConstructor
@NoArgsConstructor

public class LikeEntity {
    @Id
    private String id;
    private String likedUserID;
    private String likedNoteId;
}
