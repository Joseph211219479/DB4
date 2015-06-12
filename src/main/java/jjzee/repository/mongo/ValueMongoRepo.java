package jjzee.repository.mongo;

import jjzee.domain.mongo.ValueMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by j on 2015/06/12.
 */
public interface ValueMongoRepo extends MongoRepository<ValueMongo, String> {
}
