package Random_password;

import java.util.Random;

public class Password {

    private int longitud = 0;
    private String clave = "";

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte(String clave) {
        int num = 0, letra_MIN = 0, letra_MAY = 0;
        for (int l = 0; l < clave.length(); l++) {
            char c = clave.charAt(l);
            if (Character.isDigit(c)) {
                num++;
            } else if (Character.isLowerCase(c)) {
                letra_MIN++;
            } else if (Character.isUpperCase(c)) {
                letra_MAY++;
            }
        }
        return letra_MAY > 2 && letra_MIN > 1 && num > 5;
    }

    private void generarPassword() {
        char palabra;
        Random rd = new Random();
        for (int i = 0; i < longitud; i++) {
            do {
                palabra = (char) rd.nextInt(123);
            } while (!(palabra >= 65 && palabra <= 90 || palabra >= 97 && palabra <= 122 || palabra >= 48 && palabra <= 57));
            clave += palabra;
        }
    }

    public String getClave() {
        return "Su clave es: " + clave;
    }

    public String getLongitud() {
        return "Su clave tiene " + longitud + " caracteres";
    }

}
