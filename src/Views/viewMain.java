package Views;

import Controller.ObjectController;
import Model.Autorizaciones;
import Model.Diagnosticos;
import Model.Examenes;
import Model.Medicamentos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewMain extends JFrame {

    private JButton crearDiagnosticoButton;
    private JButton crearExamenButton;
    private JButton crearMedicamentoButton;
    private JPanel mainview;
    private JTextField autorizacion_id;
    private JTextField fecha_autorizacion;
    private JTextField estado_autorizacion;
    private JButton buscarButton;
    private final ObjectController objectController = new ObjectController();

    public viewMain() {
        crearDiagnosticoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new diagnosticoView(objectController,autorizacion_id.getText(),
                       fecha_autorizacion.getText(),estado_autorizacion.getText());
               borrarCajasTexto();
            }
        });
        crearExamenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new examenView(objectController,autorizacion_id.getText(),
                        fecha_autorizacion.getText(),estado_autorizacion.getText());
                borrarCajasTexto();
            }
        });
        crearMedicamentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new medicamentoView(objectController,autorizacion_id.getText(),
                        fecha_autorizacion.getText(),estado_autorizacion.getText());
                borrarCajasTexto();
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Autorizaciones objeto_buscado= objectController.buscaAutorizacion(Integer.parseInt(autorizacion_id.getText()));
                if (objeto_buscado.servicio_autorizado instanceof Diagnosticos){
                    new diagnosticoView(objeto_buscado);
                } else if (objeto_buscado.servicio_autorizado instanceof Examenes) {
                    new examenView(objeto_buscado);
                } else if (objeto_buscado.servicio_autorizado instanceof Medicamentos) {
                    new medicamentoView(objeto_buscado);
                }
                else {
                    JOptionPane.showMessageDialog(null, "No existe el objeto", "Alerta", JOptionPane.INFORMATION_MESSAGE);

                }
                borrarCajasTexto();
            }
        });
        setContentPane(mainview);
        setTitle("View");
        setSize(800, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public void borrarCajasTexto(){
        autorizacion_id.setText("");
        fecha_autorizacion.setText("");
        estado_autorizacion.setText("");
    }
}
