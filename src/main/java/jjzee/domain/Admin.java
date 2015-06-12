/*
package jjzee.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

*/
/**
 * Created by j on 2015/06/08.
 *//*

@Entity
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private int code;

    private String position;

public Admin(){}

    public Admin(Builder builder){
        id = builder.id;
        code = builder.code;
        position = builder.position;

    }

    public static class Builder{
        private Long id;
        private int code;
        private String position;


        public Builder(int code){
            this.code= code;
        }


        public Builder copy(Admin user){
            this.code = user.getCode();
            this.id = user.getId();
            this.position = user.getPosition();
            return this;
        }

        public Admin build(){
            return new Admin(this);
        }
    }

    public Long getId() {
        return id;
    }
    public int getCode() {
        return code;
    }
    public String getPosition(){return position;}


}
*/
