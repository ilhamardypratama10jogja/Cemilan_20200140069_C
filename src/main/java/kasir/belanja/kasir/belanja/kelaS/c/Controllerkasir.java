/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.belanja.kasir.belanja.kelaS.c;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author acer
 */
@Controller
public class Controllerkasir {
    
    @RequestMapping("/nota")
    
    public String belanja(HttpServletRequest data, Model n){
        String nama = data.getParameter("var_nama");
        Double harga = Double.valueOf(data.getParameter("var_harga"));
        Double jumlah = Double.valueOf(data.getParameter("var_jumlah"));
        
        rumushitung shop = new rumushitung();
        
        n.addAttribute("namasayur",nama);
        n.addAttribute("hargasayur",harga);
        n.addAttribute("jumlahkilo",jumlah);
        n.addAttribute("beforeprice",shop.hargaawal(harga, jumlah)+"%");
        n.addAttribute("discnumber",shop.disc(shop.hargaawal(harga, jumlah))+"%");
        n.addAttribute("discquantity",shop.discount(harga, jumlah));
        n.addAttribute("afterprice",shop.hargaakhir(harga, jumlah));
        
        return "kasir";
    }
    
    
}
