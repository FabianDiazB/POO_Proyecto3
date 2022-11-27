/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import Servidor.Servidor;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class ThreadJugador extends Thread{
    boolean isrunnig = true;
    private Socket socket;
    private Jugador cliente;
    private ObjectInputStream entrada;

    public ThreadJugador(Socket socket, Jugador cliente) {
        try {
            this.socket = socket;
            this.cliente = cliente;
            entrada = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            //Logger.getLogger(ThreadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run(){
        
    }
    
    
    
    
    
}
