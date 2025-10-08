package model.Clases;

import java.time.LocalDate;

import model.enums.EstadoTarea;
import model.enums.TipoTarea;



public class Tarea {
    private Integer id;
    private String descripcion;
    private Voluntario asignadaA;
    private LocalDate fecha;
    private TipoTarea tipo;
    private EstadoTarea estado;
    private Gatos gato;
    private String observacion;
    private static int idCounter = 0;

    public Tarea(String descripcion, Voluntario asignadaA, LocalDate fecha, TipoTarea tipo, EstadoTarea estado,
            Gatos gato, Zona zona, String observacion) {
        this.id = ++idCounter;
        this.descripcion = descripcion;
        this.asignadaA = asignadaA;
        this.fecha = fecha;
        this.tipo = tipo;
        this.estado = estado;
        this.gato = gato;
        this.observacion = observacion;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getAsignadaA() {
        return asignadaA;
    }

    public void setAsignadaA(Voluntario asignadaA) {
        this.asignadaA = asignadaA;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoTarea getTipo() {
        return tipo;
    }

    public void setTipo(TipoTarea tipo) {
        this.tipo = tipo;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    public Gatos getGato() {
        return gato;
    }

    public void setGato(Gatos gato) {
        this.gato = gato;
    }


    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    


}
