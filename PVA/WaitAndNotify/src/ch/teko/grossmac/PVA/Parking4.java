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
public class Parking4 {

    public static void main(String[] args) {
        ParkingGarage4 garage = new ParkingGarage4(10);
        for (int i = 1; i <= 40; i++) {
            new Car4("Auto " + i, garage);
        }
    }

}
