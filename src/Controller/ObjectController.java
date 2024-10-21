package Controller;

import Model.Autorizaciones;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectController {

    public List<Autorizaciones> listaAutorizaciones = new ArrayList<>();
    public ObjectController() {
    }
    public void listaAutorizaciones(Autorizaciones autorizacion){
        listaAutorizaciones.add(autorizacion);
    }
    public Autorizaciones buscaAutorizacion(int autorizacion_id){
        for(Autorizaciones autorizacion : listaAutorizaciones){
            if(autorizacion.getAutorizacion_id() == autorizacion_id){
                return autorizacion;
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe el objeto", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }
        }return null;
    }
    public List<Autorizaciones> getListaAutorizaciones() {
        return listaAutorizaciones;
    }

    @Override
    public String toString() {
        return "ObjectController{" +
                "listaAutorizaciones=" + listaAutorizaciones +
                '}';
    }
}
