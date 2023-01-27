package com.example.VideoRent.service;

import com.example.VideoRent.data.VideoRepository;
import com.example.VideoRent.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoService {

    private VideoRepository videoRepository;
    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Optional<Video> find(int id){
        return videoRepository.findById(id);
    }

    public Iterable<Video> findAll(){
        return videoRepository.findAll();
    }

    public Video save(Video videoCasset){
        return videoRepository.save(videoCasset);
    }

    public void delete(int id){
        videoRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Video(1, "FastAndFurious", LocalDate.of(2002,9,11)));
        save(new Video(2, "Creed", LocalDate.of(2012,4,17)));
    }
}
