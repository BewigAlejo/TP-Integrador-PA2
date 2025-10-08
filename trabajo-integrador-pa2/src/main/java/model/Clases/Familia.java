package model.Clases;
import model.enums.Rol.TipoRolEnum;

public class Familia extends Usuario {
    private String direccion;
    private Double coord_lat , coord_lon;
    private Integer reputacion; // 0 a 5


    public Familia(String nombre, String email, String telefono, String direccion, Double coord_lat,
            Double coord_lon, Integer reputacion) {
        super(nombre, email, telefono, TipoRolEnum.FAMILIA);
        this.direccion = direccion;
        this.coord_lat = coord_lat;
        this.coord_lon = coord_lon;
        this.reputacion = reputacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Double getCoord_lat() {
        return coord_lat;
    }



    public void setCoord_lat(Double coord_lat) {
        this.coord_lat = coord_lat;
    }



    public Double getCoord_lon() {
        return coord_lon;
    }



    public void setCoord_lon(Double coord_lon) {
        this.coord_lon = coord_lon;
    }



    public Integer getReputacion() {
        return reputacion;
    }

    public void setReputacion(Integer reputacion) {
        this.reputacion = reputacion;
    }

    
}
