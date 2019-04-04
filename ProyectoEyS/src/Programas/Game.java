/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import java.util.ArrayList;

/**
 * @author hdavi
 */
public class Game {
    
    private int cantJugadores;
    private ArrayList<Jugador> jugadores;

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    private int Turno;
    private int cantTurnos;
    private boolean hayGanador;
    
    public Game(ArrayList<Jugador> pJugadores){
        Turno = 1;
        cantJugadores = pJugadores.size();
        jugadores = pJugadores;
    }
    
    public String tirarDado() {
        
        int numero = 1 + (int) (Math.random() * 6);
        String nDado = Integer.toString(numero);
        return nDado;
    }
    public int getPosJugador(int val){
        return jugadores.get(val).getPosicion();
    }
    
    public int getTurno(){
        return Turno;
    }
    
    public void cambioTurno(){
        switch(cantJugadores){
            case 2:
                if(Turno == 2){
                    Turno=1;
                }
                else{
                    Turno++;
                }
                break;
            
            case 3:
                if(Turno == 3){
                    Turno=1;
                }
                else{
                    Turno++;
                }
                break;
            case 4:
                if(Turno == 4){
                    Turno=1;
                }
                else{
                    Turno++;
                }
                break;
            
        }
    }
    
   
    
}
