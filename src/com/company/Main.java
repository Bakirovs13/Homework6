package com.company;

public class Main {

    public static void main(String[] args) {
	// Homework 6
        //Создать базовый класс игрока (Player)
        //Унаследовать класс Boss от базового класса
        //Унаследовать класс Warrior от базового класса
        //Унаследовать класс Magical от базового класса
        //Унаследовать класс Mental от базового класса

        Boss boss = new Boss(700,50);
        Warrior warrior = new Warrior(400,25);
        Magical magical = new Magical(400,25);
        Mental mental = new Mental(400,25);
        System.out.println("Boss Health: " +boss.Health +";"+"(Damage):  "+boss.Damage);

        System.out.println("Warrior Health: " +warrior.Health +";"+"(Damage):  "+warrior.Damage);

        System.out.println("Magical Health: " +magical.Health +";"+"(Damage):"+magical.Damage);

        System.out.println("Mental Health: " +mental.Health +";"+"(Damage):"  +mental.Damage);
        System.out.println("________________________________");

        int fight= 0;
        while (fight<8){
            fight = fight+1;
            warrior.Health = warrior.Health - boss.Damage;
            System.out.println("Warrior Health: " +warrior.Health);

            magical.Health = magical.Health - boss.Damage;
            System.out.println("Magic Health:"  +magical.Health);
            mental.Health = mental.Health - boss.Damage;
            System.out.println("Mental Health:" +mental.Health);

            boss.Health = boss.Health - warrior.Damage;
            boss.Health = boss.Health - magical.Damage;
            boss.Health = boss.Health - mental.Damage;
            System.out.println("Boss Health: " + boss.Health);
            System.out.println("_________________________");

        }
        if (warrior.Health < 0 && magical.Health< 0&& mental.Health <0) {
            System.out.println("Boss won");
        } else {
            System.out.println("Hero won");

        }

    }
}
