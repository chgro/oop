/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.teko.grossmac.WAP2;

import java.security.Principal;
import org.apache.catalina.Wrapper;
import org.apache.catalina.realm.RealmBase;

/**
 *
 * @author chg
 */
public class MyRealm extends RealmBase{

    @Override
    protected String getName() {
        return "Not supported yet";
    }

    @Override
    protected String getPassword(String string) {
        return "geheim";
    }

    @Override
    protected Principal getPrincipal(String user) {
        return new Principal() {
            @Override
            public String getName() {
                return user;
            }
        };
    }

    @Override
    public boolean hasRole(Wrapper wrapper, Principal principal, String role) {
        
        return true;
    }
    
    
    
}
