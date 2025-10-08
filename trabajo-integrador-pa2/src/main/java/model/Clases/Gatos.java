package model.Clases;
import model.enums.EstadoSalud;

public class Gatos {
    private Integer id;
    private String nombre;
    private String raza;
    private Integer edad;
    private EstadoSalud estado;
    private Boolean adoptado;
    private static int idCounter = 0;

    public Gatos(String nombre, String raza, Integer edad, EstadoSalud estado, Boolean adoptado) {
        this.id = ++idCounter;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.estado = estado;
        this.adoptado = adoptado;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public EstadoSalud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSalud estado) {
        this.estado = estado;
    }

    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    
}
