package com.workintech.employeeApp.model;
import java.util.Arrays;
import com.workintech.employeeApp.enums.Plan;
public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    //Constructor
    public Employee(int id,String fullName,String email,String password,String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans =healthPlans;
    }

    //getter & setter method(id)
    public long getId(){
        return id;
    }

    public void setId(int id){
       this.id = id;
    }

    //getter & setter method(fullName)

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    //getter & setter method(email)

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //getter & setter method(password)

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //getter & setter method(healthPlans)

    public String[] getHealthPlans(){
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans){
        this.healthPlans =healthPlans;
    }

    // addHealthPlan method

    public void addHealthPlan(int index,String name){
        try{
            boolean isExist = false;
            for(String healthplan : healthPlans){
                if(healthplan.equals(name)){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                if(healthPlans[index]==null){
                    healthPlans[index]=name;

                } else {
                    System.out.println("Indexe atama yapılmış");
                }

            }else{
                System.out.println(name +"isimde plan mevcut");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan index için atama yapıldı");
        }
    }
    public String toString(){
        return  "Name-Surname: " + fullName + " Health Plans: " + Arrays.toString(healthPlans);
    }

}
