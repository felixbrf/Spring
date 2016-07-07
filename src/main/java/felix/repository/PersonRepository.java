package felix.repository;

import felix.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by felix on 7/5/16.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
