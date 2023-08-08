package main.java.com.poo.alumnos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SistemaAlumnos {
    private List<Alumno> alumnos;

    public SistemaAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno nuevoAlumno) {
        alumnos.add(nuevoAlumno);
    }

    public void asignarCalificacion(int codigo, double valor) {
        Alumno alumnoEncontrado = buscarAlumno(codigo);
        if (alumnoEncontrado != null) {
            alumnoEncontrado.agregarCalificacion(valor);
        } else {
            JOptionPane.showMessageDialog(null, "El alumno con código " + codigo + " no está registrado.");
        }
    }

    public void mostrarInformacionAlumno(int codigo) {
        Alumno alumnoEncontrado = buscarAlumno(codigo);
        if (alumnoEncontrado != null) {
            System.out.println(alumnoEncontrado.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El alumno con código " + codigo + " no está registrado.");
        }
    }

    private Alumno buscarAlumno(int codigo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo() == codigo) {
                return alumno;
            }
        }
        return null;
    }

    public void mostrarMenu() {
        String menu = "";
        int op = 0;
        do {
            menu = "";
            menu += "****** Taller 2 POO ******\n";
            menu += "1.- Agregar alumno\n";
            menu += "2.- Asignar calificación\n";
            menu += "3.- Mostrar información de alumno\n";
            menu += "4.- Salir \n";
            menu += "Elia una opción";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del alumno:"));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
                    String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del alumno:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno:"));
                    String direccion = JOptionPane.showInputDialog("Ingrese la direccion del alumno:");
                    String correoElectronico = JOptionPane.showInputDialog("Ingrese el correo del alumno:");
                    String numeroTelefono = JOptionPane.showInputDialog("Ingrese el numero de telefono del alumno:");
                    Alumno alumno = new Alumno(codigo, nombre, apellidos, edad, direccion, correoElectronico,
                            numeroTelefono);
                    agregarAlumno(alumno);
                    JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente", "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    int codigoAlumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del usuario:"));
                    double valorCalificacion = Double
                            .parseDouble(JOptionPane.showInputDialog("Ingrese la calificación:"));
                    asignarCalificacion(codigoAlumno, valorCalificacion);
                    break;
                case 3:
                    int codigoAlumnoInfo = Integer
                            .parseInt(JOptionPane.showInputDialog("Ingrese el código del alumno:"));
                    Alumno alumnoInfo = buscarAlumno(codigoAlumnoInfo);
                    if (alumnoInfo != null) {
                        alumnoInfo.mostrarInformacion();
                    } else {
                        JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
                    }
                    break;

            }
        } while (op != 4);
    }
}
