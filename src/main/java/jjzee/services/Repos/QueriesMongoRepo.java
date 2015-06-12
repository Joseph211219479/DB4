package jjzee.services.Repos;

import jjzee.services.MongoQuiries;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by j on 2015/06/12.
 */
public interface QueriesMongoRepo extends MongoRepository<MongoQuiries, String> {
}
