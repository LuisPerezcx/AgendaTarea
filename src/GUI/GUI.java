package GUI;

import persona.Contacto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame{
    private JTextField txtApellidos;
    private JTextField txtEmpresa;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JTextField txtNombre;
    private JPanel contenedor;
    private JButton registrarButton;
    private JButton verContactosButton;
    private static ArrayList<Contacto> contactos = new ArrayList<>();

    public GUI(){
        setupFrame();
        add(contenedor);
        addListeners();
    }
    private void setupFrame() {
        setTitle("Formulario Estudiantes");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(300, 230);
    }
    private void addListeners(){
        verContactosButton.addActionListener(e -> {
            setVisible(false);
            new verGUI();
        });
        registrarButton.addActionListener(new eventClick());
    }
    private void clear(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEmpresa.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }
    public class eventClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            String empresa = txtEmpresa.getText();
            String tel = txtTelefono.getText();
            String correo = txtCorreo.getText();

            contactos.add(new Contacto(nombre,apellidos,empresa,tel,correo));
            mostrar(contactos);

            clear();
        }
    }
    public void mostrar(ArrayList<Contacto> lista){
        System.out.println("----------ALUMNOS----------");
        for (Contacto contacto:lista) {
            System.out.println(contacto);
            System.out.println("*********************************************************");
        }
    }

    public static ArrayList<Contacto> getContactos() {
        return contactos;
    }
}

