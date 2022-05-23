import javax.print.DocFlavor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query {
    public static void TodosProductos(){
        Connection con = ConexionBD.getConnection();

        try {
            PreparedStatement ps1 = con.prepareStatement("SELECT *\n" +
                    "FROM products p; ");

            ResultSet rs = ps1.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString(1)+"   "+rs.getString(2));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Office> Oficinas(){
        Connection con = ConexionBD.getConnection();
        try{
            PreparedStatement ps = con.prepareStatement("SELECT officeCode , city , phone \n" +
                    "FROM offices o ;");

            ResultSet rs = ps.executeQuery();

            ArrayList<Office> Oficinas = new ArrayList<>();

            while (rs.next()){
                int codigo = rs.getInt(1);
                String ciudad = rs.getString(2);
                String telefono = rs.getString(3);

                Office of= new Office(codigo, ciudad, telefono);

                Oficinas.add(of);
            }

            return Oficinas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
