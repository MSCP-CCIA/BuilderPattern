package Model;

public class AutorizacionMedicamento implements Builder<Autorizaciones> {
    public int autorizacion_id;
    public String fecha_autorizacion;
    public String estado_autorizacion;
    public Medicamentos servicio_autorizado;

    public AutorizacionMedicamento setAutorizacion_id(int autorizacion_id) {
        this.autorizacion_id = autorizacion_id;
        return this;
    }

    public AutorizacionMedicamento setFecha_autorizacion(String fecha_autorizacion) {
        this.fecha_autorizacion = fecha_autorizacion;
        return this;

    }

    public AutorizacionMedicamento setEstado_autorizacion(String estado_autorizacion) {
        this.estado_autorizacion = estado_autorizacion;
        return this;
    }

    public AutorizacionMedicamento setServicio_autorizado(Medicamentos servicio_autorizado) {
        this.servicio_autorizado = servicio_autorizado;
        return this;
    }
    public AutorizacionMedicamento setServicio_autorizado(int medicamento_id, String nombre_medicamento,
                                                          String descripcion_medicamento, int diagnostico_id,
                                                          String dosis, String frecuencia, int afiliado_id) {
        this.servicio_autorizado = new Medicamentos(medicamento_id,nombre_medicamento,descripcion_medicamento,
                diagnostico_id, dosis, frecuencia, afiliado_id);
        return this;
    }

    @Override
    public Autorizaciones Build() {
        return new Autorizaciones(autorizacion_id,fecha_autorizacion,estado_autorizacion,servicio_autorizado);
    }
}
