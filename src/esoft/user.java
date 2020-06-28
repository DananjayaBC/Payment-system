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
class user {
    
    
    private String name,semester,year,programe,fee,id;
    private int no;
    
    public user(int no,String id,String name,String programe,String year,String semester,String fee)
    {
         this.id=id;
         this.name=name;
         this.programe=programe;
         this.no=no;
         
         this.year=year;
         this.semester=semester;
         this.fee=fee;
    }
    public int getno()
    {
       return no;
    }
    public String getid(){
         return id;
    }
     public String getname(){
         return name;
    }
     public String getprograme(){
         return programe;
    }
       public String getyear(){
         return year;
    }   
       public String getsemester(){
         return semester;
        
    }
         public String getfee(){
         return fee;
    }
         
         
    
}
