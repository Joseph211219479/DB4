package jjzee.repository;

import jjzee.domain.Person;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by j on 2015/06/12.
 */

public interface PersonRepo extends CrudRepository<Person,Long>{
}

