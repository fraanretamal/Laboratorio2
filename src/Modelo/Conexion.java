package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    static Statement sentencia;
    static ResultSet resultado;

    Connection con = null;
    String user = "root";// User de BD
    String pass = "admin";// Pass de BD
    String server = "jdbc:mysql://localhost:3306/"; //URL de Servidor que aloja la BD (localhost significa que está en su propio computador.
    String db = "taller2"; //nombre de la BD
    String driver = "com.mysql.jdbc.Driver"; //Dependiendo del motor de BD que use, debe modificar este valor.
    //MYSQL : "jdbc:mysql://localhost/bdejemplo"
    //Derby : "jdbc:derby://localhost/bdejemplo"

    public Conexion() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(server + db, user, pass);
            sentencia = con.createStatement();
            //JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public Connection getConexion() {
        return con;
    }

    public Connection cerrarConexion() {

        try {
            con.close();
            System.out.println("Cerrando conexion a " + server + db + " . . . . . Ok");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        con = null;
        return con;

    }

    public static ArrayList<String> llenarCombo() {
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM Vendedores";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("Sucursal"));
            }
        } catch (Exception e) {
        }
        return lista;
    }

}
