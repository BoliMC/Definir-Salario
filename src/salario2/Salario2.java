/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario2;

import javax.swing.JOptionPane;

/**
 *
 * @author core
 */
public class Salario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Obtener Datos
        String cedula = JOptionPane.showInputDialog("Digite cedula empleado:");
        String nombre =JOptionPane.showInputDialog("Digite nombre de empleado:");
        double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario basico del empleado:"));
        int diasLaborados = Integer.parseInt(JOptionPane.showInputDialog("Digite los dias trabajados:"));
        double ventasDelMes = Double.parseDouble(JOptionPane.showInputDialog("Digite las ventas del mes:"));
        double prestamos = Double.parseDouble(JOptionPane.showInputDialog("Digite los prestamos del empleado:"));
        
        //sueldo devengado
        double sueldoDevengado= (salarioBasico* diasLaborados)/30;
        //Auxilio de transporte
        double salarioMinimo = 1300000;
        double auxilioTransporte = 0;
        if (salarioBasico<=salarioMinimo*2){
        auxilioTransporte=(162000*diasLaborados)/30;
        }
        //comision de ventas
        double comisionVentas =(ventasDelMes*2)/100;
        //Total devengado
        double totalDevengado=sueldoDevengado+comisionVentas;
        //Salario total
        double salarioTotal= totalDevengado+prestamos;
        
        
        //Mensaje para mostrar
        String salidaMensaje = "Numero de cedula: " + cedula + "\n" +
                "Nombre: " + nombre + "\n" +
                "Salario Basico:" + salarioBasico + "\n" +
                "Auxilio de Transporte:" + auxilioTransporte + "\n" +
                "Comision de Ventas:" + comisionVentas + "\n" +
                "Prestamos Realizados:" + prestamos + "\n" +
                "Su sueldo del mes es:" + salarioTotal;
        
        //Salario2 empleado = new Salario2("Numero de cedula: " + cedula + "\n" +
               // "Nombre: " + nombre + "\n" +
               ////// "Salario Basico:" + salarioBasico + "\n" +
               // "Auxilio de Transporte:" + auxilioTransporte + "\n" +
                ////"Comision de Ventas:" + comisionVentas + "\n" +
               // "Prestamos:" + prestamos + "\n" +
               // "Su sueldo del mes es:" + salarioTotal );
        // Resultado en pantalla
     JOptionPane.showInternalMessageDialog(null,salidaMensaje);
        
    }
    
}
