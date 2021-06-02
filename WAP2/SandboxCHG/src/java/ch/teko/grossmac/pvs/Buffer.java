/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.teko.grossmac.pvs;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chg
 */
public class Buffer<T> {

    public final static int SIZE = 4; //Grösse der Queue

    private final T[] buffer = (T[]) new Object[SIZE];

    private Integer in = 0; // Position zum EInfügen.
    private Integer out = 0; // Position zur Ausgabe.

    public synchronized void put(T data) {
        while (full()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                // TODO
            }
        }

        buffer[in] = data;
        in = (in + 1) % SIZE;

        notifyAll();

    }

    public synchronized T get() {
        T data;

        while (empty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                // TODO
            }
        }

        data = buffer[out];
        out = (out + 1) % SIZE;

        notifyAll();

        return data;
    }

    public synchronized boolean empty() {
        return in == out;
    }

    public synchronized boolean full() {
        return (in + 1) % SIZE == out;
    }

}
