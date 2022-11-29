/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import Cliente.Jugador;
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
public class ThreadServidor extends Thread{
    public Socket socket;
    private Servidor server;
    private ObjectInputStream entrada;
    private DataInputStream entradaDatos;
    public ObjectOutputStream salida;
    public Jugador jugadorAsignado;
    public String nombre = "";
    
    private boolean isRunning = true;

    public ThreadServidor(Socket socket, Servidor server) {
        this.socket = socket;
        this.server = server;
        try {
            entrada = new ObjectInputStream(socket.getInputStream());
            salida = new ObjectOutputStream(socket.getOutputStream());
            entradaDatos = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            
        }
    }
    
    public Jugador getJugadorThread(){
        return this.jugadorAsignado;
    }

    @Override
    public void run() {
        try {
            nombre = entradaDatos.readUTF(); // lee el nombre
        } catch (IOException ex) {
            
        }
        server.pantalla.write("Jugador:: " + nombre + " ::conectado");
        try {
            jugadorAsignado = (Jugador)entrada.readObject();
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nombre obtenido;");
        System.out.println(jugadorAsignado.getNombre());
        
        //recibe la info
        

    }
    
    
    
    
}
