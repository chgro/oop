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
public class Car4 extends Thread{

    private ParkingGarage4 garage;

    public Car4(String name, ParkingGarage4 garage) {

        super(name);

        this.garage = garage;

        start();
    }

    public void run() {

        while (true) {
            try {
                sleep((int) (Math.random() * 10000));
            } catch (InterruptedException e) {
            }
            synchronized(garage){
            garage.enter();
            System.out.println(getName() + ": eingefahren");            
            }
            try {
                sleep((int) (Math.random() * 20000));
            } catch (InterruptedException e) {
            }
            synchronized(garage){
            garage.leave();
            System.out.println(getName() + ": ausgefahren");
            }
        }

    }

}
