package com.workintech.employeeApp.model;
import java.util.Arrays;
public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    //Constructor
    public Company(int id,String name,double giro,String[] developerNames){

        this.id = id;
        this.name = name;
        checkGiro(giro);

        this.developerNames = developerNames;

    }

    // giro 0 dan küçük olamaz method
    public void checkGiro(double giro){
        if(giro<0){
            this.giro = 0;
        }else{
            this.giro = giro ;
        }
    }

    //setter&getter methods

    //setter&getter method(id)
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    //setter&getter method(name)
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name =name ;
    }


    //setter&getter method(giro)
    public double getGiro(){
        return giro;
    }

    public void setGiro(double giro){
        this.giro = giro;
    }


    //setter&getter method(developerNames)
    public String[] getDeveloperNames(){
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames){
        this.developerNames = developerNames;
    }


    //addEmployee method

    public void addEmployee(int index,String name){
        try{
            if(developerNames[index]==null){
                developerNames[index]=name;
            }else{
                System.out.println("Index dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama yapıldı");
        }
    }
    public String toString(){
        return "Name: " + name + " Giro: " + giro + " Developers: " + Arrays.toString(developerNames);
    }


}
