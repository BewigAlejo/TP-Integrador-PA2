package model.Clases;
import model.enums.Rol.TipoRolEnum;


public abstract class Usuario {
    private Integer id;
    private String nombre;
    private String email;
    private String telefono;
    private TipoRolEnum rol;
    
    public Usuario(String nombre, String email, String telefono, TipoRolEnum rol) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoRolEnum getRol() {
        return rol;
    }

    public void setRol(TipoRolEnum rol) {
        this.rol = rol;
    }

    
}
