package com.project.notesservice.service;

import com.project.notesservice.dto.Note;
import com.project.notesservice.dto.NoteRequest;
import com.project.notesservice.entity.NoteEntity;

import java.util.List;

public interface NoteService {
    NoteEntity createNewNote(NoteRequest note);

    List<Note> findAll();

    List<Note> findAllByUserId(String userId);

    void deleteById(String id);

    Note update(NoteEntity entity);
}
