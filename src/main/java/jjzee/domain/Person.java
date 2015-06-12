package jjzee.domain;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by j on 2015/06/12.
 */

@Entity
public class Person implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private int code;

    @OneToOne(fetch = FetchType.EAGER)
    private Position position;

    private String name;
    private String password;
    private Person(){}

    public Person(Builder builder){
        name = builder.name;
        password = builder.password;
        position = builder.position;
        code = builder.code;
    }

    public static class Builder{
        private Position position;
        private int code;
        private Long id;
        private String name;
        private String password;

      public Builder(int code){
            this.code = code;
        }

        public Builder position(Position position){
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
        public  Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder copy(Person person){
            this.code = person.getCode();
            this.id = person.getId();
            return  this;
        }
        public Person build(){
            return new Person(this);
        }
    }

    public Long getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

