package src.runner;

import src.task2.ConvertToFarengeit;
import src.task2.ConvertToKelvin;
import src.task3.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Runner {
    public static void main(String[] args) {

        // TASK 2:
        System.out.println("TASK 2:");
        System.out.println("Enter your double Celsius value:");
        Scanner sc = new Scanner(System.in);
        double yourValue = sc.nextDouble();

        ConvertToKelvin convertToKelvin = new ConvertToKelvin();
        convertToKelvin.convertToKelvin(yourValue);

        ConvertToFarengeit convertToFarengeit = new ConvertToFarengeit();
        convertToFarengeit.convertToFarengeit(yourValue);
        System.out.println("\n");

        //TASK 3:
        System.out.println("TASK 3:");

        Tihanovskaya tihanovskaya = new Tihanovskaya();
        Babariko babariko = new Babariko();
        Cepkalo cepkalo = new Cepkalo();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Izbirateli.voices.length; i++) {
            System.out.println("Your number: " + (i + 1) + " Choose your candidate: " +
                    tihanovskaya.getNumber1() + " - " + tihanovskaya.getName1() + ";  " +
                    babariko.getNumber2() + " - " + babariko.getName2() + ";  " +
                    cepkalo.getNumber3() + " - " + cepkalo.getName3());
            Izbirateli.voices[i] = scanner.nextInt();
        }
        Admin.countTheVotes();
    }
}
