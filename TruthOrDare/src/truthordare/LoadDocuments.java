/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthordare;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CasaRol
 */
public class LoadDocuments {
        ArrayList<String> truths = new ArrayList<>();
        ArrayList<String> dares = new ArrayList<>();

    public LoadDocuments() {
        LoadTruths();
        LoadDares();
    }
        
        
    
    private void LoadTruths() {
        try(Scanner scan = new Scanner(new File("./assets/truth.txt"))) {
            while(scan.hasNextLine()) {
                truths.add(scan.nextLine());
            }
        } catch(FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
    }
    
    private void LoadDares() {
        try(Scanner scan = new Scanner(new File("./assets/dare.txt"))) {
            while(scan.hasNextLine()) {
                dares.add(scan.nextLine());
            }
            
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
    }
    
    public String getRandomTruth(){
        Random rand = new Random();
        return truths.get(rand.nextInt(truths.size()));
    }
    
    public String getRandomDare() {
        Random rand = new Random();
        return dares.get(rand.nextInt(dares.size()));        
    }
}


