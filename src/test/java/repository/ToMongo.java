package repository;

import jjzee.JosephaApplication;
import jjzee.domain.Benifits;
import jjzee.domain.Person;
import jjzee.domain.Position;
import jjzee.domain.Value;
import jjzee.domain.mongo.BenifitsMongo;
import jjzee.domain.mongo.PersonMongo;
import jjzee.domain.mongo.PositionMongo;
import jjzee.domain.mongo.ValueMongo;
import jjzee.repository.BenifitsRepo;
import jjzee.repository.PersonRepo;
import jjzee.repository.PositionRepo;
import jjzee.repository.ValueRepo;
import jjzee.repository.mongo.BenifitsMongoRepo;
import jjzee.repository.mongo.PersonMongoRepo;
import jjzee.repository.mongo.PositionMongoRepo;
import jjzee.repository.mongo.ValueMongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j on 2015/06/08.
 */
@SpringApplicationConfiguration(classes= JosephaApplication.class)
@WebAppConfiguration
public class ToMongo extends AbstractTestNGSpringContextTests {
    private Long id;

    @Autowired
    private BenifitsRepo benifitsRepo;
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private PositionRepo positionRepo;
    @Autowired
    private ValueRepo valueRepo;

    @Autowired
    private BenifitsMongoRepo benifitsMongoRepo;
    @Autowired
    private PersonMongoRepo personMongoRepo;
    @Autowired
    private PositionMongoRepo positionMongoRepo;
    @Autowired
    private ValueMongoRepo valueMongoRepo;
    @Autowired
    JdbcTemplate jdbcTemplate;

    private List<Benifits> benifitsList= new ArrayList<>();
    private List<Person> personList = new ArrayList<>();
    private  List<Position> positionList = new ArrayList<>();
    private  List<Value> valueList = new ArrayList<>();
    private  BenifitsMongo benifitsMongo;
    private PositionMongo positionMongo;
    private PersonMongo personMongo;

    @Test
    public void move(){

        for(Benifits b : benifitsRepo.findAll()){
            benifitsList.add(b);
        }
        for(Person p : personRepo.findAll()){
            personList.add(p);
        }
        for (Position po : positionRepo.findAll()){
            positionList.add(po);
        }

        try {
            long start = System.currentTimeMillis();

            for (Value v : valueRepo.findAll()) {
                 ValueMongo valueMongo = new ValueMongo.
                        Builder(v.getCode()).description(v.getDescription()).
                        id(v.getId().toString()).build();
                valueMongoRepo.save(valueMongo);

                for(Benifits b : benifitsList) {
                    if (b.getValue().getId() == v.getId()) {
                        benifitsMongo = new BenifitsMongo.Builder(b.getCode()).
                                description(b.getDiscription()).value(valueMongo).build();
                        benifitsMongoRepo.save(benifitsMongo);

                        for (Position po : positionList) {
                            if (po.getBenifits().getId() == b.getId()) {
                                positionMongo = new PositionMongo.Builder(po.getCode()).
                                        benifits(benifitsMongo).description(po.getDescription()).
                                        name(po.getName()).build();
                                positionMongoRepo.save(positionMongo);

                                for(Person p : personList){
                                    if(p.getPosition().getId() == po.getId()){
                                        personMongo = new PersonMongo.Builder(p.getCode()).
                                                name(p.getName()).password(p.getPassword()).
                                                position(positionMongo).build();
                                        personMongoRepo.save(personMongo);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start + " : MilliSeconds");
        }catch (Exception ex){
                ex.printStackTrace();
            }

    }
}
