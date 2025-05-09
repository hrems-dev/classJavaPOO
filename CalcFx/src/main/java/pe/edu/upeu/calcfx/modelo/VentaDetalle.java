package pe.edu.upeu.calcfx.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="venta_detalle")
public class VentaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVentaDetalle;

    @ManyToMany
    @JoinColumn(name = "id_venta")
    Venta venta;

    @ManyToMany
    @JoinColumn(name = "id_producto")
    Venta producto;
}
