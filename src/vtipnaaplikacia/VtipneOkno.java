/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtipnaaplikacia;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

        final JButton anoButton = new JButton("Ano");
        final JButton nieButton = new JButton("Nie");
        
        anoButton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Drz sa na skuske!");
            System.exit(0);
        });
        
        nieButton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "To nemyslis vazne!");
            System.exit(0);
        });
        
        nieButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Component prvy = tlacidla.getComponent(0);
                tlacidla.remove(prvy);
                tlacidla.add(prvy);
                
                VtipneOkno.this.okno.revalidate();
            }
        });

        tlacidla.add(anoButton);
        tlacidla.add(nieButton);

        this.okno.add(tlacidla, BorderLayout.SOUTH);

        this.okno.pack();
    }

    void zobraz() {
        this.okno.setVisible(true);
    }
}
