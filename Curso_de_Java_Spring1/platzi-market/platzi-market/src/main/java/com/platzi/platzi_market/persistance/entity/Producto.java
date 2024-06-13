package com.platzi.platzi_market.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity //Indica que está clase va a ser utilizada para mapear una tabla de la base de datos
@Table(name="productos") //cuando hay diferencias de nombres y queremos referenciar a la tabla que queremos
public class Producto {

    @Id //se pone porque es la llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //porque se va a crear los ids de manera automatica
                                                        //esta col es la PK entonces esto permite que Java tambien genere este valor de manera automática
    @Column(name = "id_producto") //igual aplicamos esto para definir ue es el nombre de la columnaque vamos a referenciar
    private Integer idProducto; //Es necesario poner Integer y no int

    private String nombre; //esta igual el nombre de la columna con esta clase

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name= "cantidad_stock")
    private Integer cantidadStock;

    private  Boolean estado;

    @ManyToOne //definimos la relación entre las tablas producto y categoria
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) //name: PK de categoria, insertable:no se borrara ni insertara(false), updatable: (no se actualizará)
    private Categoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
