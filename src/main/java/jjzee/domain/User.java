/*
package jjzee.domain;

import javax.persistence.*;
import java.io.Serializable;

*/
/**
 * Created by j on 2015/05/11.
 *//*

@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private int code;
    private String name;
    private String username;
    private String password;

    private User(){}

    public User(Builder builder){
        id = builder.id;
        code = builder.code;
        name= builder.name;
        username= builder.username;
        password = builder.password;
    }

    public static class Builder{
        private Long id;
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

        public Builder copy(User user){
            this.name= user.getName();
            this.code = user.getCode();
            this.id = user.getId();
            this.username = user.getUsername();
            this.password= user.getPassword();
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public Long getId() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
*/
