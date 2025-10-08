package model.Clases;
import java.time.LocalDate;
import java.util.ArrayList;


public class HistorialMedico {
    private LocalDate fechaApertura;
    private ArrayList<EntradaHistorial> entradas;  
    private Gatos gato;
    private static int idCounter = 0;
    private Integer id;

    public HistorialMedico(LocalDate fechaApertura, Gatos gato) {
        this.id = ++idCounter;
        this.fechaApertura = fechaApertura;
        this.entradas = new ArrayList<>();
        this.gato = gato;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public ArrayList<EntradaHistorial> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<EntradaHistorial> entradas) {
        this.entradas = entradas;
    }

    public Gatos getGato() {
        return gato;
    }

    public void setGato(Gatos gato) {
        this.gato = gato;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        HistorialMedico.idCounter = idCounter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    
}
