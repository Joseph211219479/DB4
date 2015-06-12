/*
package jjzee.domain.mongo;

import jjzee.domain.User;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Id;

*/
/**
 * Created by j on 2015/06/08.
 *//*

@Document
public class UserMongo {
    @Id
    private String id;

    @Column(unique = true)
    private int code;
    private String name;
    private String username;
    private String password;

    private UserMongo(){}

    public UserMongo(Builder builder){
        id = builder.id;
        code = builder.code;
        name= builder.name;
        username= builder.username;
        password = builder.password;
    }

    public static class Builder{
        private String id;
        private int code;

        private String name;
        private String username;
        private String password;

        public Builder(int code){
            this.code= code;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return  this;
        }

        public Builder copy(User user){
            this.name= user.getName();
            this.code = user.getCode();
            this.username = user.getUsername();
            this.password= user.getPassword();
            return this;
        }

        public UserMongo build(){
            return new UserMongo(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getCode() {
        return code;
    }
}
*/