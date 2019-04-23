
package Modelo;

import Vista.RegistrarVenta;
import java.sql.Connection;
import java.util.ArrayList;

public class VendedorDAO {
    Conexion con;
    
    public VendedorDAO(RegistrarVenta rv){
        this.con = new Conexion();     
    }
    
     public ArrayList<Vendedor> vendedores = new ArrayList<>();
     Connection accesoBD = con.getConexion();
    
    public void getVendedores(){
    
    }

   
    
    
}
