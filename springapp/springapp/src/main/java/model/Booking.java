package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
      @Id 
    //   @GeneratedValue(strategy = GenerationType.AUTO)
    //   int id;
      int cid;
      int mid;
      
    
    // public int getId(){
    //     return this.id;
    // }

    // public void setId(int id){
    //     this.id = id;
    // }
    
    public int getCid(){
        return this.cid;
    }

    public void setCid(int cid){
        this.cid = cid;
    }


    public int getMid(){
        return this.mid;
    }

    public void setMid(int mid){
        this.mid = mid;
    }


}