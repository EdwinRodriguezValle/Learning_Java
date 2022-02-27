/*
Nombre: Edwin Rodriguez Valle
Titulo: BSa Monitor
Objetivo: Monitorear el sistema de notas de los estudiantes
*/
package Controller;

import java.util.Scanner;

public class MonitorDeNotas {
         public static void main(String[] args) {
            double NOTA_MAS_ALTA = 10.0;
            final double NOTA_MAS_BAJA = 1.0;
            final double APROBADO = 5.5;
            final double BSA_RATIO = 5/6.0;
            Scanner input = new Scanner(System.in);

            String[] nombre = {"Introduccion", "Programacion", "Usuario de interfase", "Base de datos", "OOP 1",
                    "Habilidades personales", "Habilidades en Projectos " };
            int[] puntaPorCurso = { 12, 3, 3, 3, 3, 2, 2};
            double[] notasPorCurso = new double[nombre.length];
            int totalDePuntosAcumulados = determinarPuntajeTotal(puntaPorCurso);
            int totalDePuntosAcumuladosPorElEstudiante;
            System.out.println("Ingrese sus notas:");
            for (int index = 0; index < nombre.length; index++) {
                System.out.printf("%s: ", nombre[index]);
                double cijfer;
                do {
                    cijfer = input.nextDouble();
                    if(cijfer <= NOTA_MAS_BAJA || cijfer > NOTA_MAS_ALTA) {
                        System.out.printf("INcorrecto!\n Las notas debes ser entre:  %.1f en %.1f.\nIntenta otra vez: ", NOTA_MAS_BAJA, NOTA_MAS_ALTA );
                    }
                } while (cijfer <= NOTA_MAS_BAJA || cijfer > NOTA_MAS_ALTA);
                notasPorCurso[index] = cijfer;
            }

            for (int index = 0; index < notasPorCurso.length; index++) {
                if(notasPorCurso[index] < APROBADO) {
                    puntaPorCurso[index] = 0;
                }
            }
            totalDePuntosAcumuladosPorElEstudiante = determinarPuntajeTotal(puntaPorCurso);

            for (int index = 0; index < nombre.length; index++) {
                System.out.printf("Are/proyecto: %-30s Cijfer: %-4.1f Puntos acumulados: %-3d\n", nombre[index], notasPorCurso[index], puntaPorCurso[index]);
            }


            System.out.printf("\nTotal de puntos obtenidos: %d/%d\n", totalDePuntosAcumuladosPorElEstudiante, totalDePuntosAcumulados);

            if(totalDePuntosAcumuladosPorElEstudiante < BSA_RATIO * totalDePuntosAcumulados) {
                System.out.println("Cuidado, no tienes un buen consejo!");
            }
        }

        public static int determinarPuntajeTotal(int[] mpPuntenRij) {
            int total = 0;
            for (int i = 0; i < mpPuntenRij.length; i++) {
                total += mpPuntenRij[i];
            }
            return total;
        }
    }

