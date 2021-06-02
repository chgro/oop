/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.teko.grossmac.PVA;

/**
 *
 * @author chg
 */
public class Main extends Thread{
    
    public static void main(String[] args) {
        
        Main t = new Main();
        t.start(); // Hier wird ein neuer Thread erzeugt.
    }
    
    @Override
    public void run() {
        System.out.println("Hallo Welt!");
    }
}
