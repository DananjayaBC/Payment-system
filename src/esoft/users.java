/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esoft;

/**
 *
 * @author USER
 */
class users {
    
      private String name,fee,duration,lectures,details;
    private int no;
    
    public users(int no,String name,String fee,String duration,String lectures,String details)
    {
       
         this.name=name;
         this.duration=duration;
         this.no=no;
         
         this.lectures=lectures;
         this.details=details;
         this.fee=fee;
    }
    public int getno()
    {
       return no;
    }
   
     public String getname()
    {
         return name;
    }
  
    
         public String getfee()
    {
         return fee;
    }
          
         public String getduration()
    {
         return duration;
    }
          
         public String getlectures()
    {
         return lectures;
    }
          
         public String getdetail()
    {
         return details;
    }
    
}
