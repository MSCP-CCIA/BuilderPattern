package Model;

public class Medicamentos {
    public int medicamento_id;
    public String nombre_medicamento;
    public String descripcion_medicamento;
    public int diagnostico_id ;
    public String dosis;
    public String frecuencia ;
    public int afiliado_id;

    public Medicamentos() {
    }

    public Medicamentos(int medicamento_id, String nombre_medicamento, String descripcion_medicamento, int diagnostico_id, String dosis, String frecuencia, int afiliado_id) {
        this.medicamento_id = medicamento_id;
        this.nombre_medicamento = nombre_medicamento;
        this.descripcion_medicamento = descripcion_medicamento;
        this.diagnostico_id = diagnostico_id;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.afiliado_id = afiliado_id;
    }

    public int getMedicamento_id() {
        return medicamento_id;
    }

    public void setMedicamento_id(int medicamento_id) {
        this.medicamento_id = medicamento_id;
    }

    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    public String getDescripcion_medicamento() {
        return descripcion_medicamento;
    }

    public void setDescripcion_medicamento(String descripcion_medicamento) {
        this.descripcion_medicamento = descripcion_medicamento;
    }

    public int getDiagnostico_id() {
        return diagnostico_id;
    }

    public void setDiagnostico_id(int diagnostico_id) {
        this.diagnostico_id = diagnostico_id;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getAfiliado_id() {
        return afiliado_id;
    }

    public void setAfiliado_id(int afiliado_id) {
        this.afiliado_id = afiliado_id;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "medicamento_id=" + medicamento_id +
                ", nombre_medicamento='" + nombre_medicamento + '\'' +
                ", descripcion_medicamento='" + descripcion_medicamento + '\'' +
                ", diagnostico_id=" + diagnostico_id +
                ", dosis='" + dosis + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", afiliado_id='" + afiliado_id + '\'' +
                '}';
    }
}
