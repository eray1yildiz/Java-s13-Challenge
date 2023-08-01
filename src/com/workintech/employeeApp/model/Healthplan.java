package com.workintech.employeeApp.model;
import com.workintech.employeeApp.enums.Plan;
public class Healthplan {

    private int id;
    private String name;
    private Plan plan;

    //Constructor
    public Healthplan(int id, String name, Plan plan){
        this.id =id;
        this.name =name;
        this.plan =plan;
    }

    //getter&setter methods

    //getter&setter method(id)

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    //getter&setter method(name)

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name =name;
    }

    //getter&setter method(plan)
    public Plan plan(){
        return plan;
    }

    public void plan(Plan plan){
        this.plan =plan;
    }

    public String toString(){
        return "Health Plan = " + "Id: " + id + " Name: " + name + " Plan: " + plan;
    }






}
