package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.model.MovieEntity;
import canabarro.fraga.finalproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieFindAllService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieEntity> findAll() {
        return (List<MovieEntity>) this.movieRepository.findAll();
    }
}
