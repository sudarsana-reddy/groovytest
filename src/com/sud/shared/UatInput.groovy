package com.sud.shared

public class UatInput {
    def isUat(){
        String environment = System.getProperty("env", "UAT");
        return  environment.equalsIgnoreCase("UAT");
    }

    static void main(String[] args){
        def uat = new UatInput().isUat();
        println(uat);
    }
}
