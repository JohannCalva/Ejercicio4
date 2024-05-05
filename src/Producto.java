import javax.swing.*;
import java.text.DecimalFormat;

public class Producto {
    String nombre;
    int cantidad;
    float precioSinIVA;
    float precioConIVA;
    float total;
    DecimalFormat formato = new DecimalFormat("#.00");
    public Producto(){
        ingresoProducto();
        calculoIVA();
        pagoTotal();
    }
    public void ingresoProducto(){
        JOptionPane.showMessageDialog(null, "Ingrese los datos del producto para determinar su costo");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
        do{
            precioSinIVA = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio sin IVA: "));
            if(precioSinIVA < 0){
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor positivo");
            }
        }while(precioSinIVA < 0);
    }
    public void calculoIVA(){
        if(precioSinIVA <= 500){
            precioConIVA = precioSinIVA * 1.12F;
            JOptionPane.showMessageDialog(null, "El producto tiene 12% de IVA. Valor: " +formato.format(precioConIVA));
        }else{
            if(precioSinIVA <= 1500){
                precioConIVA = precioSinIVA * 1.14F;
                JOptionPane.showMessageDialog(null, "El producto tiene 14% de IVA. Valor: " +formato.format(precioConIVA));
            }else{
                precioConIVA = precioSinIVA * 1.15F;
                JOptionPane.showMessageDialog(null, "El producto tiene 15% de IVA. Valor: " +formato.format(precioConIVA));
            }
        }
    }
    public void pagoTotal(){
        total = precioConIVA * cantidad;
        JOptionPane.showMessageDialog(null, "El total a pagar por la cantidad " + cantidad + " del producto " + nombre + " es " + formato.format(total));
    }
}
