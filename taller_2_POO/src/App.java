import javax.swing.JOptionPane;

import main.java.com.poo.alumnos.Alumno;
import main.java.com.poo.alumnos.SistemaAlumnos;
import main.java.com.poo.calculadorasimple.Calculadora;
import main.java.com.poo.calculadorasimple.Division;
import main.java.com.poo.calculadorasimple.Multiplicacion;
import main.java.com.poo.calculadorasimple.Resta;
import main.java.com.poo.calculadorasimple.Suma;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        SistemaAlumnos sistemaAlumnos = new SistemaAlumnos();
        int op = 0, opHotel = 0;
        String menu = "";
        String[] opcionCalculadora = { "Suma", "Resta", "Multiplicación", "División" };
        int selectedOption;

        do {
            menu = "";
            menu += "****** Taller 2 POO ******\n";
            menu += "1.- Registro de Alumnos \n";
            menu += "2.- Conversor de Monedas \n";
            menu += "3.- Calculadora Simple \n";
            menu += "4.- Sistema de Reservas de Hotel \n";
            menu += "5.- Salir \n";
            menu += "Elia una opción";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    sistemaAlumnos.mostrarMenu();
                    break;
                case 2:

                    break;
                case 3:
                    boolean continuar = true;
                    do {
                        selectedOption = JOptionPane.showOptionDialog(null, "Selecciona una operación:",
                                "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                                null, opcionCalculadora, opcionCalculadora[0]);

                        if (selectedOption == -1) {
                            // El usuario ha cerrado el diálogo o hecho clic en "Cancelar"
                            continuar = false; // Salir del bucle
                            break;
                        }

                        switch (selectedOption) {
                            case 0:
                                calculadora.setOperacion(new Suma());
                                break;
                            case 1:
                                calculadora.setOperacion(new Resta());
                                break;
                            case 2:
                                calculadora.setOperacion(new Multiplicacion());
                                break;
                            case 3:
                                calculadora.setOperacion(new Division());
                                break;
                            default:
                                if (selectedOption == JOptionPane.CLOSED_OPTION) {
                                    // El usuario ha cerrado el diálogo
                                    JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.",
                                            "Calculadora", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    // El usuario hizo clic en "Cancelar"
                                    continuar = false; // Salir del bucle
                                }
                        }

                        if (selectedOption >= 0 && selectedOption <= 3) {
                            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
                            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
                            try {
                                double resultado = calculadora.calcular(num1, num2);
                                JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Calculadora",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error",
                                        JOptionPane.ERROR_MESSAGE);
                            }

                            int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmar",
                                    JOptionPane.YES_NO_OPTION);
                            if (confirmar != JOptionPane.YES_OPTION) {
                                continuar = false; // Salir del bucle
                            }
                        }
                    } while (continuar);
                    break;
                case 4:
                    do {
                        String menuHotel = JOptionPane.showInputDialog(
                                "Sistema de Reservas de Hotel\n" +
                                        "1. Ver hoteles y habitaciones disponibles\n" +
                                        "2. Realizar reserva\n" +
                                        "3. Cancelar reserva\n" +
                                        "4. Ver registro de clientes\n" +
                                        "5. Salir\n" +
                                        "Ingrese la opción deseada:");
                        opHotel = Integer.parseInt(menuHotel);
                        switch (opHotel) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:

                        }
                    } while (opHotel == 5);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es correcta");
                    break;
            }
        } while (op != 5);
    }

    public static int mostrarMenu() {
        String[] opciones = { "Crear Curso", "Agregar Alumno", "Agregar Asignatura", "Asignar Calificaciones",
                "Mostrar Información de Alumnos", "Salir" };
        return JOptionPane.showOptionDialog(null, "Seleccione una opción", "Sistema de Alumnos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    }

}
