package com.platzi.platzi_market.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "estado")
    private Boolean active;

    @OneToMany(mappedBy = "categoria" ) //aqui ponemos la relación con productos y se lee que una categoria tiene varios productos
                                //que relacion respalda este nuevo atributo el cual es el nombre de categoria que es "categoria"
    private List<Producto> productos; //creamos una lista de productos

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


}