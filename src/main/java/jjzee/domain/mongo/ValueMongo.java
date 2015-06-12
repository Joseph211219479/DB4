package jjzee.domain.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by j on 2015/06/12.
 */

@Document
public class ValueMongo {
    @Id
    private String id;
    @Column(unique = true)
    private int code;
    private String description;

    private ValueMongo(){}

    public  ValueMongo(Builder builder){
        id = builder.id;
        code = builder.code;
        description = builder.description;
    }

    public static class Builder{
        private int code;
        private String description;
        private String id;

        public Builder(int code){
            this.code = code;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public ValueMongo build(){
            return new ValueMongo(this);
        }

    }
}

