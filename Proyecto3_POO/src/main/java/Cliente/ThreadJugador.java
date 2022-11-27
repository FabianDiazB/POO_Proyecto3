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
    private Jugador player;
    private ObjectInputStream entrada;
    private DataInputStream entradaDatos;

    public ThreadJugador(Socket socket, Jugador player) {
        try {
            this.socket = socket;
            this.player = player;
            entrada = new ObjectInputStream(socket.getInputStream());
            entradaDatos = new DataInputStream(socket.getInputStream());

        } catch (IOException ex) {
            //Logger.getLogger(ThreadCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("errores");
        }
    }
    
    public void run(){
        while(isrunnig){
            System.out.println("entrando al hilo de ThreadJugador::::");
            try {
                System.out.println(entradaDatos.readUTF());
            } catch (Exception e) {
            }
        }
    }
    
    
    
    
    
}
