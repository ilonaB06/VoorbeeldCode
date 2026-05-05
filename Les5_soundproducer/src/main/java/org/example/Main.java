package org.example;

public class Main {

    public static void main(String[] args) {
        /*
        SoundProducer producer = new SoundProducer();
        Human mens = new Human();
        Kat kat = new Kat();
        Hond hond = new Hond();

        producer.makeSound();
        mens.makeSound();
        kat.makeSound();
        hond.makeSound();

        System.out.println("Opnieuw: ");

         */
        
        SoundProducer[] producers = new SoundProducer[]{
                new SoundProducer(),
                new Hond(),
                new Human(),
                new Kat(),
                new Vogel()
        };

        int i = 0;
        for(SoundProducer p: producers){
            i++;
            System.out.println(i + " ");
            p.makeSound();
        }
    }
}