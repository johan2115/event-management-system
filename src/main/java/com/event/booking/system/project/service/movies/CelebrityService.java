package com.event.booking.system.project.service.movies;

import com.event.booking.system.project.entity.movies.Celebrity;
import jakarta.transaction.Transactional;


//added in master branch
//for branch sf2
//11
//12

@Transactional
public interface CelebrityService {
    public void addCelebrity(Celebrity celebrity);
    public Celebrity getCelebrity(long id);
}
