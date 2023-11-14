/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author KEVIN
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String descripcion = "Este producto es para limpieza del hogar";
        int cantidad = 48;
        double precio_unitario = 12.5;
        double costo_pedido = (cantidad * precio_unitario);
        
        
        if (cantidad > 50) {
            costo_pedido = (costo_pedido - (costo_pedido * 0.15));

        }
        System.out.printf("Pedido \ndescripcion: %s\ncantidad: %d\n"
        + "precio unitario: %.2f\ncosto: %.2f", 
        descripcion, cantidad, precio_unitario, costo_pedido);
        
    }
    
    
}
