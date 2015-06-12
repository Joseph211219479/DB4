/*
package repository;

import jjzee.JosephaApplication;
import jjzee.conf.factory.factory.UserFactory;
import jjzee.domain.User;
import jjzee.repository.UserInterface;
import jjzee.services.GetSqlDatabases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

*/
/**
 * Created by j on 2015/05/13.
 *//*

@SpringApplicationConfiguration(classes= JosephaApplication.class)
@WebAppConfiguration
public class UserCrudTests extends AbstractTestNGSpringContextTests {

    private Long id;

    @Autowired
    private UserInterface repo ;

    private GetSqlDatabases getSql = new GetSqlDatabases();

    @Test
    public void testCreate() throws Exception{
        for(int i = 1 ; i <1000 ; i++){
            User user = UserFactory.createUser("one for all","dude","what",63663+i);
            repo.save(user);
            id= user.getId();
        }

        //Assert.assertNotNull(repo.findOne(user.getId()));
    }

    @Test(dependsOnMethods = "testCreate")
    public void read(){
        User user = repo.findOne(id);
        Assert.assertEquals(user.getName(), "to be");
    }

}
*/
