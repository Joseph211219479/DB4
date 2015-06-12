package databaseTests;

import jjzee.JosephaApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

/**
 * Created by j on 2015/06/07.
 */
@SpringApplicationConfiguration(classes= JosephaApplication.class)
@WebAppConfiguration
public class SqlTests extends AbstractTestNGSpringContextTests {

   /* private GetSqlDatabases getSql;

    @Autowired
    UserInterface userRepo;*/
    @Test
    public void getConnected(){/*
        for(User i : userRepo.findAll()){
            System.out.println(i.getName());
        }*/
    }
}
