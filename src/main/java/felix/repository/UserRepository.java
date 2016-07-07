package felix.repository;

import felix.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by felix on 7/7/16.
 */
public interface UserRepository extends MongoRepository<User, String> {
}
