package com.note.back.service;

import com.note.back.domain.Note;
import com.note.back.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteMapper noteMapper;

    public void add(Note bean) {
        noteMapper.insert(bean);
    }

    public void delete(Integer id) {
        noteMapper.deleteByPrimaryKey(id);
    }

    public void update(Note bean) {
        noteMapper.updateByPrimaryKeySelective(bean);
    }

    public Note get(Integer id) { return noteMapper.selectByPrimaryKey(id); }

    public List<Note> list(){
        List<Note> notes = noteMapper.selectAll();
        return notes;
    }

    public List<Note> list(int cid){
        Note note = new Note();
        note.setCategoryId(cid);
        List<Note> notes = noteMapper.select(note);
        return notes;
    }

}
