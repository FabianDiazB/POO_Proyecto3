/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
public class Jugador implements Serializable{
    private int ID;
    private final String IP = "localhost";
    private final int PORT = 8084;
    private Socket socket;
    ObjectOutputStream salida;
    private DataOutputStream salidaDatos;
    PantallaGuerreros pantallaG;
    PantallaArmas pantallaA;
    PantallaJuego pantallaJuego;
    private int vida;
    String nombre ;
    private ArrayList<Guerrero> guerreros = new ArrayList<>();
     
     
     ThreadJugador threadJugador;

    public Jugador(PantallaGuerreros pantalla) throws IOException {
        this.pantallaG = pantalla;
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
            System.out.println("el nombre de este jugador es " + nombre);
        } catch (IOException ex) {
            
        }
    }

    public PantallaGuerreros getPantallaG() {
        return pantallaG;
    }

    public void setPantallaG(PantallaGuerreros pantallaG) {
        this.pantallaG = pantallaG;
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

    public int getID() {
        return ID;
    }

    public ObjectOutputStream getSalida() {
        return salida;
    }

    public DataOutputStream getSalidaDatos() {
        return salidaDatos;
    }

    public ThreadJugador getThreadJugador() {
        return threadJugador;
    }
    
    
}
