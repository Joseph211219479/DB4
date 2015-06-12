package jjzee.repository.mongo;

import jjzee.domain.mongo.PersonMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by j on 2015/06/12.
 */
public interface PersonMongoRepo  extends MongoRepository<PersonMongo,String > {
}
