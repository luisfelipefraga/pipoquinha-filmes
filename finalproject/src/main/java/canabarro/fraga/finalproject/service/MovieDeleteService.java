package canabarro.fraga.finalproject.service;

import canabarro.fraga.finalproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDeleteService {

    @Autowired
    private MovieRepository movieRepository;

    public void delete(long id) {
        this.movieRepository.deleteById(id);
    }

}
