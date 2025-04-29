package pe.edu.upeu.calcfx.servicio;

import org.springframework.stereotype.Component;
import pe.edu.upeu.calcfx.dbCon.Conn;
import pe.edu.upeu.calcfx.modelo.CalcTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Component
public class CalcRepoSql {
    Connection connection=new Conn().connectSQLite();
    PreparedStatement ps;
    ResultSet rs=null;

    public List<CalcTO> listarEntidad() {
        System.out.println("Hola SQL Nativo Lista");
        List<CalcTO> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement("SELECT * from calculadora");
            rs = ps.executeQuery();
            while (rs.next()) {
                CalcTO calcTO=new CalcTO();
                calcTO.setNum1(rs.getString("num1"));
                calcTO.setNum2(rs.getString("num2"));
                calcTO.setOperator(rs.getString("operador").charAt(0));
                calcTO.setResultado(rs.getString("resultado"));

                lista.add(calcTO);
                        /*CalcTO.builder()
                        .id(rs.getInt("id"))
                        .num1(rs.getString("num1"))
                        .operador(rs.getString("operador").charAt(0))
                        .num2(rs.getString("num2"))
                        .resultado(rs.getString("resultado"))
                        .build());*/
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
    public int guardarEntidad(CalcTO c) {
        int result=0;
        c.setId(maxId());
        try {
            ps = connection.prepareStatement("INSERT INTO calculadora(id, num1,num2, operador, resultado)" + " VALUES("+c.getId()+", '"+c.getNum1()+"', '"+c.getNum2()+"', '"+c.getOperator()+"', '"+c.getResultado()+"')");
            result= ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        }
        return result;
    }
    public int maxId() {
        int i=0;
        try {
            ps = connection.prepareStatement("SELECT (max(id)+1) as idx from calculadora ");
            rs = ps.executeQuery();
            if (rs.next()) {
                i= rs.getInt("idx");
            }
            return i;
        } catch (Exception e) {
            return i;
        }
    }


}
