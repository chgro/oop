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
public class ParkingGarage4 {

    private int places;

    public ParkingGarage4(int places) {
        if (places < 0) {
            throw new IllegalArgumentException("Parameter < 0");
        }
        this.places = places;
    }

    public void enter() {

        while (places == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }

        }
        places--;
//          System.out.println(places);

    }

    public  void leave() {

        places++;
//          System.out.println(places);
        notify();
    }

}
