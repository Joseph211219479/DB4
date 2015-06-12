package jjzee.conf.factory.mongoDbConfig;


import com.mongodb.*;
import jjzee.services.GetSqlDatabases;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;
/**
 * Created by j on 2015/05/17.
 */
public class MongoConfig {

    private MongoClient mongoClient = null;
    private  DB db = null;
    private DBCollection coll = null;

    public void mongoConect(String databaseName){
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient(
                    new MongoClientURI("mongodb://localhost:27017"));
            db = mongoClient.getDB(databaseName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void mongoGetCollection(String collectionName){
        try{
             coll = db.getCollection(collectionName);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean testData()
    {
            DBObject dbObject = coll.findOne();
            return dbObject != null;
    }


}
