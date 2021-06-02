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
public class ParkingGarage3 {

    private int places; //Anzahl freier Plätze

    public ParkingGarage3(int places) {
        if (places < 0) {
            throw new IllegalArgumentException("Parameter < 0");
        }
        this.places = places;
    }

    public void enter() {
        while (!tryToEnter());
    }

    private synchronized boolean tryToEnter() {

        boolean success = false;
        if (places > 0) {

            places--;

            success = true;
        }
        return success;

    }

    public synchronized void leave() {
        places++;
    }

}
