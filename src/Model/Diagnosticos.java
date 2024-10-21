package Model;

public class Diagnosticos {
    public int diagnostico_id;
    public String descripcion_diagnostico;
    public int cita_id;
    public int examen_id;
    public int medico_id;
    public String fecha_diagnostico;
    public int afiliado_id;

    public Diagnosticos() {
    }

    public Diagnosticos(int diagnostico_id, String descripcion_diagnostico, int cita_id, int examen_id, int medico_id,
                        String fecha_diagnostico, int afiliado_id) {
        this.diagnostico_id = diagnostico_id;
        this.descripcion_diagnostico = descripcion_diagnostico;
        this.cita_id = cita_id;
        this.examen_id = examen_id;
        this.medico_id = medico_id;
        this.fecha_diagnostico = fecha_diagnostico;
        this.afiliado_id = afiliado_id;
    }

    public int getDiagnostico_id() {
        return diagnostico_id;
    }

    public void setDiagnostico_id(int diagnostico_id) {
        this.diagnostico_id = diagnostico_id;
    }

    public String getDescripcion_diagnostico() {
        return descripcion_diagnostico;
    }

    public void setDescripcion_diagnostico(String descripcion_diagnostico) {
        this.descripcion_diagnostico = descripcion_diagnostico;
    }

    public int getCita_id() {
        return cita_id;
    }

    public void setCita_id(int cita_id) {
        this.cita_id = cita_id;
    }

    public int getExamen_id() {
        return examen_id;
    }

    public void setExamen_id(int examen_id) {
        this.examen_id = examen_id;
    }

    public int getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(int medico_id) {
        this.medico_id = medico_id;
    }

    public String getFecha_diagnostico() {
        return fecha_diagnostico;
    }

    public void setFecha_diagnostico(String fecha_diagnostico) {
        this.fecha_diagnostico = fecha_diagnostico;
    }

    public int getAfiliado_id() {
        return afiliado_id;
    }

    public void setAfiliado_id(int afiliado_id) {
        this.afiliado_id = afiliado_id;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "diagnostico_id=" + diagnostico_id +
                ", descripcion_diagnostico='" + descripcion_diagnostico + '\'' +
                ", cita_id=" + cita_id +
                ", examen_id=" + examen_id +
                ", medico_id=" + medico_id +
                ", fecha_diagnostico='" + fecha_diagnostico + '\'' +
                ", afiliado_id='" + afiliado_id + '\'' +
                '}';
    }
}
