package repository;


import jjzee.JosephaApplication;
import jjzee.domain.Value;
import jjzee.repository.ValueRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

/*import domain.Benifits;
import domain.Person;
import domain.Position;*/
/*
import domain.domainMongo.BenifitsMongo;
import domain.domainMongo.PersonMongo;
import domain.domainMongo.PositionMongo;
import domain.domainMongo.ValueMongo;
*/
/*import repository.BenifitsRepo;
import repository.PersonRepo;
import repository.PositionRepo;*/

/**
 * Created by j on 2015/06/12.
 */
@SpringApplicationConfiguration(classes= JosephaApplication.class)
@WebAppConfiguration
public class ValueTest extends AbstractTestNGSpringContextTests {
    private Long id;

    /*@Autowired
    private BenifitsRepo benifitsRepo = null;
    @Autowired
    private PersonRepo personRepo = null;
    @Autowired
    private PositionRepo positionRepo = null;*/
    @Autowired
    private ValueRepo valueRepo;

    //private List<PersonMongo> personMongoList;
    //private List<BenifitsMongo> benifitsMongoList;
    //private List<PositionMongo> positionMongoList;
    //private List<ValueMongo> valueMongoList;

    @Test
    public void create(){
        Value value = new Value.Builder(236762).description("this is discription").build();
        valueRepo.save(value);
        id = value.getId();
       /* Benifits benifits = new Benifits.Builder(645).description("this is description").value(valueRepo.findOne(id)).build();
        benifitsRepo.save(benifits);
        id = null;
        id=benifits.getId();
        Position position = new Position.Builder(6534).benifits(benifitsRepo.findOne(id)).name("manager").description("manages stuff").build();
        positionRepo.save(position);
        id=null;
        id=position.getId();
        Person person = new Person.Builder(784635).name("Ackona").password("whatthat").position(positionRepo.findOne(id)).build();
        personRepo.save(person);

        Assert.assertNotNull(personRepo.findOne(id));*/
    }
}
