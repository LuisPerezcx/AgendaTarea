package GUI;

import persona.Contacto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class verGUI extends JFrame {
    private JTable jTable;
    private JPanel panel1;
    private JButton regresarButton;
    private DefaultTableModel modelo;
    public verGUI (){
        initControl();
        configTable();
        configFrame();
        add(panel1);
        addActionListeners();
    }
    private void addActionListeners() {
        regresarButton.addActionListener(e -> {
            setVisible(false);
            new GUI();
        });
    }
    private void initControl(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(Util.titulos);
        String [] fila = new String[modelo.getColumnCount()];
        ArrayList<Contacto> lista = GUI.getContactos();
        for (Contacto userTable : lista) {
            fila[0] = userTable.getNombre();
            fila[1] = userTable.getApellidos();
            fila[2] = userTable.getEmpresa();
            fila[3] = userTable.getTelefono();
            fila[4] = userTable.getCorreo();
            modelo.addRow(fila);
        }
        jTable = new JTable(modelo);
    }
    private void configFrame() {
        setTitle("Tabla de usuarios");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // Establecer BoxLayout vertical
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 300);
        setResizable(true);
        setVisible(true);
    }

    private void configTable() {
        jTable.setGridColor(new Color(88, 214, 141));
        jTable.setPreferredScrollableViewportSize(new Dimension(600, 300));
        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane);
    }

    public class Util{
        static String[] titulos = {"NOMBRE","APELLIDOS","EMPRESA","TELEFONO","CORREO"};
    }
}
