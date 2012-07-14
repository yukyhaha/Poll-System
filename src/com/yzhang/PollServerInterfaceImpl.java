/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yzhang;

/**
 *
 * @author yunzhang
 */

import java.rmi.*;
import java.rmi.server.*;

public class PollServerInterfaceImpl extends UnicastRemoteObject implements PollServerInterface,Remote{

// private PollServerInterface poll;
 private static int Pyes=0, Pno=0, Pnocare=0;
 //static int RMIPort;
 //private static Vector callbackObjects;
 private VoteCallbackInterface Pclient = null;
 
 public PollServerInterfaceImpl() throws RemoteException {
      
     super();
      // instantiate a Vector object for storing callback objects
      //callbackObjects = new Vector();
    }
 /*public PollServerInterfaceImpl(int port) throws RemoteException {
      
     super(port);
      // instantiate a Vector object for storing callback objects
      //callbackObjects = new Vector();
    }
 
*/
  
 
// method for client to call to add itself to its callback
  // public void addCallback(  VoteCallbackInterface CallbackObject) {
       // store the callback object into the vector
    //   System.out.println("Server got an 'addCallback' call.");
       //callbackObjects.addElement (CallbackObject);

    //} 


public void ReceiveCounts(int yes, int no, int nocare) throws RemoteException
    {
       if(yes==1)
           Pyes++;
       else if(no==1)
           Pno++;
       else if(nocare==1)
           Pnocare++;
       
        if ((Pyes%10)==0)
        Pclient.callVotes(Pyes);
    }


public void addCallback(VoteCallbackInterface client) {
	 this.Pclient=client;
     System.out.println("Server got an 'addCallback' call.");
     
}
 
 

public int[] RequestVote() throws RemoteException
    {
         int a[] = new int[3];
         a[0]=Pyes;
         a[1]=Pno;
         a[2]=Pnocare;
         return a;

     }



}
