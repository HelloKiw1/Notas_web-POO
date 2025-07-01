
package com.example.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public String listNotes(Model model) {
        model.addAttribute("notes", noteRepository.findAll());
        model.addAttribute("note", new Note());
        return "index";
    }

    @PostMapping
    public String addNote(@ModelAttribute Note note) {
        noteRepository.save(note);
        return "redirect:/notes";
    }

    @GetMapping("/{id}")
    public String readNote(@PathVariable Long id, Model model) {
        model.addAttribute("note", noteRepository.findById(id).orElse(null));
        return "read";
    }

    @GetMapping("/delete/{id}")
    public String deleteNote(@PathVariable Long id) {
        noteRepository.deleteById(id);
        return "redirect:/notes";
    }
}
