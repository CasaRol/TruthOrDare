/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthordare;

import java.util.Scanner;

/**
 *
 * @author CasaRol
 */
public class TruthOrDare {

    public static void main(String[] args) {
        // TODO code application logic here
        LoadDocuments ld = new LoadDocuments();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("TRUTH AND DARE - THE GAME!\n");
        System.out.println("Type in console either 1 for truth or 2 for dare");
        
        while(true) {
        switch(scan.nextInt()) {
            case 1:
                System.out.println("TRUTH: " + ld.getRandomTruth());
                break;
            case 2:
                System.out.println("DARE: " + ld.getRandomDare());
                break;
            case 99:
                System.exit(0);
        }
        }
   }
    
}
