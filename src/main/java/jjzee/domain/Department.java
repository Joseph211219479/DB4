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
public class Department implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private int code;
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    List<Admin> adminList ;

    @OneToMany(fetch = FetchType.EAGER)
    List<User> userList;

    public Department(){}

    public Department(Builder builder){
        id = builder.id;
        code = builder.code;
        name= builder.name;
        adminList = builder.adminList;
        userList = builder.userList;
    }

    public static class Builder{
        private Long id;
        private int code;
        private List<Admin> adminList ;
        private  List<User> userList;
        private String name;

        public Builder(int code){
            this.code= code;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder userList( List<User> userList)
        {
            this.userList = userList;
            return this;
        }
        public  Builder adminList(List<Admin> adminList)
        {
            this.adminList= adminList;
            return this;
        }


        public Builder copy(Department user){
            this.name= user.getName();
            this.code = user.getCode();
            this.id = user.getId();
            this.adminList = user.getAdminList();
            this.userList = user.getUserList();
            return this;
        }

        public Department build(){
            return new Department(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public int getCode() {
        return code;
    }



}
*/
