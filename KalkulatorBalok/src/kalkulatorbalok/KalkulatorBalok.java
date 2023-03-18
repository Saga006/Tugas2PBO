/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorbalok;

import javax.swing.*;
import java.awt.event.*; 

/**
 *
 * @author Galang
 */
public class KalkulatorBalok {
    public static void main(String[] args) {
        GUI gui = new GUI();
        
    }
}

class GUI extends JFrame implements ActionListener{
    double panjang,lebar,tinggi;
    
    JLabel ljudul = new JLabel("Kalkulator Balok");
    JLabel lpanjang = new JLabel("Panjang");
    JTextField fpanjang = new JTextField(15); 
    JLabel llebar = new JLabel("Lebar");
    JTextField flebar = new JTextField(15);
    JLabel ltinggi = new JLabel("Tinggi");
    JTextField ftinggi = new JTextField(15);
    JLabel lhasil = new JLabel("Hasil : ");
    JLabel lluaspersegi = new JLabel("" );
    JLabel lkelilingpersegi = new JLabel("");
    JLabel lvolumebalok = new JLabel("");
    JLabel lluasbalok = new JLabel("");
 
    JButton bhitung = new JButton("Hitung");
    
    JButton bulang = new JButton("Ulang");
    
    public GUI(){
        setTitle("Kalkulator Balok");
        setSize(300,310);

        bhitung.addActionListener(this);
        bulang.addActionListener(this);
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        add(lhasil);
        add(lluaspersegi);
        add(lkelilingpersegi);
        add(lvolumebalok);
        add(lluasbalok);
        add(bhitung);
        add(bulang);
        
        ljudul.setBounds(100,10,120,20);
        lpanjang.setBounds(10,40,120,20);
	fpanjang.setBounds(130,40,150,20);
        llebar.setBounds(10,70,120,20);
	flebar.setBounds(130,70,150,20);
        ltinggi.setBounds(10,100,120,20);
	ftinggi.setBounds(130,100,150,20);
        lhasil.setBounds(130,130,120,20);
        lluaspersegi.setBounds(10,150,200,20);
        lkelilingpersegi.setBounds(10,170,200,20);
        lvolumebalok.setBounds(10,190,200,20);
        lluasbalok.setBounds(10,210,200,20);
        bhitung.setBounds(70,240,80,20);
	bulang.setBounds(160,240,70,20);
        
	setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bhitung){
            
            
              
            try{
                panjang = Double.parseDouble(fpanjang.getText());
            lebar = Double.parseDouble(flebar.getText());
            tinggi = Double.parseDouble(ftinggi.getText());
                Balok balok = new Balok(panjang,lebar,tinggi);
                lluaspersegi.setText("Luas Persegi : " + balok.luas());
                lkelilingpersegi.setText("Keliling Persegi : " + balok.keliling());
                lvolumebalok.setText("Volume Balok : " + balok.volume());
                lluasbalok.setText("Luas Balok : " + balok.luas(tinggi)); 
                
            }
            catch(NumberFormatException error){
               JOptionPane.showMessageDialog(null, error.getMessage());   
            }
            catch(NullPointerException error){
               JOptionPane.showMessageDialog(null, error.getMessage());   
            }
            
        }
        if(e.getSource() == bulang){
            fpanjang.setText("");
            ftinggi.setText("");
            flebar.setText("");
            lluaspersegi.setText("");
            lkelilingpersegi.setText("");
            lvolumebalok.setText("");
            lluasbalok.setText("");
            
        }
    }
}
