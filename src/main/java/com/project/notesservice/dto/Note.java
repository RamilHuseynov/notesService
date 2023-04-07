package com.project.notesservice.dto;

import com.project.notesservice.entity.LikeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    private String id;
    private String userId;
    private String text;
    private LocalDateTime creatDate;
    private List<LikeEntity> likes;
}
