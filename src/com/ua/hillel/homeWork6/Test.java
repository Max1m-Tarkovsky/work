package com.ua.hillel.homeWork6;

public class Test {
    public static void main(String[] args) {


        Animals animals = new Animals(0, 0, 0, "0");
        Crocodile crocodile = new Crocodile(1, 12, 186, "Green", true);
        Dog dog = new Dog(2, 9, 7, "Black", "Bars", true);
        Fish fish = new Fish(3, 1, 1, "Gold", "Maria", false);
        Giraffe giraffe = new Giraffe(4, 5, 145, "Black and yellow", false);
        GuideDog guideDog = new GuideDog(5, 3, 8.3, "White ", "Helper ", true, true);
        Hamster hamster = new Hamster(6, 4, 0.2, "Brown", "Pig", false);
        Kat kat = new Kat(7, 3, 3.4, "black", "Tom", true);
        Lion lion = new Lion(8, 4, 145, "Orange ", true);
        Wolf wolf = new Wolf(9, 6, 87, "Grey", true);

        System.out.println(dog.voice());
        System.out.println(crocodile.voice());
        System.out.println(fish.voice());
        System.out.println(giraffe.voice());
        System.out.println(guideDog.voice());
        System.out.println(hamster.voice());
        System.out.println(kat.voice());
        System.out.println(lion.voice());
        System.out.println(wolf.voice());
        System.out.println(dog.isVaccinated());
        System.out.println(dog.lovePeople());
        System.out.println(wolf.getWeight());
        System.out.println(giraffe.lovePeople());
        System.out.println(dog.lovePeople());
        System.out.println(wolf.lovePeople());


    }
}
