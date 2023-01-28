package com.example.VideoRent.controller;

import com.example.VideoRent.entity.Video;
import com.example.VideoRent.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/video")
public class VideoController {


    private VideoService service;
    @Autowired
    public VideoController(VideoService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public Iterable<Video> getAll(){
        return  service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Video> getId(@RequestParam int id){
       return service.find(id);
    }

    @PostMapping("/add")
    public Video addVideo(@RequestBody Video videoCasset){
        return service.save(videoCasset);
    }

    @PutMapping("/add")
    public Video updateVideo(@RequestBody Video videoCasset){
        return service.save(videoCasset);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVideo(@PathVariable int id){
        service.delete(id);
    }

}
