package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static class Cat{
        private String name;
        public Cat(String name){
            this.name = name;
        }
        public static Set<Cat> createCats(){
            Set<Cat> cats = new HashSet<>();
           cats.add(new Cat("Tolik"));
           cats.add(new Cat("Vasya"));
           cats.add(new Cat("Borik"));
           cats.add(new Cat("Marusya"));
           return cats;
        }
    }

    public static class Dog{
        private String name;
        public Dog(String name){
            this.name = name;
        }
        public static Set<Dog> createDogs(){
            Set<Dog> dogs = new HashSet<>();
            dogs.add(new Dog("Bobik"));
            dogs.add(new Dog("Booza"));
            dogs.add(new Dog("Layka"));
            dogs.add(new Dog("Vanda"));
            return dogs;
        }

    }

    public static Set<Object> join(Set<Dog>dogs, Set<Cat>cats){
        Set<Object> joined = new HashSet<>();
      joined.addAll(dogs);
      joined.addAll(cats);
        return joined;
    }
    public static Set<Object> removeCats(Set<Object> pets){
        Iterator<Object> iterator = pets.iterator();
        while(iterator.hasNext()){
            if(iterator.next() instanceof Cat)
                iterator.remove();
        }
        return pets;
    }

    public static void print (Set pets){
        for(Object o: pets){
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        Set<Cat> newCats = new HashSet<>();
        print(removeCats(join(Dog.createDogs(), Cat.createCats())));
    }
}
