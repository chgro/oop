/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.teko.grossmac.wap2;

import java.io.Serializable;

/**
 *
 * @author chg
 */
public class Demo01 implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    private transient String password;

    public Demo01() {
    }

    public Demo01(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    
    
   
    
}
