/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author hdavi
 */
public class venJuego extends javax.swing.JFrame {


    /**
     * Creates new form prueba
     * @param pJugadores
     * @param pCantJugadores
     */
    public venJuego(ArrayList<Jugador> pJugadores,int pCantJugadores) {
        initComponents();
        
        ImageIcon fichaR  = new ImageIcon("src/img/FichaRoja.png");
        Icon fichaRoja = new ImageIcon(fichaR.getImage().getScaledInstance(ficha1.getWidth(), ficha1.getHeight(), Image.SCALE_DEFAULT));
        ficha1.setIcon(fichaRoja);
        
        ImageIcon fichaM  = new ImageIcon("src/img/FichaMorada.png");
        Icon fichaMorada = new ImageIcon(fichaM.getImage().getScaledInstance(ficha2.getWidth(), ficha2.getHeight(), Image.SCALE_DEFAULT));
        ficha2.setIcon(fichaMorada);
        
        ImageIcon fichaA  = new ImageIcon("src/img/FichaAmarrilla.png");
        Icon fichaAmarrilla = new ImageIcon(fichaA.getImage().getScaledInstance(ficha3.getWidth(), ficha3.getHeight(), Image.SCALE_DEFAULT));
        ficha3.setIcon(fichaAmarrilla);
        
        ImageIcon fichaC  = new ImageIcon("src/img/FichaCeleste.png");
        Icon fichaCeleste = new ImageIcon(fichaC.getImage().getScaledInstance(ficha4.getWidth(), ficha4.getHeight(), Image.SCALE_DEFAULT));
        ficha4.setIcon(fichaCeleste);
             
        
        String njugador1 = pJugadores.get(0).getNombre();
        this.jugador1.setText(njugador1);
        this.jugador2.setText("");
        this.jugador3.setText("");
        this.jugador4.setText("");
        
        if(pCantJugadores==2){
            String njugador2 = pJugadores.get(1).getNombre();
            this.jugador2.setText(njugador2);
        }
        if(pCantJugadores==3){
            String njugador2 = pJugadores.get(1).getNombre();
            String njugador3 = pJugadores.get(2).getNombre();
            this.jugador2.setText(njugador2);
            this.jugador3.setText(njugador3);
        }
        if(pCantJugadores==4){
            String njugador2 = pJugadores.get(1).getNombre();
            String njugador3 = pJugadores.get(2).getNombre();
            String njugador4 = pJugadores.get(3).getNombre();
        }
        
        
  
        Game juego= new Game(pJugadores);
        
        
        colorDado.setVisible(false);
        
        botonTirar.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent e) { 
       
                
                colorDado.setVisible(true);
                

                
                String nDado = juego.tirarDado();
                
                /*ImageIcon dado  = new ImageIcon("src/img/"+nDado+".png");
                Icon caraDado = new ImageIcon(dado.getImage().getScaledInstance(imagenDado.getWidth(), imagenDado.getHeight(), Image.SCALE_DEFAULT));
                imagenDado.setIcon(caraDado);*/

                switch (juego.getTurno()) {

                case 1:
                    Jugador personaje = juego.getJugadores().get(0);
                    int posicion=personaje.getPosicion();
                    int numDado = Integer.parseInt(nDado);
                    //int nuevaPos = posicion+numDado;
                    
                    //juego.getJugadores().get(0).setPosicion(nuevaPos);
                    if(nDado.equals("6")){
                        colorDado.setBackground(new Color(255, 0, 0));
                        Hilo h=new Hilo(ficha1,ficha1.getX(),ficha1.getY(),numDado,personaje);
                        h.start();
                        //juego.getJugadores().get(0).setPosicion(nuevaPos);
                        //personaje.cambiarPosicion(numDado, ficha1);
                        //jLabel8.setLocation(120, 43);}
                    }
                    else{
                        colorDado.setBackground(new Color(255, 0, 0));
                        //jLabel8.setLocation(120, 43);
                        Hilo h=new Hilo(ficha1,ficha1.getX(),ficha1.getY(),numDado,personaje);
                        h.start();
                        //personaje.cambiarPosicion(numDado, ficha1);
                        juego.cambioTurno();
                        
                    }
                    break;
                case 2:
                    personaje=juego.getJugadores().get(1);
                    posicion=personaje.getPosicion();
                    numDado = Integer.parseInt(nDado);
                    //nuevaPos = posicion+numDado;
                    //juego.getJugadores().get(1).setPosicion(nuevaPos);
                    if(nDado.equals("6")){
                        colorDado.setBackground(new Color(66, 1, 76));
                        Hilo h=new Hilo(ficha2,ficha2.getX(),ficha2.getY(),numDado,personaje);
                        h.start();
                        //personaje.cambiarPosicion(numDado, ficha2);
                    }
                    else{
                        colorDado.setBackground(new Color(66, 1, 76));
                        Hilo h=new Hilo(ficha2,ficha2.getX(),ficha2.getY(),numDado,personaje);
                        h.start();
                        //personaje.cambiarPosicion(numDado, ficha2);
                        juego.cambioTurno();
                    }
                    break;
                case 3:
                    personaje=juego.getJugadores().get(2);
                    posicion=personaje.getPosicion();
                    numDado = Integer.parseInt(nDado);
                    //nuevaPos = posicion+numDado;
                    //juego.getJugadores().get(2).setPosicion(nuevaPos);
                    if(nDado.equals("6")){
                        colorDado.setBackground(new Color(255, 240, 0));
                        Hilo h=new Hilo(ficha3,ficha3.getX(),ficha3.getY(),numDado,personaje);
                        h.start();
                        
                    }
                    else{
                        colorDado.setBackground(new Color(255, 240, 0));
                        Hilo h=new Hilo(ficha3,ficha3.getX(),ficha3.getY(),numDado,personaje);
                        h.start();
                        juego.cambioTurno();
                    }
                    break;
                case 4:
                    personaje=juego.getJugadores().get(3);
                    posicion=personaje.getPosicion();
                    numDado = Integer.parseInt(nDado);
                    //nuevaPos = posicion+numDado;
                    //juego.getJugadores().get(3).setPosicion(nuevaPos);
                    if(nDado.equals("6")){
                        colorDado.setBackground(new Color( 0, 255, 252));
                        Hilo h=new Hilo(ficha4,ficha4.getX(),ficha4.getY(),numDado,personaje);
                        h.start();
                    }
                    else{
                        colorDado.setBackground(new Color( 0, 255, 252));
                        Hilo h=new Hilo(ficha4,ficha4.getX(),ficha4.getY(),numDado,personaje);
                        h.start();
                        juego.cambioTurno();
                    }
                    //colorDado.setBackground(new Color( 0, 255, 252));
                    //juego.cambioTurno();
                    break;
                }
                ImageIcon dado  = new ImageIcon("src/img/"+nDado+".png");
                Icon caraDado = new ImageIcon(dado.getImage().getScaledInstance(imagenDado.getWidth(), imagenDado.getHeight(), Image.SCALE_DEFAULT));
                imagenDado.setIcon(caraDado);
                imagenDado.repaint();
                
                
	    }
            
	});
        
        ImageIcon imagenF  = new ImageIcon("src/img/tableroFinal.png");
        Icon icono = new ImageIcon(imagenF.getImage().getScaledInstance(tableroFondo.getWidth(), tableroFondo.getHeight(), Image.SCALE_DEFAULT));
        tableroFondo.setIcon(icono);
        tableroFondo.repaint();
        
       
        ImageIcon dado  = new ImageIcon("src/img/6.png");
        Icon caraDado = new ImageIcon(dado.getImage().getScaledInstance(imagenDado.getWidth(), imagenDado.getHeight(), Image.SCALE_DEFAULT));
        imagenDado.setIcon(caraDado);
        imagenDado.repaint();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugador4 = new javax.swing.JLabel();
        jugador3 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        imagenDado = new javax.swing.JLabel();
        colorDado = new javax.swing.JLabel();
        botonTirar = new javax.swing.JLabel();
        ficha1 = new javax.swing.JLabel();
        ficha2 = new javax.swing.JLabel();
        ficha3 = new javax.swing.JLabel();
        ficha4 = new javax.swing.JLabel();
        tableroFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escaleras Y Serpientes");
        setResizable(false);
        setSize(new java.awt.Dimension(730, 704));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugador4.setForeground(new java.awt.Color(0, 255, 252));
        jugador4.setText("Jugador 4");
        getContentPane().add(jugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 212, -1, -1));

        jugador3.setForeground(new java.awt.Color(255, 240, 0));
        jugador3.setText("Jugador 3");
        getContentPane().add(jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 153, -1, -1));

        jugador1.setForeground(new java.awt.Color(215, 5, 0));
        jugador1.setText("Jugador 1");
        getContentPane().add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 43, -1, -1));

        jugador2.setForeground(new java.awt.Color(66, 1, 76));
        jugador2.setText("Jugador 2");
        getContentPane().add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 98, -1, -1));

        imagenDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6.png"))); // NOI18N
        getContentPane().add(imagenDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 180));

        colorDado.setBackground(new java.awt.Color(255, 0, 0));
        colorDado.setOpaque(true);
        getContentPane().add(colorDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 176, 250));

        botonTirar.setBackground(new java.awt.Color(255, 0, 51));
        getContentPane().add(botonTirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 171, 40));

        ficha1.setBackground(new java.awt.Color(153, 204, 255));
        ficha1.setText("jLabel1");
        getContentPane().add(ficha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 650, 36, 36));

        ficha2.setBackground(new java.awt.Color(153, 204, 255));
        ficha2.setText("jLabel1");
        getContentPane().add(ficha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 650, 36, 36));

        ficha3.setBackground(new java.awt.Color(153, 204, 255));
        ficha3.setText("jLabel1");
        getContentPane().add(ficha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 650, 36, 36));

        ficha4.setBackground(new java.awt.Color(153, 204, 255));
        ficha4.setText("jLabel1");
        getContentPane().add(ficha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 650, 36, 36));

        tableroFondo.setName("fondo"); // NOI18N
        getContentPane().add(tableroFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 704));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonTirar;
    private javax.swing.JLabel colorDado;
    private javax.swing.JLabel ficha1;
    private javax.swing.JLabel ficha2;
    private javax.swing.JLabel ficha3;
    private javax.swing.JLabel ficha4;
    private javax.swing.JLabel imagenDado;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel jugador3;
    private javax.swing.JLabel jugador4;
    private javax.swing.JLabel tableroFondo;
    // End of variables declaration//GEN-END:variables
}
