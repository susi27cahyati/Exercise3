package com.enigma.model;

    public class Programmer extends Employee {

        Integer bonus;

        public Programmer(Integer salary, Integer healthBenefits, Integer bonus) {
            super(salary, healthBenefits);
            this.bonus = bonus;

        }

        public void getSalery(Integer salery, Integer healthBenefits, Integer bonus) {
            this.salary = salery;
            this.healthBenefits = healthBenefits;
            this.bonus = bonus;

        }
        public Integer netSalery(){
            return (this.salary+this.healthBenefits+this.bonus);
        }

        public String print() {
            return "Programmer{" +
                    "bonus=" + bonus +
                    "Tunjangan kesehatan=" + healthBenefits +
                    "gaji bersih=" + netSalery() +
                    '}';
        }
    }

