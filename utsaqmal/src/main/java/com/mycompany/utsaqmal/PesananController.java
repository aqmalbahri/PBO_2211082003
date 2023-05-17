/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsaqmal;
import utsaqmal.model.Pesanan;
import utsaqmal.model.PesananDao;
import utsaqmal.model.formPesanan
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class PesananController {
    private String formPesanan ; 
    private String PesananDao;
    private String Pesanan ;
    
    public PesananController(formPesanan ){
        this.formPesanan = formPesanan;
        PesananDao = new PesananDaoImpl();
    }
    public void cls(){
        form.getTxtKodepesanan().setText("");
        form.getTxtNamaPemesan().setText("");
        form.getTxtTgalPesan().setText("");
        form.getTxtHarga().setText("");
        form.getTxtOngkirpesan().setText("");
        
}
    public void saveBuku(){
        pesanan = new pesanan();
        pesanan.setKodepesanan(form.getTxtKodepesanan().getText());
        pesanan.setnamapesanan(form.getTxtNamaPesanan().getText());
        Pesanan.setTgalPesan(form.getTxtTgalPesan().getText());
        Pesanan.setHarga(form.getTxtHarga().getText());
        Pesanan.setOngkirpesan(form.getTxtOngkirPesan().getText());
        PesananDao.save(Pesanan);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }
    public void getpesanan(){
        int index = form.getTabelpesanan().getSelectedRow();
        pesanan = pesananDao.getpesanan(index);
        if(buku != null){
            form.getTxtKodePemesan().setText(pesanan.getKodePemesanan());
            form.getTxtNamaPemesan().setText(pesanan.getNamapesanan());
            form.getTxtTgalpesan().setText(pesanan.getTgalPesanan());
            form.getTxtHarga().setText(pesanan.getHarga());
            form.getTxtOngkirpesan().setText(pesanan.getOngkirpesan());
        }
    }
    
    