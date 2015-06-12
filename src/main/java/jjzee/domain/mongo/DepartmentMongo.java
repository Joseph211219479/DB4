/*
package jjzee.domain.mongo;

import jjzee.domain.Admin;
import jjzee.domain.User;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import javax.swing.*;
import java.util.List;

*/
/**
 * Created by j on 2015/06/08.
 *//*

@Document
public class DepartmentMongo {
    @Id
    private String id;

    @Column(unique = true)
    private int code;
    private String name;

    @DBRef
    List<Admin> adminList ;

    @DBRef
    List<User> userList;

    public DepartmentMongo(){}

    public DepartmentMongo(Builder builder){
        id = builder.id;
        code = builder.code;
        name= builder.name;
        adminList = builder.adminList;
        userList = builder.userList;
    }

    public static class Builder{
        private String id;
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
        public Builder id(String id){
            this.id = id;
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


        public Builder copy(DepartmentMongo user){
            this.name= user.getName();
            this.code = user.getCode();
            this.id = user.getId();
            this.adminList = user.getAdminList();
            this.userList = user.getUserList();
            return this;
        }

        public DepartmentMongo build(){
            return new DepartmentMongo(this);
        }
    }

    public String getId() {
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
