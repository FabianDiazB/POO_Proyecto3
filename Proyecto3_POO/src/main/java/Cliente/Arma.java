/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Arma implements Serializable{
    private String nombre;
    private ArrayList<Integer> damage = new ArrayList<>();
    private Boolean usada;
    
    public Arma(String nombre) {
        this.nombre = nombre;
        this.usada = false;
        randomDamage();
    }
    public void randomDamage(){ // para agregar porcentaje random a cada tipo
            for(int i =0; i<4; i++){
                int r = (int)(Math.random()*80 + 20);
                damage.add(r);
            }
            
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getDamage() {
        return damage;
    }

    public void setDamage(ArrayList<Integer> damage) {
        this.damage = damage;
    }

    public Boolean getUsada() {
        return usada;
    }

    public void setUsada(Boolean usada) {
        this.usada = usada;
    }
    
    
    
    
}
