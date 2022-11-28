/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Guerrero {
    private String nombre;
    private int tipo;
    private ArrayList<Arma> armas;
    private int vida;

    public Guerrero(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = 100;
        this.armas = new ArrayList<Arma>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void addArma(String nombre){
        Arma nueva = new Arma(nombre);
        armas.add(nueva);
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
}
