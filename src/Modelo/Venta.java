
package Modelo;

import java.sql.Date;

public class Venta {
    private int id_venta;
    private String sucursal;
    private int monto;
    private Date fecha;
    private int id_vendedor;

    public Venta(int id_venta, String sucursal, int monto, Date fecha, int id_vendedor) {
        this.id_venta = id_venta;
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
        this.id_vendedor = id_vendedor;
    }
    
    
    
}
