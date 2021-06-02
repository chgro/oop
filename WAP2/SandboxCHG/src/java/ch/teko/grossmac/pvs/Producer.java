/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.teko.grossmac.pvs;

/**
 *
 * @author chg
 */
public class Producer {
    
    private final Buffer<Data> buffer;
    
    public Producer(Buffer<Data> buffer){
        this.buffer = buffer;
    }
    
}
