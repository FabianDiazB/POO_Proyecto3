/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;
import Cliente.*;
import Juego.*;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    private final int PORT = 8084;
    ServerSocket server;
    private boolean iniciada;
    public PantallaServidor pantalla;
    
    ArrayList<ThreadServidor> jugadoresAceptados;
    ServerConnectionsThread conexionsThread;
    ArrayList<Jugador> jugadoresPartida = new ArrayList<Jugador>();
    
    public Servidor(PantallaServidor pantalla){
        this.pantalla = pantalla;
        connect();
        this.iniciada = false;
        jugadoresAceptados = new ArrayList<ThreadServidor>();
        conexionsThread = new ServerConnectionsThread(this);
        conexionsThread.start();
        
    }
    
    public void connect(){
        try {
            server = new ServerSocket(PORT);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void addJugador(){
        try {
            PantallaGuerreros pG= new PantallaGuerreros();
            pG.setVisible(true);
            jugadoresPartida.add(pG.jugador);
            System.out.println("si se pudo");
        } catch (IOException ex) {
            System.out.println("no se pudo pra pra cr7 SIUUU");
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void iniciarPartida() throws IOException{
        for(ThreadServidor jugador: jugadoresAceptados){
           jugador.salida.writeObject("El admin ya inicio");
        }
    }

    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
        
    }

    public PantallaServidor getPantalla() {
        return pantalla;
    }

    public void setPantalla(PantallaServidor pantalla) {
        this.pantalla = pantalla;
    }

    public ArrayList<ThreadServidor> getJugadoresAceptados() {
        return jugadoresAceptados;
    }

    public void setJugadoresAceptados(ArrayList<ThreadServidor> jugadoresAceptados) {
        this.jugadoresAceptados = jugadoresAceptados;
    }
    
   
    
}
