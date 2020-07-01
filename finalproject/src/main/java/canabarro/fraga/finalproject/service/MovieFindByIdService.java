package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.model.MovieEntity;
import canabarro.fraga.finalproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieFindByIdService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieEntity findById(long id) {
       return this.movieRepository.findById(id).get();
    }
}
