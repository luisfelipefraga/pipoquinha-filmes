package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.model.MovieEntity;
import canabarro.fraga.finalproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieUpdateService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieEntity update(MovieEntity movieEntity) {
        return this.movieRepository.save(movieEntity);
    }
}
