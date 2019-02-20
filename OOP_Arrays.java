package oop_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Compiler.command;
import java.util.Scanner;

public class OOP_Arrays {

    public static void main(String[] args) throws IOException {

        Auto[] auto = new Auto[11];
        
        auto[0] = new Auto();//muggel fangen nicht bei 0 an
        auto[1] = new Auto("Volkswagen", "Golf 1", false);
        auto[2] = new Auto("Mercedes", "AMG", false);
        auto[3] = new Auto("Fiat", "Punto", false);
        auto[4] = new Auto("BMW", "3er", false);
        auto[5] = new Auto("Tesla", "Modell3", false);
        auto[6] = new Auto("Opel", "Kadett", false);
        auto[7] = new Auto("Citroen", "C1", false);
        auto[8] = new Auto("Toyota", "1er", false);
        auto[9] = new Auto("Lada", "Niva", false);
        auto[10] = new Auto("Bugatti", "Veron", false);

        Scanner sc = new Scanner(System.in);

        while (true) {
                    try{
                        
        String  command = "clear"; //für macOS Terminal.  unter windows cls
         
        Process process  = Runtime.getRuntime().exec(command);  
        BufferedReader read= new BufferedReader (new InputStreamReader(process.getInputStream()));
        String s;
        
        while (( s=read.readLine())!=null)
        System.out.println(s);
        } 
        catch (IOException e1){
            System.out.println(e1);
        }
            System.out.println("Hersteller" + "\t\t\t" + "Modell" + "\tVerfügbar");
            System.out.println("=================================================");
            for (int i = 1; i < 11; i++) {
                System.out.print(auto[i].getHersteller() + "     \t\t\t" + auto[i].getModell() + "\t");
                if (auto[i].isVermietet() == false) {
                    System.out.println("   ✔");
                } else {
                    System.out.println("   ✖");
                }
            }
            //abtrennung und frage
            for (int i = 0; i < 49; i++) {
                System.out.print("-");
            }
            System.out.println("\nWelches auto soll Vermietet werden?\nSchreibe ");
            int z = sc.nextInt();
            auto[z].setVermietet(!auto[z].isVermietet()); //wenn nicht vermietet
        }

    }

}
