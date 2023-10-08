package Fundamentals;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Employee e = new Employee("Jhon-Rhey", "Mejos", "Digital Artist", "Mars", "Male", 22);
        Employee e1 = new Employee("Straw Hat", "Luffey", "Pirate King");
        Employee e2 = new Employee();
        
        System.out.println("e2.firstname");
        
        Person p = new Person();
        Toddler t = new Toddler("Jhon-Rhey", "Male", 22);
        Kid k = new Kid("Jhon-Rhey", "Male", 22);
        
        p.name = "Roronoa Zoro";
        p.sex = "Male";
        p.age = 17;
        
        t.name = "Nico Robin";
        t.sex = "Female";
        t.age = 19;
        
        p.checkStatus();
        t.checkStatus();
        
        p.drink();
        t.drink();
        
        Dog d = new Dog();
        Cat c = new Cat();
        
        d.makeSound();
        c.makeSound();
        
        Animal a = new Dog();
        Animal b = new Cat();
        
        a.makeSound();
        b.makeSound();
        
        Enemy we = new WeakEnemy();
        Enemy se = new StrongEnemy();
        
        we.dialog();
        se.dialog();
        
        we.showStats();
        se.showStats();
        
    }
    
}
