package pe.edu.upeu.calcfx.servicio;

import pe.edu.upeu.calcfx.modelo.CalcTO;
import java.util.*;
public interface CalcServiceI {

    public List<CalcTO> findAll();
    public CalcTO findById(int index);
    public void save(CalcTO calcTO);
    //public CalcTO delete(CalcTO calcTO);
    public CalcTO update(CalcTO calcTO, int index);

    public void delete(CalcTO calcTO);
    public void deleteById(int index);
}
