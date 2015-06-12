package databaseTests;

import jjzee.JosephaApplication;
import jjzee.conf.factory.mongoDbConfig.MongoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by j on 2015/05/22.
 */
@SpringApplicationConfiguration(classes= JosephaApplication.class)
@WebAppConfiguration
public class MongoCrudTests extends AbstractTestNGSpringContextTests{

  /*  @Autowired
    UserInterface userRepo;

    @Autowired
    MongoInterface mongorepo;

    private MongoDb mongoConfig;*/
    @Test
    public void connection(){
       /* MongoConfig configfile = new MongoConfig();
        configfile.mongoConect("user");
        Iterable<User> userIterator = userRepo.findAll();
        for (User user : userIterator){
            mongoConfig =new MongoDb.Builder(user.getCode()).name(user.getName()).password(user.getPassword()).username(user.getUsername()).id(UUID.randomUUID().toString()).build();
            mongorepo.save(mongoConfig);
        }
*/



    }
}
