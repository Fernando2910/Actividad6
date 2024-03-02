//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombrealumno = "Fer";
        double[] calificaciones = { 100, 70, 72, 100, 99 };
        Alumno alumno = new Alumno(nombrealumno, calificaciones);
        alumno.imprimirResultados();
    }
}