package model.Clases;

public class Zona {
    private Integer id;
    private String nombre;
    private Double coord_lat , coord_lon;
    private static int idCounter = 0;

    public Zona(String nombre, Double coord_lat, Double coord_lon) {
        this.id = ++idCounter;
        this.nombre = nombre;
        this.coord_lat = coord_lat;
        this.coord_lon = coord_lon;
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
}
