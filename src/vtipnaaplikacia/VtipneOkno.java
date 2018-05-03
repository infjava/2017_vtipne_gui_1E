/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtipnaaplikacia;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author janik
 */
class VtipneOkno {

    private final JFrame okno;

    public VtipneOkno() {
        this.okno = new JFrame("Otazka");
        this.okno.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        this.okno.setLayout(new BorderLayout());
        
        this.okno.add(new JLabel("Spravis skusku z Informatiky?"), BorderLayout.CENTER);
        
        JPanel tlacidla = new JPanel();
        tlacidla.setLayout(new GridLayout(1, 2));
        
        tlacidla.add(new JButton("Ano"));
        tlacidla.add(new JButton("Nie"));
        
        this.okno.add(tlacidla, BorderLayout.SOUTH);
        
        this.okno.pack();
    }

    void zobraz() {
        this.okno.setVisible(true);
    }
}
