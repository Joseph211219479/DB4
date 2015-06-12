package jjzee.domain;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by j on 2015/06/12.
 */

@Entity
public class Benifits implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private int code;

    private String discription;
    @OneToOne(fetch = FetchType.EAGER)
    private Value value;

    private Benifits(){}

    public Benifits(Builder builder){
        id = builder.id;
        code = builder.code;
        value = builder.value;
        discription = builder.discription;
    }

    public static class Builder{
        private Value value;
        private int code;
        private Long id;
        private String discription;

        public Builder(int code){
            this.code = code;
        }
        public Builder value(Value value){
            this.value = value;
            return this;
        }
        public Builder id(Long id){
            this.id = id;
            return this;
        }
        public Builder description(String description){
            this.discription = description;
            return this;
        }

        public Benifits build(){
            return new Benifits(this);
        }
    }

    public Long getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getDiscription() {
        return discription;
    }

    public Value getValue() {
        return value;
    }
}

