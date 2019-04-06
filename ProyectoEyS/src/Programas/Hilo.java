/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import javax.swing.JLabel;

/**
 *
 * @author irsac
 */
public class Hilo extends Thread {
    private int x;
    private int y;
    private JLabel etiqueta;
    private int ciclo;
    private Jugador jugador;
	
	public Hilo(JLabel etiqueta, int x,int y, int val, Jugador pJugador){
		this.x=x;
                this.y=y;
		this.etiqueta = etiqueta;
		ciclo=val;
                jugador =pJugador;
                
	}
	public void run(){
            int posTemp=jugador.getPosicion();
            int fila=jugador.getFila();
                while(ciclo!=0) {
                    if(posTemp==100){
                        while(ciclo!=0){
                            x-=(etiqueta.getWidth()+2);
                            etiqueta.setLocation(x, y);
                            posTemp--;
                            jugador.setPosicion(posTemp);
                            try {
                                    Thread.sleep(500);
                            } catch (InterruptedException e1) {
                                    // TODO Auto-generated catch block
                                    e1.printStackTrace();
                            }
                            ciclo--;
                        }
                        break;
                    }
                    else if(posTemp%10==0&&posTemp!=0){
                        y-=70;
                        etiqueta.setLocation(x, y);
                        posTemp++;
                        jugador.setPosicion(posTemp);
                        jugador.setFila();
                        fila++;
                        try {
                                Thread.sleep(500);
                        } catch (InterruptedException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                    }
                    else if(fila%2==1){
                        x+=(etiqueta.getWidth()+2);
                        etiqueta.setLocation(x, y);
                        posTemp++;
                        jugador.setPosicion(posTemp);
                        //jugador.setFila();
                        try {
                                Thread.sleep(500);
                        } catch (InterruptedException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                    }
                    else{
                        x-=(etiqueta.getWidth()+2);
                        //y-=70;
                        etiqueta.setLocation(x, y);
                        posTemp++;
                        jugador.setPosicion(posTemp);
                        //jugador.setFila();
                        try {
                                Thread.sleep(500);
                        } catch (InterruptedException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                    }
                    ciclo--;
                }
                int pos=jugador.getPosicion();
                switch(pos) {
			case 4:
				//System.out.println(this.getNombre()+ ", tu humildad te es recompensada. Subes a la casilla 79"+"\n");
				//JOptionPane.showMessageDialog(null, this.getNombre()+ ", tu humildad te es recompensada. Subes a la casilla 79");
                                y-=70*7;
                                etiqueta.setLocation(612, y);
                                jugador.setPosicion(79);
                                jugador.setFila();
				//this.setPosicion(79); 
                                break;
			case 10:
				//System.out.println(getNombre()+", tu generosidad ha cosechado sus frutos Subes a la casilla 28"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", tu generosidad ha cosechado sus frutos Subes a la casilla 28"+"\n");
                                etiqueta.setLocation(384,510);
				jugador.setPosicion(28);
                                jugador.setFila(); break;
			case 20:
				//System.out.println(getNombre()+", gracias a tu abtinencia lograste superar gran parte del camino. Subes a la casilla 98"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", gracias a tu abtinencia lograste superar gran parte del camino. Subes a la casilla 98");
				etiqueta.setLocation(574,20);
                                jugador.setPosicion(98);
                                jugador.setFila(); break;
			case 25:
				//System.out.println(getNombre()+", la paciencia es una virtud. Subes a la casilla 67"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", la paciencia es una virtud. Subes a la casilla 67"+"\n");
                                etiqueta.setLocation(422,230);
				jugador.setPosicion(67);
                                jugador.setFila(); break;
			case 37:
				//System.out.println(getNombre()+", te perdiste en tu lujuria. Bajas a la casilla 13"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", te perdiste en tu lujuria. Bajas a la casilla 13");
                                etiqueta.setLocation(384, 580);
				jugador.setPosicion(13);
                                jugador.setFila();break;
			case 47:
				//System.out.println(getNombre()+", tu templanza te a ayudado a subir a la casilla 76"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", tu templanza te a ayudado a subir a la casilla 76");
                                etiqueta.setLocation(498,160);
				jugador.setPosicion(76);
                                jugador.setFila(); break;
			case 65:
				//System.out.println(getNombre()+", tu pereza te hizo pensar que ibas m�s adelante. En realidad te encuentras en la casilla 50"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", tu pereza te hizo pensar que ibas m�s adelante. En realidad te encuentras en la casilla 50");
                                etiqueta.setLocation(308,370);
                                jugador.setPosicion(50);
                                jugador.setFila(); break;
			case 71:
				//System.out.println(getNombre()+", tu insaciable gula te hizo regresarte por suministros, bajas a la casilla 34"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", tu insaciable gula te hizo regresarte por suministros, bajas a la casilla 34");
				etiqueta.setLocation(422, 440);
                                jugador.setPosicion(34);
                                jugador.setFila(); break;
			case 77:
				//System.out.println(getNombre()+", manos que dan nunca estan vacias, tu caridad te a llevado a la casilla 95"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", manos que dan nunca estan vacias, tu caridad te a llevado a la casilla 95");
				etiqueta.setLocation(460, 20);
                                jugador.setPosicion(95);
                                jugador.setFila(); break;
			case 80:
				//System.out.println(getNombre()+", un ataque de ira te a hecho perder el rumbo. Terminas en la casilla numero 2"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", un ataque de ira te a hecho perder el rumbo. Terminas en la casilla numero 2");
				etiqueta.setLocation(612, 650);
                                jugador.setPosicion(2);
                                jugador.setFila(); break;
			case 82:
				//System.out.println(getNombre()+", fuiste tan diligente que no te diste cuenta cando avanzaste las otras 11 casillas. Te encuentras en la casilla 93"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", fuiste tan diligente que no te diste cuenta cando avanzaste las otras 11 casillas. Te encuentras en la casilla 93");
				etiqueta.setLocation(384, 20);
                                jugador.setPosicion(93);
                                jugador.setFila(); break;
			case 87:
				//System.out.println(getNombre()+", al buscar lo que otros tenian te quedaste atras. Tu envidia te lleva a la casilla 51"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", al buscar lo que otros tenian te quedaste atras. Tu envidia te lleva a la casilla 51");
				etiqueta.setLocation(308, 300);
                                jugador.setPosicion(51);
                                jugador.setFila(); break;
			case 91:
				//System.out.println(getNombre()+", tu avaricia te a segado, regresaste a la casilla 66"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", tu avaricia te a segado, regresaste a la casilla 66");
				etiqueta.setLocation(460, 230);
                                jugador.setPosicion(66);
                                jugador.setFila(); break;
			case 99:
				//System.out.println(getNombre()+", lleno de regosijo y jactandote de tus habilidades la sobervia te hace resvalar en tu momento de gloria, la verg�ensa hace que te debuelvas a la casilla 15"+"\n");
				//JOptionPane.showMessageDialog(null, getNombre()+", lleno de regosijo y jactandote de tus habilidades la sobervia te hace"+"\n"+"  resvalar en tu momento de gloria, la verg�ensa hace que te debuelvas a la casilla 15");
				etiqueta.setLocation(460,580);
                                jugador.setPosicion(15);
                                jugador.setFila(); break;
			case 100:
				//this.setGanador(true);
				System.out.println(jugador.getNombre()+" es el ganador"); break;
			default:
				System.out.println(jugador.getNombre()+"avanzas a la cacilla numero: "+pos+"\n");
				//jugador.setPosicion(pos); break;
			}
	}
}
