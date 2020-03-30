package com.ania;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    ////////////Person class

    public static void main(String[] args) {

        class Person{
            private int id;
            private String name;

            public Person(int id, String name){
                this.id = id;
                this.name = name;
            }

            public int getId(){
                return id;
            }

            public void setId(int id){
                this.id = id;
            }

            public String getName(){
                return name;
            }

            public void setName(String name){
                this.name = name;
            }

            public String toString(){
                return name;
            }
        }

        /////////////Array List //////////////////////

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        //Adding
        numeros.add(10);
        numeros.add(100);

        //Retrieving
        System.out.println(numeros.get(0));

        //Indexed for loop iteration
        for(int i=0; i< numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        for(Integer value : numeros){
            System.out.println(value);
        }

        /////////// Sorting lists //////////////////
        //////String list

        class StringLengthComparator implements Comparator<String> {

            public int compare(String s1, String s2){

                int len1 = s1.length();
                int len2 = s2.length();

                if(len1 > len2){
                    return 1;
                }
                else if(len1 < len2){
                    return -1;
                }

                return 0;
            }
        }

        class AlphabeticalComparator implements Comparator<String> {

            public int compare(String s1, String s2){

                return s1.compareTo(s2);
            }
        }

        class ReverseAlphabeticalComparator implements Comparator<String> {

            public int compare(String s1, String s2){

                return -s1.compareTo(s2);
            }
        }

        List<String> animals = new ArrayList<String>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        // String Length compare
        // Collections.sort(animals, new StringLengthComparator());

        Collections.sort(animals, new AlphabeticalComparator());

        System.out.println("Sorted animals:");
        for (String animal : animals){
            System.out.println(animal);
        }

        /////Integer list
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        Collections.sort(numbers);

        System.out.println("Sorted numbers:");
        for(Integer number : numbers){
            System.out.println(number);
        }

        Collections.sort(numbers, new Comparator<Integer>() {

            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        System.out.println("Reverse sorted numbers:");
        for(Integer number : numbers){
            System.out.println(number);
        }

        ////// Sorting arbitrary objects

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(1, "Joe"));
        people.add(new Person(2, "Bob"));
        people.add(new Person(3, "Clare"));
        people.add(new Person(4, "Sue"));

        Collection.sort(people);

        for(Person person : people){
            System.out.println(person);
        }


    }
}
