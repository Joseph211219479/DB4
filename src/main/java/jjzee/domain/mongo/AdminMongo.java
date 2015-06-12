/*
package jjzee.domain.mongo;

import jjzee.domain.User;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

*/
/**
 * Created by j on 2015/06/08.
 *//*

@Document
public class AdminMongo {
    @Id
    private String id;

    @Column(unique = true)
    private int code;
    private String position;

    private AdminMongo(){}

    public AdminMongo(Builder builder){
        id = builder.id;
        code = builder.code;
        position = builder.position;
    }

    public static class Builder{
        private String id;
        private int code;
        private String position;

        public Builder(int code){
            this.code= code;
        }

        public Builder position(String position){
            this.position = position;
            return this;
        }
        public  Builder id(String id){
            this.id = id;
            return  this;
        }

        public AdminMongo build(){
            return new AdminMongo(this);
        }
    }


    public String getId() {
        return id;
    }

}
*/
