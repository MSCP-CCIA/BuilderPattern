package Views;

import Controller.ObjectController;
import Model.Autorizaciones;
import Model.Examenes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class examenView extends JFrame {
    private JTextField examen_id;
    private JTextField nombre_examen;
    private JTextField descripcion_examen;
    private JTextField fecha_examen;
    private JTextField resultado_examen;
    private JTextField afiliado_id;
    private JButton crearExamenButton;
    private JPanel examenView;
    private JTextField autorizacion_id_examen;
    private JTextField fecha_autorizacion_examen;
    private JTextField estado_autorizacion_examen;
    public examenView(ObjectController objectController,String autorizacion_id, String fecha_autorizacion,
                      String estado_autorizacion) {
        autorizacion_id_examen.setText(autorizacion_id);
        fecha_autorizacion_examen.setText(fecha_autorizacion);
        estado_autorizacion_examen.setText(estado_autorizacion);
        autorizacion_id_examen.setEditable(false);
        fecha_autorizacion_examen.setEditable(false);
        estado_autorizacion_examen.setEditable(false);
        crearExamenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objectController.listaAutorizaciones(new Autorizaciones(Integer.parseInt(autorizacion_id),
                        fecha_autorizacion,estado_autorizacion,new Examenes(Integer.parseInt(examen_id.getText()),
                        nombre_examen.getText(),descripcion_examen.getText(),fecha_examen.getText(),resultado_examen.getText(),
                        Integer.parseInt(afiliado_id.getText()))));
                System.out.println(objectController.getListaAutorizaciones());
                setVisible(false);
            }
        });
        setContentPane(examenView);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public examenView(Autorizaciones autorizacionBusacada){
        Examenes examen = (Examenes) autorizacionBusacada.getServicio_autorizado();
        autorizacion_id_examen.setText(String.valueOf(autorizacionBusacada.getAutorizacion_id()));
        fecha_autorizacion_examen.setText(autorizacionBusacada.getFecha_autorizacion());
        estado_autorizacion_examen.setText(autorizacionBusacada.getEstado_autorizacion());
        examen_id.setText(String.valueOf(examen.getExamen_id()));
        nombre_examen.setText(examen.getNombre_examen());
        descripcion_examen.setText(examen.getDescripcion_examen());
        fecha_examen.setText(examen.getFecha_examen());
        resultado_examen.setText(examen.getResultado_examen());
        afiliado_id.setText(String.valueOf(examen.getAfiliado_id()));
        autorizacion_id_examen.setEditable(false);
        fecha_autorizacion_examen.setEditable(false);
        estado_autorizacion_examen.setEditable(false);
        examen_id.setEditable(false);
        nombre_examen.setEditable(false);
        descripcion_examen.setEditable(false);
        fecha_autorizacion_examen.setEditable(false);
        resultado_examen.setEditable(false);
        afiliado_id.setEditable(false);
        setContentPane(examenView);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);
    }

}
