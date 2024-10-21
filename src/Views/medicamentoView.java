package Views;

import Controller.ObjectController;
import Model.Autorizaciones;
import Model.Medicamentos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class medicamentoView extends JFrame{
    private JTextField medicamento_id;
    private JTextField nombre_medicamento;
    private JTextField descripcion_medicamento;
    private JTextField diagnostico_id;
    private JTextField dosis;
    private JTextField frecuencia;
    private JTextField afiliado_id;
    private JButton crearMedicamentoButton;
    private JPanel medicamentoView;
    private JTextField autorizacion_id_medicamento;
    private JTextField fecha_autorizacion_medicamento;
    private JTextField estado_autorizacion_medicamento;


    public medicamentoView(ObjectController objectController,String autorizacion_id, String fecha_autorizacion,
                           String estado_autorizacion) {
        autorizacion_id_medicamento.setText(autorizacion_id);
        fecha_autorizacion_medicamento.setText(fecha_autorizacion);
        estado_autorizacion_medicamento.setText(estado_autorizacion);
        autorizacion_id_medicamento.setEditable(false);
        fecha_autorizacion_medicamento.setEditable(false);
        estado_autorizacion_medicamento.setEditable(false);
        crearMedicamentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objectController.listaAutorizaciones(new Autorizaciones(Integer.parseInt(autorizacion_id),
                        fecha_autorizacion,estado_autorizacion,new Medicamentos(Integer.parseInt(medicamento_id.getText()),
                        nombre_medicamento.getText(),descripcion_medicamento.getText(),Integer.parseInt(diagnostico_id.getText()),
                        dosis.getText(),frecuencia.getText(),Integer.parseInt(afiliado_id.getText()))));
                System.out.println(objectController.getListaAutorizaciones());
                setVisible(false);
            }
        });

        setContentPane(medicamentoView);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public medicamentoView(Autorizaciones autorizacionBusacada){
        Medicamentos medicamento = (Medicamentos) autorizacionBusacada.getServicio_autorizado();
        autorizacion_id_medicamento.setText(String.valueOf(autorizacionBusacada.getAutorizacion_id()));
        fecha_autorizacion_medicamento.setText(autorizacionBusacada.getFecha_autorizacion());
        estado_autorizacion_medicamento.setText(autorizacionBusacada.getEstado_autorizacion());
        medicamento_id.setText(String.valueOf(medicamento.getMedicamento_id()));
        nombre_medicamento.setText(medicamento.getNombre_medicamento());
        descripcion_medicamento.setText(medicamento.getDescripcion_medicamento());
        diagnostico_id.setText(String.valueOf(medicamento.getDiagnostico_id()));
        dosis.setText(medicamento.getDosis());
        frecuencia.setText(medicamento.getFrecuencia());
        afiliado_id.setText(String.valueOf(medicamento.getAfiliado_id()));
        autorizacion_id_medicamento.setEditable(false);
        fecha_autorizacion_medicamento.setEditable(false);
        estado_autorizacion_medicamento.setEditable(false);
        medicamento_id.setEditable(false);
        nombre_medicamento.setEditable(false);
        descripcion_medicamento.setEditable(false);
        diagnostico_id.setEditable(false);
        dosis.setEditable(false);
        frecuencia.setEditable(false);
        afiliado_id.setEditable(false);
        setContentPane(medicamentoView);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
