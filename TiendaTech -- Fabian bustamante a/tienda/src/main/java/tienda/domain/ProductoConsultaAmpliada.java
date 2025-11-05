package tienda.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para la consulta ampliada de productos con estadísticas por categoría
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoConsultaAmpliada implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idCategoria;
    private String nombreCategoria;
    private Long totalProductos;
    private BigDecimal precioPromedio;
    private BigDecimal precioMinimo;
    private BigDecimal precioMaximo;
    private Long totalExistencias;
    private BigDecimal valorTotalInventario;
    private Long productosActivos;
    private Long productosInactivos;
    private Long productosConStockBajo; // Stock menor a 10 unidades

}

