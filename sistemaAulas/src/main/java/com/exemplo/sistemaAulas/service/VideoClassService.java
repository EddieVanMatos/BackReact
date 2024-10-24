package com.exemplo.sistemaAulas.service;

import com.exemplo.sistemaAulas.model.VideoClass;
import com.exemplo.sistemaAulas.repository.VideoClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoClassService {

    @Autowired
    private VideoClassRepository videoClassRepository;

    public List<VideoClass> findAll() {
        return videoClassRepository.findAll();
    }

    public VideoClass findById(Long id) {
        return videoClassRepository.findById(id).orElse(null);
    }

    public VideoClass save(VideoClass videoClass) {
        return videoClassRepository.save(videoClass);
    }

    public void deleteById(Long id) {
        videoClassRepository.deleteById(id);
    }
}
