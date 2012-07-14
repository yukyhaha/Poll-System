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

public interface PollServerInterface extends Remote{

    public void ReceiveCounts(int yes, int no, int nocare) throws RemoteException;
    public int[] RequestVote( ) throws RemoteException;
    public void addCallback(VoteCallbackInterface client)
    throws java.rmi.RemoteException;


}
