/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.belanja.kasir.belanja.kelaS.c;

/**
 *
 * @author acer
 */
public class rumushitung {
     public Double hargaawal(Double harga,Double jumlah){
        return harga*jumlah;
    }
    
    public Double hargaakhir(Double harga, Double jumlah){
        return hargaawal(harga,jumlah)-discount(harga,jumlah);
    }
    
    public Integer disc(Double jumlahbelanja){
        if (jumlahbelanja>25000){
            return 15;
        }
        else if(jumlahbelanja>16000){
            return 10;
        }
        else{
            return 0;
        }
    }
    
    public Double discount(Double harga,Double jumlah){
        return hargaawal(harga,jumlah)*disc(harga*jumlah)/100;
    }
    
}
