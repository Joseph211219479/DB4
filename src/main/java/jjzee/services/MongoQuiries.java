package jjzee.services;

import com.mongodb.*;

/**
 * Created by j on 2015/06/12.
 */
public class MongoQuiries {

    public void selectSingleRecordAndFieldByRecordDiscription(DBCollection collection) {
        System.out.println("select Single Record And Field By Record Discription");
        long start = System.currentTimeMillis();

        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("password", "fs");
        BasicDBObject fields = new BasicDBObject();
        fields.put("password", "fs");

        DBCursor cursor = collection.find(whereQuery, fields);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + " : MilliSeconds recieved amount :" + cursor.size());
    }
}
