/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula_practica5;

import java.util.Scanner;
import descuento.Porcentajes;


/**
 *
 * @author TIMO
 */
public class Matricula_practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion de variables
        int ciudad;
        double costo;
        double matriculaInicial = 1330;
        int edad;
        int estadoCivil;
        int cargaFamiliar;
        double desc1 = Porcentajes.desc1;
        double desc2 = Porcentajes.desc2;
        double desc3 = Porcentajes.desc3;
        double desc4 = Porcentajes.desc4; 
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de datos por teclado
        System.out.println("Ingrese su ciudad de procedencia\n1.Zamora o Loja\n"
                + "2.Otra ciudad");
        ciudad = entrada.nextInt();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese su estado civil\n1.Casado\n2.Soltero");
        estadoCivil = entrada.nextInt();
        System.out.println("¿Tiene cargas familiares?\n1.Si\n2.No");
        cargaFamiliar = entrada.nextInt();

        //Proceso
        if (ciudad ==1 || ciudad == 2){
            costo = (1330 - Porcentajes.desc1);
        }else {
            costo = matriculaInicial;
        }
        if (edad >=17 && edad <20) {
            costo = (costo - Porcentajes.desc2);
        }
        if (estadoCivil == 1) {
            costo = (costo - Porcentajes.desc3);
        }
        if (cargaFamiliar == 1) {
            costo = (costo - Porcentajes.desc4);   
        }
        costo = costo + (costo * 0.02);        
        // Salida de datos
        System.out.printf("El costo de su matrícula es: %.2f", costo);   
        }
}
        

    

