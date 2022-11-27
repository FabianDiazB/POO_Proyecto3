/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Jugador {
    private int ID;
    private final String IP = "localhost";
    private final int PORT = 8084;
    private Socket socket;
    ObjectOutputStream salida;
    private DataOutputStream salidaDatos;
    PantallaGuerreros pantalla;
    private int vida;
    String nombre ;
    private ArrayList<Guerrero> guerreros = new ArrayList<>();
     
     
     ThreadJugador threadJugador;

    public Jugador(PantallaGuerreros pantalla) {
        this.pantalla = pantalla;
        this.socket = new Socket();
        this.threadJugador = new ThreadJugador(socket, this);
        generarID();
        conectar();
    }
    
    public void generarID(){
        int r = (int)(Math.random() *9000 + 1000);
        this.ID = r;
    }
    
    
    public void conectar(){
        try {
            socket = new Socket(IP, PORT);
            salida = new ObjectOutputStream(socket.getOutputStream());
            salidaDatos = new DataOutputStream(socket.getOutputStream());
            threadJugador = new ThreadJugador(socket, this);
            threadJugador.start();
            
            // al conectarse, envía el nombre
            this.nombre = JOptionPane.showInputDialog("Nombre: ");
            salidaDatos.writeUTF(nombre);
        } catch (IOException ex) {
            
        }
    }

    public PantallaGuerreros getPantalla() {
        return pantalla;
    }

    public void setPantalla(PantallaGuerreros pantalla) {
        this.pantalla = pantalla;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Guerrero> getGuerreros() {
        return guerreros;
    }

    public void setGuerreros(ArrayList<Guerrero> guerreros) {
        this.guerreros = guerreros;
    }
    
    public void addGuerrero(String nombre, int tipo){
        Guerrero nuevo = new Guerrero(nombre, tipo);
        guerreros.add(nuevo);
    }
    
    
}
