package pe.edu.upeu.calcfx.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data //ya tiene el set y geeter // metodos
@Entity
public class Categoria {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCategoria;
    @Column(name = "nombre_categoria")
    String nombre;
}
