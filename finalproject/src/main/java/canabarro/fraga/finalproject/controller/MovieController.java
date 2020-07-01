package canabarro.fraga.finalproject.controller;

import canabarro.fraga.finalproject.model.MovieEntity;
import canabarro.fraga.finalproject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Luís Felipe
 * @author Matheus Canabarro
 * @version 1.0.1
 * @since 26/06/2020 - 19:55
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieFindAllService movieFindAllService;

    @Autowired
    private MovieFindByIdService movieFindByIdService;

    @Autowired
    private MovieSaveService movieSaveService;

    @Autowired
    private MovieUpdateService movieUpdateService;

    @Autowired
    private MovieDeleteService movieDeleteService;

    @GetMapping
    public ResponseEntity<List<MovieEntity>> findAll() {
        return new ResponseEntity<List<MovieEntity>>( this.movieFindAllService.findAll() , new HttpHeaders(),HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<MovieEntity> findbyId(@PathVariable("id") long id) {
        MovieEntity movieEntity = this.movieFindByIdService.findById(id);
        if (movieEntity != null) {
            return new ResponseEntity<MovieEntity>(movieEntity,
                    new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<MovieEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<MovieEntity> save(@Valid @RequestBody MovieEntity movieEntity) {
        return new ResponseEntity<MovieEntity>(this.movieSaveService.save(movieEntity), new HttpHeaders(),HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<MovieEntity> update(@RequestBody MovieEntity movieEntity) {
        return new ResponseEntity<MovieEntity>(this.movieUpdateService.update(movieEntity),new HttpHeaders(),HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<MovieEntity> delete(@PathVariable("id") long id) {
        this.movieDeleteService.delete(id);
        return new ResponseEntity<MovieEntity>(new HttpHeaders(),HttpStatus.OK);
    }

}
