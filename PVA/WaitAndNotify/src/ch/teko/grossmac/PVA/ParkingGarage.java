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
public class ParkingGarage {

    private int places; //Anzahl freier Plätze

    public ParkingGarage(int places) {
        if (places < 0) {
            throw new IllegalArgumentException("Parameter < 0");
        }
        this.places = places;
    }

    public synchronized void enter() {

        while (places == 0) {
            places--;
        }

    }

    public synchronized void leave() {

        places++;

    }

}
