package Views;

import Controller.ObjectController;
import Model.Autorizaciones;
import Model.Diagnosticos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class diagnosticoView extends JFrame{
    private JPanel viewDiagnostico;
    private JTextField diagnostico_id;
    private JTextField descripcion_diagnostico;
    private JTextField cita_id;
    private JTextField examen_id;
    private JTextField medico_id;
    private JTextField fecha_diagnostico;
    private JTextField afiliado_id;
    private JButton crearDiagnosticoButton;
    private JTextField autorizacion_id_diagnostico;
    private JTextField fecha_autorizacion_diagnostico;
    private JTextField estado_autorizacion_diagnostico;

    public diagnosticoView(ObjectController objectController,String autorizacion_id, String fecha_autorizacion,
                           String estado_autorizacion) {
        autorizacion_id_diagnostico.setText(autorizacion_id);
        fecha_autorizacion_diagnostico.setText(fecha_autorizacion);
        estado_autorizacion_diagnostico.setText(estado_autorizacion);
        autorizacion_id_diagnostico.setEditable(false);
        fecha_autorizacion_diagnostico.setEditable(false);
        estado_autorizacion_diagnostico.setEditable(false);
        crearDiagnosticoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objectController.listaAutorizaciones(new Autorizaciones(Integer.parseInt(autorizacion_id),
                        fecha_autorizacion,estado_autorizacion,new Diagnosticos(Integer.parseInt(diagnostico_id.getText()),
                        descripcion_diagnostico.getText(),Integer.parseInt(cita_id.getText()),
                        Integer.parseInt(examen_id.getText()),Integer.parseInt(medico_id.getText()),
                        fecha_diagnostico.getText(),Integer.parseInt(afiliado_id.getText()))));
                System.out.println(objectController.getListaAutorizaciones());
                setVisible(false);
            }
        });

        setContentPane(viewDiagnostico);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public diagnosticoView(Autorizaciones autorizacionBusacada) {
        Diagnosticos diagnostico = (Diagnosticos) autorizacionBusacada.getServicio_autorizado();
        autorizacion_id_diagnostico.setText(String.valueOf(autorizacionBusacada.getAutorizacion_id()));
        fecha_autorizacion_diagnostico.setText(autorizacionBusacada.getFecha_autorizacion());
        estado_autorizacion_diagnostico.setText(autorizacionBusacada.getEstado_autorizacion());
        diagnostico_id.setText(String.valueOf(diagnostico.getDiagnostico_id()));
        descripcion_diagnostico.setText(diagnostico.getDescripcion_diagnostico());
        cita_id.setText(String.valueOf(diagnostico.getCita_id()));
        examen_id.setText(String.valueOf(diagnostico.getExamen_id()));
        medico_id.setText(String.valueOf(diagnostico.getMedico_id()));
        fecha_diagnostico.setText(diagnostico.getFecha_diagnostico());
        afiliado_id.setText(String.valueOf(diagnostico.getAfiliado_id()));
        autorizacion_id_diagnostico.setEditable(false);
        fecha_autorizacion_diagnostico.setEditable(false);
        estado_autorizacion_diagnostico.setEditable(false);
        diagnostico_id.setEditable(false);
        descripcion_diagnostico.setEditable(false);
        cita_id.setEditable(false);
        examen_id.setEditable(false);
        medico_id.setEditable(false);
        fecha_diagnostico.setEditable(false);
        afiliado_id.setEditable(false);
        setContentPane(viewDiagnostico);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}
