package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.Student.removeFirstChar;

public class Main {
    public static void main(String[] args) {

        //Задача 1.
     List<String> names = Arrays.asList("Maksim", "Andrei", "Vasiliy");

     List<String> modifiedNames = names.stream()
             .map(name -> name.substring(1))
             .sorted().collect(Collectors.toList());

        System.out.println(modifiedNames);








    }

}