package com.exemplo.sistemaAulas.controller;

import com.exemplo.sistemaAulas.model.VideoClass;
import com.exemplo.sistemaAulas.service.VideoClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videoaulas")
public class VideoClassController {

    @Autowired
    private VideoClassService videoClassService;

    @GetMapping
    public List<VideoClass> getAllClasses() {
        return videoClassService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VideoClass> getClassById(@PathVariable Long id) {
        VideoClass videoClass = videoClassService.findById(id);
        if (videoClass != null) {
            return ResponseEntity.ok(videoClass);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public VideoClass saveClass(@RequestBody VideoClass videoClass) {
        return videoClassService.save(videoClass);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VideoClass> updateClass(@PathVariable Long id, @RequestBody VideoClass classDetails) {
        VideoClass videoClass = videoClassService.findById(id);
        if (videoClass != null) {
            videoClass.setTitulo(classDetails.getTitulo());
            videoClass.setId(classDetails.getYoutubeId());
            videoClass.setCourse(classDetails.getCourse());
            return ResponseEntity.ok(videoClassService.save(videoClass));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        videoClassService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

