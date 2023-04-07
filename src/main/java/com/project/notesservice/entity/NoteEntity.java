package com.project.notesservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "note")
@AllArgsConstructor
@NoArgsConstructor
public class NoteEntity {
    @Id
    private String id;
    private String userId;
    private String text;
    private String creatDate;
}
