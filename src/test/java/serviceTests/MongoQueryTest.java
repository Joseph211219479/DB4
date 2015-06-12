package serviceTests;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import jjzee.JosephaApplication;
import jjzee.services.MongoQuiries;
import jjzee.services.Repos.QueriesMongoRepo;
import junit.framework.Assert;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import com.mongodb.DB;

/**
 * Created by j on 2015/06/12.
 */
@SpringApplicationConfiguration(classes= JosephaApplication.class)
@WebAppConfiguration
public class MongoQueryTest extends AbstractTestNGSpringContextTests {
    MongoQuiries mongoQuiries = new MongoQuiries();

    @Test
    public void getRecods(){
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("test");
            DBCollection collection = db.getCollection("personMongo");
            Assert.assertNotNull(mongo);
            mongoQuiries.selectSingleRecordAndFieldByRecordDiscription(collection);
        }catch (Exception e){

        }
    }
}
