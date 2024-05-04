import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Pelicula Matrix");
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionesUsuario=0;
        System.out.println("Pelicula:" + nombre);
        System.out.println("Año:" + fechaDeLanzamiento);
        System.out.println("Calificación:" + evaluacion);
        System.out.println("Descripcion:" + sinopsis);
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evaluación:" + mediaEvaluacion);
        if (fechaDeLanzamiento > 1999) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro");
        }
        for(int i=0;i<3;i++){
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingresa la nota o evaluación que le darías a Matrix");
            double notaMatrix=teclado.nextDouble();

            mediaEvaluacionesUsuario=mediaEvaluacionesUsuario+notaMatrix/3;
        }
        System.out.println("La media de Matrix calculada por el usuario es: " +
                mediaEvaluacion/3);
    }
    }
