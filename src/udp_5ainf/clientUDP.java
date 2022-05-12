/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package udp_5ainf;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class clientUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException {
        // TODO code application logic here
        
        int porta = 2000;
        
        DatagramSocket ds;
        DatagramPacket dpi; //input
        DatagramPacket dpo; //output
        
        
        byte[] buffer;
        String msgIn, msgOut;
        
        msgOut = "Ciao server mi dici la data?";
        
        try {
            InetAddress srvAdd = InetAddress.getLocalHost();
            ds = new DatagramSocket();
            dpo = new DatagramPacket(msgOut.getBytes(), msgOut.length(), srvAdd, porta);
            try {
                ds.send(dpo);
            } catch (IOException ex) {
                Logger.getLogger(clientUDP.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(clientUDP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
