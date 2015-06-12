package jjzee.domain;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by j on 2015/06/12.
 */

@Entity
public class Position implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private int code;

    @OneToOne(fetch = FetchType.EAGER)
    private Benifits benifits;

    private String name;
    private String description;

    private Position(){}

    public Position(Builder builder){
        id = builder.id;
        benifits = builder.benifits;
        code = builder.code;
        name = builder.name;
        description = builder.description;
    }

    public static class Builder{
        private Benifits benifits;
        private int code;
        private Long id;
        private String name;
        private String description;

        public Builder(int code){
            this.code = code;
        }

        public Builder id(Long id){
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
        public Builder benifits(Benifits benifits){
            this.benifits = benifits;
            return this;
        }

        public Position build(){
            return new Position(this);
        }
    }

    public Long getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public Benifits getBenifits() {
        return benifits;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

