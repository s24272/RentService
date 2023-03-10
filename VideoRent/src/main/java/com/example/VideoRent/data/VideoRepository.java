package com.example.VideoRent.data;

import com.example.VideoRent.entity.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Integer> {

}
