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
public class ParkingGarage2 {

    private int places; //Anzahl freier Plätze

    public ParkingGarage2(int places) {
        if (places < 0) {
            throw new IllegalArgumentException("Parameter < 0");
        }
        this.places = places;
    }

    private synchronized boolean isFull() {
        return (places == 0);
    }

    private synchronized void decrementPlaces() {
        places--;
    }

    public void enter() {

        while (isFull());

        decrementPlaces();
    }

    public synchronized void leave() {
        places++;
    }

}
