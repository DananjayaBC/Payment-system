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
class chanu {
     private String firstname,lastname,title,nic,phonenumber,email,qulification;
    private int no;
    
     public chanu(int no,String firstname,String lastname,String nic,String phonenumber,String email,String qulification)
    {
       this.no=no;
         this.firstname=firstname;
         this.lastname=lastname;
         
         
         this.nic=nic;
         this.phonenumber=phonenumber;
         this.email=email;
         this.qulification=qulification;
         
    }
    public int getno()
    {
       return no;
    }
     public String getname()
    {
       return firstname;
    }
     public String getlname()
    {
       return lastname;
    }
     public String gettitle()
    {
       return title;
    }
    public String getnic()
    {
       return nic;
    }
    public String getphone()
    {
       return phonenumber;
    }
    public String getemail()
    {
       return email;
    }
    public String getqulification()
    {
       return qulification;
    }
    
    
}
