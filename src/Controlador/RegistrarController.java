
package Controlador;

import Modelo.Vendedor;
import Modelo.VendedorDAO;
import Modelo.Venta;
import Vista.RegistrarVenta;
import Vista.VentanaInicio;
import Vista.VentanaReportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class RegistrarController implements ActionListener {
    
    private RegistrarVenta rv;
    private VentanaInicio vi;
    private VentanaReportes vr;
    private VendedorDAO vDao;
    private javax.swing.JComboBox<String> vBox;
    private javax.swing.JComboBox<String> sBox;
    ArrayList <Venta> ventas = new ArrayList<>();
    ArrayList <Vendedor> Vendedores = new ArrayList<>();

    public RegistrarController(RegistrarVenta rv, VendedorDAO vDao, JComboBox<String> vBox, JComboBox<String> sBox) {
        this.rv = rv;
        
      
        this.vBox = vBox;
        this.sBox = sBox;
        
        
        String v1 = Vendedores.get(0).getNombre()+" "+Vendedores.get(0).getApellido();
        String v2 = Vendedores.get(1).getNombre()+" "+Vendedores.get(1).getApellido();
        String v3 = Vendedores.get(2).getNombre()+" "+Vendedores.get(2).getApellido();
        String v4 = Vendedores.get(3).getNombre()+" "+Vendedores.get(3).getApellido();
        vBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {v1,v2,v3,v4}));
        
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        
    }
    
 
    
}
