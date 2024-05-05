import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String continuar;
        JOptionPane.showMessageDialog(null, "Bienvenido a Supermaxi.");

        do{
            Producto prod = new Producto();
            continuar = JOptionPane.showInputDialog("Desea ingresar otro producto? (y/n)");
        }while(continuar.equals("y"));

        JOptionPane.showMessageDialog(null, "Gracias por usar.");
    }
}