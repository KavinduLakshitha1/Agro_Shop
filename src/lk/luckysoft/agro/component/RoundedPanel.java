/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.luckysoft.agro.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import org.apache.commons.digester.annotations.rules.CallParam;

/**
 *
 * @author KAVINDU
 */


public class RoundedPanel extends JPanel {
    
    private static final int ROUND_CORNER_SIZE= 30;  /* Panel Corners Size */

    public RoundedPanel() {
        setOpaque(false);
    }

    
    @Override
    public void paint(Graphics g){
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.setColor(this.getBackground());
        gd.fillRoundRect(0, 0, getWidth(), getHeight(),ROUND_CORNER_SIZE , ROUND_CORNER_SIZE);
        gd.dispose();
        super.paint(g);
    }
}
