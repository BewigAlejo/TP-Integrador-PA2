package model.Clases;
import java.util.ArrayList;
import model.enums.Rol.TipoRolEnum;


public class Voluntario extends Usuario {
    private ArrayList<Tarea> tareasAsignadas;
    private String disponibilidad;
    private String experiencia;




    public Voluntario(String nombre, String email, String telefono, ArrayList<Tarea> tareasAsignadas,
            String disponibilidad, String experiencia) {
        super(nombre, email, telefono, TipoRolEnum.VOLUNTARIO);
        this.tareasAsignadas = tareasAsignadas;
        this.disponibilidad = disponibilidad;
        this.experiencia = experiencia;
    }

    public ArrayList<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void setTareasAsignadas(ArrayList<Tarea> tareasAsignadas) {
        this.tareasAsignadas = tareasAsignadas;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    
}
