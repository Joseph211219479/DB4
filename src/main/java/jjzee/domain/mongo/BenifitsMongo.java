package jjzee.domain.mongo;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;


/**
 * Created by j on 2015/06/12.
 */

@Document
public class BenifitsMongo {
    @Id
    private String id;

    @Column(unique = true)
    private int code;

    private String discription;
    @DBRef
    private ValueMongo value;

    private BenifitsMongo(){}

    public BenifitsMongo(Builder builder){
        id = builder.id;
        code = builder.code;
        value = builder.value;
        discription = builder.discription;
    }

    public static class Builder{
        private ValueMongo value;
        private int code;
        private String id;
        private String discription;

        public Builder(int code){
            this.code = code;
        }
        public Builder value(ValueMongo value){
            this.value = value;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder description(String description){
            this.discription = description;
            return this;
        }

        public BenifitsMongo build(){
            return new BenifitsMongo(this);
        }
    }
}

