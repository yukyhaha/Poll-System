/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yzhang;

/**
 *
 * @author yunzhang
 */
import java.rmi.registry.*;
import java.rmi.*;

public class RegisterWithRMIServer implements Remote {

    public static void main(String[] args)
    {
        try{
           PollServerInterface obj=
                   new PollServerInterfaceImpl();
           Registry registry =LocateRegistry.getRegistry();
           registry.rebind("PollServerInterfaceImpl", obj);
           System.out.println("poll server"+obj+"registered");
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }


    }
}
