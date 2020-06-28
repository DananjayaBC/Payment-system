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
public class dana {
     private String fname,lname,title,nic,phone,email,qulification;
    private int no;
    
     public dana(int no,String fname,String lname,String nic,String phone,String email,String qulification)
    {
       
         this.fname=fname;
         this.lname=lname;
         this.no=no;
         
         this.nic=nic;
         this.phone=phone;
         this.email=email;
         this.qulification=qulification;
         
    }
    public int getno()
    {
       return no;
    }
     public String getfname()
    {
       return fname;
    }
     public String getlname()
    {
       return lname;
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
       return phone;
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
