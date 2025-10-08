package model.Clases;
import model.enums.Rol.TipoRolEnum;


public class Veterinario extends Usuario {
    private String especialidad;
    private Integer matricula;

    
    public Veterinario(String nombre, String email, String telefono, String especialidad,
            Integer matricula) {
        super(nombre, email, telefono, TipoRolEnum.VETERINARIO);
        this.especialidad = especialidad;
        this.matricula = matricula;
    }

    public String getEspecialidad() { 
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    

}
