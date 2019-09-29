package com.tutorial.springboot.demo.repo;

import com.tutorial.springboot.demo.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepo extends JpaRepository<Note, Integer> {
}
