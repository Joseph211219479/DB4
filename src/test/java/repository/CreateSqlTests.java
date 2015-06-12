package repository;

import jjzee.JosephaApplication;
import jjzee.domain.Benifits;
import jjzee.domain.Person;
import jjzee.domain.Position;
import jjzee.domain.Value;
import jjzee.repository.BenifitsRepo;
import jjzee.repository.PersonRepo;
import jjzee.repository.PositionRepo;
import jjzee.repository.ValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by j on 2015/06/08.
 */
@SpringApplicationConfiguration(classes= JosephaApplication.class)
@WebAppConfiguration
public class CreateSqlTests extends AbstractTestNGSpringContextTests {
    private Long id;

  @Autowired
    private BenifitsRepo benifitsRepo;
    @Autowired
    private PersonRepo personRepo ;
    @Autowired
    private PositionRepo positionRepo ;
    @Autowired
  private ValueRepo valueRepo;

    @Test
    public void create(){

            Random objRandom = new Random();

           /* admin = new Admin.Builder(objRandom.nextInt()).build();
            adminrepo.save(admin);
            adminlist.add(admin);

            user = UserFactory.createUser("one for all", "dude", "what", objRandom.nextInt());
            repo.save(user);
            userlist.add(user);
*/

        for(int i =1 ; i< 100 ; i++){
            Value value = new Value.Builder(objRandom.nextInt()).description("this is discription").build();
            valueRepo.save(value);
            id= value.getId();
            Benifits benifits = new Benifits.Builder(objRandom.nextInt()).description("this is description").value(valueRepo.findOne(id)).build();
            benifitsRepo.save(benifits);
            id = null;
            id=benifits.getId();
            Position position = new Position.Builder(objRandom.nextInt()).benifits(benifitsRepo.findOne(id)).name("manager").description("manages stuff").build();
            positionRepo.save(position);
            id=null;
            id=position.getId();
            Person person = new Person.Builder(objRandom.nextInt()).name("Ackona").password("whatthat").position(positionRepo.findOne(id)).build();
            personRepo.save(person);
        }


        Assert.assertTrue(personRepo.count() > 100);


           /* department = new Department.Builder(objRandom.nextInt()).adminList(adminlist).name("cake").userList(userlist).build();
            departmentRepo.save(department);
            //id= department.getId();
*/


        //Assert.assertNotNull(id);
    }
}
