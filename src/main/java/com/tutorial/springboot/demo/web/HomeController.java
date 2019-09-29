package com.tutorial.springboot.demo.web;

import com.tutorial.springboot.demo.models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tutorial.springboot.demo.repo.NotesRepo;

/**
 * @author Ramesh Fadatare
 *
 */
@Controller
public class HomeController {
    @Autowired
    private NotesRepo notesRepo;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("notes", notesRepo.findAll());
        return "userhome";
    }

    @PostMapping("/messages")
    public String saveMessage(Note note) {
        notesRepo.save(note);
        return "redirect:/home";
    }
}