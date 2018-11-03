/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Jugador {

        public String nombre; 
        public int vida, maxPower, minPower;
        
        
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public void setVida(int vida){
            this.vida = vida;
        }
        
        public int getVida(){
            return vida;
        }
        
        public void setMinPower(int minPower){
            this.minPower = minPower;
        }
    
        public int getMinPower(){
            return minPower;
        }
    
        public void setMaxPower(int maxPower){
            this.maxPower = maxPower;
        }
    
        public int getMaxPower(){
            return maxPower;
        }
        
}


