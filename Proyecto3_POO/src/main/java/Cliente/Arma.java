/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Arma {
    private String nombre;
    private ArrayList<Integer> damage = new ArrayList<>();
    
    public Arma(String nombre) {
        this.nombre = nombre;
        randomDamage();
    }
    public void randomDamage(){ // para agregar porcentaje random a cada tipo
            for(int i =0; i<4; i++){
                int r = (int)(Math.random()*80 + 20);
                damage.add(r);
            }
    }
    
    
    
    
}
