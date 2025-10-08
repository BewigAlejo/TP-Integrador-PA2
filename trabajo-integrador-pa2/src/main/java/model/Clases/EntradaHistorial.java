package model.Clases;
import java.time.LocalDate;
import java.util.ArrayList;

public class EntradaHistorial {
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private ArrayList<Veterinario> veterinarios;
    private Integer id;

    public EntradaHistorial(LocalDate fecha, String diagnostico, String tratamiento, ArrayList<Veterinario> veterinarios) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.veterinarios = veterinarios;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

}
