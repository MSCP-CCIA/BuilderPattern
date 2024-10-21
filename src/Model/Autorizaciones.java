package Model;

public class Autorizaciones {
    public int autorizacion_id;
    public String fecha_autorizacion;
    public String estado_autorizacion;
    public Object servicio_autorizado;



    public Autorizaciones(int autorizacion_id, String fecha_autorizacion, String estado_autorizacion, Object servicio_autorizado) {
        this.autorizacion_id = autorizacion_id;
        this.fecha_autorizacion = fecha_autorizacion;
        this.estado_autorizacion = estado_autorizacion;
        this.servicio_autorizado = servicio_autorizado;
    }

    public int getAutorizacion_id() {
        return autorizacion_id;
    }

    public void setAutorizacion_id(int autorizacion_id) {
        this.autorizacion_id = autorizacion_id;
    }

    public String getFecha_autorizacion() {
        return fecha_autorizacion;
    }

    public void setFecha_autorizacion(String fecha_autorizacion) {
        this.fecha_autorizacion = fecha_autorizacion;
    }

    public String getEstado_autorizacion() {
        return estado_autorizacion;
    }

    public void setEstado_autorizacion(String estado_autorizacion) {
        this.estado_autorizacion = estado_autorizacion;
    }

    public Object getServicio_autorizado() {
        return servicio_autorizado;
    }

    public void setServicio_autorizado(Object servicio_autorizado) {
        this.servicio_autorizado = servicio_autorizado;
    }

    @Override
    public String toString() {
        return "Autorizaciones{" +
                "autorizacion_id=" + autorizacion_id +
                ", fecha_autorizacion='" + fecha_autorizacion + '\'' +
                ", estado_autorizacion='" + estado_autorizacion + '\'' +
                ", servicio_autorizado=" + servicio_autorizado +
                '}';
    }
}
