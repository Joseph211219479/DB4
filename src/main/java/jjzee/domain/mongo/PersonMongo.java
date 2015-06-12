package jjzee.domain.mongo;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;


/**
 * Created by j on 2015/06/12.
 */

@Document
public class PersonMongo {
    @Id
    private String id;

    @Column(unique = true)
    private int code;

    @DBRef
    private PositionMongo position;
    private String name;
    private String password;
    private PersonMongo(){}

    public PersonMongo(Builder builder){
        name = builder.name;
        password = builder.password;
        position = builder.position;
        code = builder.code;

    }

    public static class Builder{
        private PositionMongo position;
        private int code;
        private String id;
        private String name;
        private String password;

        public Builder(int code){
            this.code = code;
        }

        public Builder position(PositionMongo position){
            this.position = position;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder password(String password){
            this.password = password;
            return this;
        }
        public  Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder copy(PersonMongo person){
            this.code = person.getCode();
            this.id = person.getId();
            return  this;
        }
        public PersonMongo build(){
            return new PersonMongo(this);
        }
    }

    public String getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public PositionMongo getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

