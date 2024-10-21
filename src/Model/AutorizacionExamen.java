package Model;

public class AutorizacionExamen implements Builder<Autorizaciones> {
    public int autorizacion_id;
    public String fecha_autorizacion;
    public String estado_autorizacion;
    public Examenes servicio_autorizado;

    public AutorizacionExamen setAutorizacion_id(int autorizacion_id) {
        this.autorizacion_id = autorizacion_id;
        return this;
    }

    public AutorizacionExamen setFecha_autorizacion(String fecha_autorizacion) {
        this.fecha_autorizacion = fecha_autorizacion;
        return this;

    }

    public AutorizacionExamen setEstado_autorizacion(String estado_autorizacion) {
        this.estado_autorizacion = estado_autorizacion;
        return this;
    }

    public AutorizacionExamen setServicio_autorizado(Examenes servicio_autorizado) {
        this.servicio_autorizado = servicio_autorizado;
        return this;
    }
    public AutorizacionExamen setServicio_autorizado(int examen_id, String nombre_examen, String descripcion_examen,
                                                     String fecha_examen, String resultado_examen, int afiliado_id) {
        this.servicio_autorizado = new Examenes(examen_id,nombre_examen,descripcion_examen,fecha_examen,resultado_examen,afiliado_id);
        return this;
    }

    @Override
    public Autorizaciones Build() {
        return new Autorizaciones(autorizacion_id,fecha_autorizacion,estado_autorizacion,servicio_autorizado);
    }
}
