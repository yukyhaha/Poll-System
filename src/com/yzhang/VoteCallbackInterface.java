/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yzhang;

/**
 *
 * @author anly
 */
public interface VoteCallbackInterface extends java.rmi.Remote
{
    public void callVotes (int yes) throws java.rmi.RemoteException;

}
