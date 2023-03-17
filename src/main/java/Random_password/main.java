package Random_password;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int T_Vector, T_Password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        T_Vector = sc.nextInt();
        Password[] vector = new Password[T_Vector];
        boolean[] vector2 = new boolean[T_Vector];
        System.out.println("Longitud de las Password");
        T_Password = sc.nextInt();
        for (int v = 0; v < T_Vector; v++) {
            vector[v] = new Password(T_Password);
            vector2[v] = vector[v].esFuerte(vector[v].getClave())==true;
        }
        for (int i = 0; i < T_Vector; i++) {
            System.out.println("Contraseña "+(i+1)+ " => "+ vector[i].getClave() +" => Es fuerte => " + vector2[i]);
        }
    }

}
