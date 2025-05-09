package pe.edu.upeu.calcfx.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;
@Data
@Entity(name="venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVenta;
    @OneToMany(mappedBy="venta")
    List<VentaDetalle> ventaDetalles;
}
