package com.enigma.model;

public class Employee {
    public Integer salary;
    public Integer healthBenefits;
    public Integer netSalery;

    public Employee(Integer salary, Integer healthBenefits){
        this.healthBenefits=healthBenefits;
        this.salary=salary;
    }
    public void getSalery(Integer salery, Integer healthBenefits) {
        this.salary = salery;
        this.healthBenefits = healthBenefits;

    }
    public Integer netSalery(){
        return (this.salary+this.healthBenefits);
    }


    public String print() {
        return "Employee{" +
                "salary=" + salary +
                ", healthBenefits=" + healthBenefits +
                ", netSalery=" + netSalery() +
                '}';
    }
}
