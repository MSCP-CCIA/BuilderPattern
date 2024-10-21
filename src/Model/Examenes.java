package Model;

public class Examenes {
    public int examen_id;
    public String nombre_examen;
    public String descripcion_examen;
    public String fecha_examen;
    public String resultado_examen;
    public int afiliado_id;

    public Examenes() {
    }

    public Examenes(int examen_id, String nombre_examen, String descripcion_examen, String fecha_examen, String resultado_examen, int afiliado_id) {
        this.examen_id = examen_id;
        this.nombre_examen = nombre_examen;
        this.descripcion_examen = descripcion_examen;
        this.fecha_examen = fecha_examen;
        this.resultado_examen = resultado_examen;
        this.afiliado_id = afiliado_id;
    }

    public int getExamen_id() {
        return examen_id;
    }

    public void setExamen_id(int examen_id) {
        this.examen_id = examen_id;
    }

    public String getNombre_examen() {
        return nombre_examen;
    }

    public void setNombre_examen(String nombre_examen) {
        this.nombre_examen = nombre_examen;
    }

    public String getDescripcion_examen() {
        return descripcion_examen;
    }

    public void setDescripcion_examen(String descripcion_examen) {
        this.descripcion_examen = descripcion_examen;
    }

    public String getFecha_examen() {
        return fecha_examen;
    }

    public void setFecha_examen(String fecha_examen) {
        this.fecha_examen = fecha_examen;
    }

    public String getResultado_examen() {
        return resultado_examen;
    }

    public void setResultado_examen(String resultado_examen) {
        this.resultado_examen = resultado_examen;
    }

    public int getAfiliado_id() {
        return afiliado_id;
    }

    public void setAfiliado_id(int afiliado_id) {
        this.afiliado_id = afiliado_id;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "examen_id=" + examen_id +
                ", nombre_examen='" + nombre_examen + '\'' +
                ", descripcion_examen='" + descripcion_examen + '\'' +
                ", fecha_examen='" + fecha_examen + '\'' +
                ", resultado_examen='" + resultado_examen + '\'' +
                ", afiliado_id='" + afiliado_id + '\'' +
                '}';
    }
}
