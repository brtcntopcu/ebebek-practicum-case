package org.example;

public class Employee {

    private String name;
    private float salary;
    private float workHours;
    private float hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public float tax() {
        if (salary < 1000 ){
            return 0;
        }
        return (salary*3)/100;
    }

    public float bonus() {
        if (workHours < 40) {
            return 0;
        }
        return (workHours - 40) * 30;
    }

    public float raiseSalary() {
        float workedYear = 2021 - hireYear;
        if ( workedYear > 9 && workedYear < 20 ) {
            return (salary * 10) / 100;
        } else if (workedYear < 10) {
            return (salary * 5) / 100;
        }
        return (salary * 15) / 100;
    }

    public String toString() {

        return
         "Adı : " + name + "\r\n" +
        "Maaşı : " + salary + "\r\n" +
        "Çalışma Saati : " + workHours + "\r\n" +
        "Başlangıç Yılı : " + hireYear + "\r\n" +
        "Vergi : " + tax() + "\r\n" +
        "Bonus : " + bonus() + "\r\n" +
        "Maaş Artışı : " + raiseSalary() + "\r\n" +
        "Vergi ve Bonuslar ile birlikte maaş :" + (salary - tax() + bonus()) + "\r\n" +
        "Toplam Maaş :" + (salary - tax() + bonus() + raiseSalary());
    }

}
