/*
package jjzee.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

*/
/**
 * Created by j on 2015/06/07.
 *//*

@Entity
public class SqlDatabase implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private int code;

    private String adress;
    private String port;
    private String databaseName;
    private int amountOfRows;
    private String totalDataSize;
   // private List<String> tableNames;

    private SqlDatabase(){}

    public SqlDatabase(Builder builder){
        id = builder.id;
        code = builder.code;
        adress = builder.adress;
        port = builder.port;
        databaseName = builder.databaseName;
        amountOfRows = builder.amountOfRows;
        totalDataSize = builder.totalDataSize;
       // tableNames = builder.tableNames;
    }

    public static class Builder{

        private Long id;
        private int code;
        private String adress;
        private String port;
        private String databaseName;
        private List<String> tableNames;
        private int amountOfRows;
        private String totalDataSize;

        public Builder(int code){this.code = code;}

        public Builder id(Long id){
            this.id=id;
            return this;
        }
        public Builder tableNames(List<String> tableNames){
            this.tableNames = tableNames;
            return this;
        }

        public Builder adress(String address){
            this.adress = address;
            return this;
        }
        public Builder port(String port){
            this.port = port;
            return this;
        }
        public Builder databaseName(String databaseName){
            this.databaseName = databaseName;
            return this;
        }
        public Builder rowCount(int amountOfRows){
            this.amountOfRows = amountOfRows;
            return this;
        }
        public Builder totalDataSize(String totalDataSize){
            this.totalDataSize = totalDataSize;
            return  this;
        }

        public Builder copy(SqlDatabase sqlDatabase){
            id = sqlDatabase.getId();
            code = sqlDatabase.getCode();
           // tableNames = sqlDatabase.getTableNames();
            adress = sqlDatabase.getAdress();
            port =sqlDatabase.getPort();
            databaseName = sqlDatabase.getDatabaseName();
            //still need extras
            return  this;
        }

        public SqlDatabase builder(){
            return new SqlDatabase(this);
        }

    }

    public Long getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getAdress() {
        return adress;
    }

    public String getPort() {
        return port;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public int getAmountOfRows() {
        return amountOfRows;
    }

    public String getTotalDataSize() {
        return totalDataSize;
    }

   // public List<String> getTableNames() {
//        return tableNames;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqlDatabase that = (SqlDatabase) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
*/
