package model.Clases;
import java.time.LocalDate;

import model.enums.EstadoAdopcion;
import model.enums.TipoAdopcion;



public class Adopcion {
    private Integer id;
    private Gatos gato;
    private Familia familia;
    private LocalDate fechaAdopcion;
    private TipoAdopcion tipoAdopcion;
    private String observacion;
    private EstadoAdopcion estadoAdopcion;


    public Adopcion(Gatos gato, Familia familia, LocalDate fechaAdopcion, TipoAdopcion tipoAdopcion,
            String observacion, EstadoAdopcion estadoAdopcion) {
        this.gato = gato;
        this.familia = familia;
        this.fechaAdopcion = fechaAdopcion;
        this.tipoAdopcion = tipoAdopcion;
        this.observacion = observacion;
        this.estadoAdopcion = estadoAdopcion;
    }


    public Integer getId() {
        return id;
    }

    public Gatos getGato() {
        return gato;
    }


    public void setGato(Gatos gato) {
        this.gato = gato;
    }


    public Familia getFamilia() {
        return familia;
    }


    public void setFamilia(Familia familia) {
        this.familia = familia;
    }


    public LocalDate getFechaAdopcion() {
        return fechaAdopcion;
    }


    public void setFechaAdopcion(LocalDate fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }


    public TipoAdopcion getTipoAdopcion() {
        return tipoAdopcion;
    }


    public void setTipoAdopcion(TipoAdopcion tipoAdopcion) {
        this.tipoAdopcion = tipoAdopcion;
    }


    public String getObservacion() {
        return observacion;
    }


    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


    public EstadoAdopcion getEstadoAdopcion() {
        return estadoAdopcion;
    }


    public void setEstadoAdopcion(EstadoAdopcion estadoAdopcion) {
        this.estadoAdopcion = estadoAdopcion;
    }
    
    
}
