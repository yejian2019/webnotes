package com.note.back.controller;

import com.note.back.domain.Category;
import com.note.back.domain.Note;
import com.note.back.service.CategoryService;
import com.note.back.service.NoteService;
import com.note.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private NoteService noteService;

    @GetMapping("/categories")
    public Object getCategoryList(){
        List<Category> categories = categoryService.list();
        return Result.success(categories);
    }

    @GetMapping("/categories/{cid}/notes")
    public Object getNotesByCategory(@PathVariable("cid") int cid){
        List<Note> notes = noteService.list(cid);
        return Result.success(notes);
    }

}
