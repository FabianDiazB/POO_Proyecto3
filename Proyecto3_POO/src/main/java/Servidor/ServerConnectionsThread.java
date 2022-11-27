/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class ServerConnectionsThread extends Thread{
    boolean isRunning = true;
    Servidor server;

    public ServerConnectionsThread(Servidor server) {
        this.server = server;
    }
    
    public void run(){
        
        while (isRunning) {
            try {
                server.pantalla.write("Esperando jugador ... ");
                
                Socket socket = server.server.accept();
                ThreadServidor ts = new ThreadServidor(socket, server);
                ts.start();
                server.jugadoresAceptados.add(ts);
                
                server.pantalla.write("Jugador conectado");
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        if(this.server.isIniciada()){
                try {
                    System.out.println("iniciadaaaaaa");
                    this.server.iniciarPartida();
                } catch (IOException ex) {
                    Logger.getLogger(ServerConnectionsThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
}
