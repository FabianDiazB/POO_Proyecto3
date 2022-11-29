/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;
import Juego.*;
import Servidor.Servidor;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Servidor.*;
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
    
    public void enviarMiInfo(){
        
    }
    
    public void run(){
        
        while(true){
            try {
                String comando = (String)entrada.readObject();
                System.out.println(comando);
                JOptionPane.showMessageDialog(this.player.pantallaG, "Iniciando partida...", "GET READY", JOptionPane.DEFAULT_OPTION);
                this.player.pantallaA.dispose();
                System.out.println("esta antes de crear juego");
                Juego GUIJuego = new Juego(this.player);
                System.out.println(player.getNombre());
                this.player.pantallaJuego = GUIJuego;
                GUIJuego.setVisible(true);
                break;
            } catch (Exception e) {
            }
            enviarMiInfo();
        }

    }
    
    
    
    
    
}
