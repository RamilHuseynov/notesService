package com.project.notesservice.controller;

import com.project.notesservice.dto.NoteRequest;
import com.project.notesservice.entity.NoteEntity;
import com.project.notesservice.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/notes")
@AllArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @PostMapping("/create")
    public ResponseEntity<?> createNewNote(@RequestBody NoteRequest note) {
        return ResponseEntity.ok(noteService.createNewNote(note));
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody NoteEntity note) {
        return ResponseEntity.ok(noteService.update(note));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(@RequestParam(name = "userId", required = false) String userId) {
        return ResponseEntity.ok(noteService.findAllByUserId(userId));
    }

    @DeleteMapping()
    public void deleteNote(@RequestParam(name = "id") String noteId) {
        noteService.deleteById(noteId);
    }
}
