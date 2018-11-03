/*Automáticamente, de forma aleatoria, cada jugador deberá dar un golpe por turno
que irá descontando la vida del contrincante.
Ganará el jugador que no llegue a la vida en cero. 
Tantos los turnos como los golpes deberán ser anunciado por pantalla round a round,
así como el ganador.
 */

/**
 *
 * @author adriana3r
 */

import javax.swing.JOptionPane;
import java.util.Random;


public class Principal {
    
    
        public static void main(String[] args) {
    
            
        Jugador j1 = new Jugador();
                j1.setNombre("TESEO");
                j1.setVida(3);
                j1.setMinPower(13);
                j1.setMaxPower(33);
                
        Jugador j2 = new Jugador();
                j2.setNombre("MINOTAURO");
                j2.setVida(3);
                j2.setMinPower(10);
                j2.setMaxPower(35);        
                
                              
                int contador = 0;
                int cnt1 = 3; 
                int cnt2 = 3;
                
              
             
        Random aleatorio = new Random();    
                int n = aleatorio.nextInt(1)+1;
                
        
                
        if (n == 1){
                        
                        while (cnt1> 0 && cnt2 > 0) {
                        contador = contador+1;
                        JOptionPane.showMessageDialog(null,"ROUND NRO " + contador); 
            
            
                        JOptionPane.showMessageDialog(null,"Es el turno de " + j1.getNombre());
                        
                                int seleccion = JOptionPane.showOptionDialog(null,"Seleccione nivel de poder","Selector de opciones",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Mínimo", "Máximo" },"Mínimo");
                                        if (seleccion != -1);

             
                                if(j2.getVida()  > 0){
                                cnt2 = cnt2-1;
                        JOptionPane.showMessageDialog(null,"A " + j2.getNombre() + " le quedan " + cnt2 + " vidas");
                        
                                if(cnt2 == 0){
                        JOptionPane.showMessageDialog(null,"EL GANADOR ES " + j1.getNombre());
                        
                        
        }else{
                       
                        while (cnt1> 0 && cnt2 > 0) {
                        contador = contador+1;
                        JOptionPane.showMessageDialog(null,"ROUND NRO " + contador); 
                        
                                                
                        JOptionPane.showMessageDialog(null,"Es el turno de " + j2.getNombre());
                        
                                seleccion = JOptionPane.showOptionDialog(null,"Seleccione nivel de poder","Selector de opciones",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Mínimo", "Máximo" },"Mínimo");
                                        if (seleccion != -1);
                        
                        
                                if(j1.getVida()  > 0){
                                cnt1 = cnt1-1;
                        JOptionPane.showMessageDialog(null,"A " + j1.getNombre() + " le quedan " + cnt1 + " vidas");
                        
                                if(cnt1 == 0){
                        JOptionPane.showMessageDialog(null,"EL GANADOR ES " + j2.getNombre());
                        
                                                                }
                                                        }
                                                }               
                                        }
                                }
                        }
                }
        }
}






        
        

                

                                


 

        

        
