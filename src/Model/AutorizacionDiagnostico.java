package Model;

public class AutorizacionDiagnostico implements Builder<Autorizaciones> {
    public int autorizacion_id;
    public String fecha_autorizacion;
    public String estado_autorizacion;
    public Diagnosticos servicio_autorizado;


    public AutorizacionDiagnostico setAutorizacion_id(int autorizacion_id) {
        this.autorizacion_id = autorizacion_id;
        return this;
    }

    public AutorizacionDiagnostico setFecha_autorizacion(String fecha_autorizacion) {
        this.fecha_autorizacion = fecha_autorizacion;
        return this;

    }


    public AutorizacionDiagnostico setEstado_autorizacion(String estado_autorizacion) {
        this.estado_autorizacion = estado_autorizacion;
        return this;
    }

    public AutorizacionDiagnostico setServicio_autorizado(Diagnosticos servicio_autorizado) {
        this.servicio_autorizado = servicio_autorizado;
        return this;
    }
    public AutorizacionDiagnostico setServicio_autorizado(int diagnostico_id, String descripcion_diagnostico, int cita_id, int
            examen_id, int medico_id, String fecha_diagnostico, int afiliado_id) {
        this.servicio_autorizado = new Diagnosticos(diagnostico_id,descripcion_diagnostico,cita_id,examen_id,medico_id,
                fecha_diagnostico,afiliado_id);
        return this;
    }

    @Override
    public Autorizaciones Build() {
        return new Autorizaciones(autorizacion_id,fecha_autorizacion,estado_autorizacion,servicio_autorizado);
    }
}
