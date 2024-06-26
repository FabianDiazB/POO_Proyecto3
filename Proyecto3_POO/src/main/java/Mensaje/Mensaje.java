/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensaje;

import java.io.Serializable;
import Cliente.*;
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class Mensaje implements Serializable{
    private String enviador;
    private String mensaje;
    private TipoMensaje tipo;
    private String receptor;
    
    private String objetivo;
    private String armaAtacante;
    private String guerrero;
    private String daño;
    private String atacante;
    
  // private 
    
    //public Mensaje(){}
    
    public Mensaje(String enviador, String objetivo, String atacante,String arma, String receptor) { //Le envia a quien atacar y con que
        this.enviador = enviador;
        this.armaAtacante = arma;
        this.atacante = atacante;
        this.objetivo = objetivo;
        this.receptor = receptor;
        this.tipo = TipoMensaje.PRIVADO;
    }
    
    ////////////////////////////////////////////////////
    public Mensaje(String enviador, String mensaje) {
        this.enviador = enviador;
        this.mensaje = mensaje;
        this.tipo = TipoMensaje.PUBLICO;        
    }
    public Mensaje(String enviador, String mensaje, String receptor) {
        this.enviador = enviador;
        this.mensaje = mensaje;
        this.receptor = receptor;
        this.tipo = TipoMensaje.PRIVADO;
    }

    @Override
    public String toString() {
        return enviador + ": \"" + tipo + mensaje;
    }

    public String getEnviador() {
        return enviador;
    }

    public void setEnviador(String enviador) {
        this.enviador = enviador;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public TipoMensaje getTipo() {
        return tipo;
    }

    public void setTipo(TipoMensaje tipo) {
        this.tipo = tipo;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }  
}
