public class Alumno {
    private String nombre;
    private double[] calificaciones;

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        char calificacionFinal;
        if (promedio >= 91) {
            calificacionFinal = 'A';
        } else if (promedio >= 81) {
            calificacionFinal = 'B';
        } else if (promedio >= 71) {
            calificacionFinal = 'C';
        } else if (promedio >= 61) {
            calificacionFinal = 'D';
        } else if (promedio >= 51) {
            calificacionFinal = 'E';
        } else {
            calificacionFinal = 'F';
        }
        return calificacionFinal;
    }

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}
