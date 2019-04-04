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
	
	public Hilo(JLabel etiqueta, int x,int y, int val){
		this.x=x;
                this.y=y;
		this.etiqueta = etiqueta;
		ciclo=val;
	}
	public void run(){
		while(ciclo!=0) {
			x-=(etiqueta.getWidth()+2);
                        //y-=70;
			etiqueta.setLocation(x, y);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ciclo--;
		}
	}
}
