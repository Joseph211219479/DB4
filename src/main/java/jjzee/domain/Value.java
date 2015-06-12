package jjzee.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by j on 2015/06/12.
 */
@Entity
public class Value implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private int code;
    private String description;

    private Value(){}

    public Value(Builder builder){
        id = builder.id;
        code = builder.code;
        description = builder.description;
    }

    public static class Builder{
        private int code;
        private String description;
        private Long id;

        public Builder(int code){
            this.code = code;
        }
        public  Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Value build(){
            return new Value(this);
        }
    }

    public Long getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;

        Value value = (Value) o;

        if (!id.equals(value.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
