package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id 
    private int cid;
    private String cname;

    public int getCid(){
        return this.cid;
    }

    public void setCid(int cid){
        this.cid = cid;
    }

    public String getCname(){
        return this.cname;
    }

    public void setCname(String cname){
        this.cname = cname;
    }
}