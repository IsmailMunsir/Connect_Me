/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

/**
 *
 * @author tmysa
 */
public class User {
    private String name;
    private String email;
    
    
    
    public String getName(){
        return this.name;
    };
    
    public void setName(String name){
        this.name= name;
    };
    
    public void setEmail(String email){
        if (email.contains("@")){
            this.email = email;
        }
        else{
            this.email=("");
        };
    };
}