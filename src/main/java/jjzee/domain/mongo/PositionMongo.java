package jjzee.domain.mongo;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;


/**
 * Created by j on 2015/06/12.
 */

@Document
public class PositionMongo {
    @Id
    private String id;

    @Column(unique = true)
    private int code;

    @DBRef
    private BenifitsMongo benifits;

    private String name;
    private String description;

    private PositionMongo(){}

    public PositionMongo(Builder builder){
        id = builder.id;
        benifits = builder.benifits;
        code = builder.code;
        name = builder.name;
        description = builder.description;
    }

    public static class Builder{
        private BenifitsMongo benifits;
        private int code;
        private String id;
        private String name;
        private String description;

        public Builder(int code){
            this.code = code;
        }

        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name ;
            return this;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder benifits(BenifitsMongo benifits){
            this.benifits = benifits;
            return this;
        }

        public PositionMongo build( ){
            return new PositionMongo(this);
        }
    }

    public String getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public BenifitsMongo getBenifits() {
        return benifits;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

