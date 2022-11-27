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
    private final String IP = "localhost";
    private final int PORT = 8084;
    private Socket socket;
    ObjectOutputStream salida;
    private DataOutputStream salidaDatos;
    Pantalla pantalla;
    private int vida;
    String nombre ;
    private ArrayList<Guerrero> guerreros = new ArrayList<>();
     
     
     ThreadJugador threadCliente;

    public Jugador(Pantalla pantalla) {
        this.pantalla = pantalla;
        conectar();
    }

    
    
    public void conectar(){
        try {
            socket = new Socket(IP, PORT);
            salida = new ObjectOutputStream(socket.getOutputStream());
            salidaDatos = new DataOutputStream(socket.getOutputStream());
            threadCliente = new ThreadJugador(socket, this);
            threadCliente.start();
            
            // al conectarse, envía el nombre
            this.nombre = JOptionPane.showInputDialog("Nombre: ");
            salidaDatos.writeUTF(nombre);
        } catch (IOException ex) {
            
        }
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
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
