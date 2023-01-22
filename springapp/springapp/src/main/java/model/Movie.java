package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id 
    private int mid;
    private String mname;
    
    public int getMid(){
        return this.mid;
    }

    public void setMid(int mid){
        this.mid = mid;
    }

    public String getMname(){
        return this.mname;
    }

    public void setMname(String mname){
        this.mname = mname;
    }
}