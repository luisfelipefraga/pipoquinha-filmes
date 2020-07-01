package canabarro.fraga.finalproject.repository;

import canabarro.fraga.finalproject.model.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Long> {
}
