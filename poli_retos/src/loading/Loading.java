package loading;

public class Loading {
    private void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("El hilo fue interrumpido");
        }
    }

    private void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private void excerciceA01() {
        String[] simbolos = { "/", "-", "\\", "|" };
        String[] loader = new String[4];
        loader[0] = " ";
        loader[2] = " ";
        int contador = 0, contador2 = 0;
        while (contador <= 100) {
            loader[1] = simbolos[contador2];
            loader[3] = Integer.toString(contador) + "%";
            contador++;
            if (contador2 == 3) {
                contador2 = 0;
            } else {
                contador2++;
            }
            for (int i = 0; i < 4; i++) {
                System.out.print(loader[i]);
            }
            delay(100);
            clearConsole();
        }
    }

    private void excerciceA02() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un caracter para la barra de carga: ");
        char cargaChar = scanner.next().charAt(0);
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            int numChars = (contador * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < numChars; i++) {
                barra.append(cargaChar);
            }
            for (int i = numChars; i < longitudBarra; i++) {
                barra.append(" ");
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
    }

    private void excerciceA03() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un caracter para desplazar: ");
        char cargaChar = scanner.next().charAt(0);
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i == contador % longitudBarra) {
                    barra.append(cargaChar);
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
    }

    private void excerciceA04() {
        String[] signos = { "o0o", "0o0" };
        int contador = 0;
        int signoIndex = 0;

        while (contador <= 100) {
            System.out.print(signos[signoIndex] + " " + contador + "%");
            delay(100);
            clearConsole();
            contador++;
            signoIndex = (signoIndex + 1) % signos.length;
        }
    }

    private void excerciceA05() {
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            int numChars = (contador * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < numChars; i++) {
                barra.append("=");
            }
            if (numChars < longitudBarra) {
                barra.append(">");
                for (int i = numChars + 1; i < longitudBarra; i++) {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
    }

    private void excerciceA06() {
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i == contador % longitudBarra) {
                    barra.append("<=>");
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
    }

    private void excerciceA07() {
        String[] signos = { "\\", "|", "/", "-" };
        int longitudBarra = 20;
        int contador = 0;
        int signoIndex = 0;

        while (contador <= 100) {
            int numChars = (contador * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < numChars; i++) {
                barra.append("=");
            }
            if (numChars < longitudBarra) {
                barra.append(signos[signoIndex]);
                for (int i = numChars + 1; i < longitudBarra; i++) {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
            signoIndex = (signoIndex + 1) % signos.length;
        }
    }

    private void excerciceA08() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre y apellidos: ");
        String nombreCompleto = scanner.nextLine();
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            int numChars = (contador * nombreCompleto.length()) / 100;
            StringBuilder barra = new StringBuilder("[");
            barra.append(nombreCompleto.substring(0, numChars));
            for (int i = numChars; i < longitudBarra; i++) {
                barra.append(" ");
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
    }

    public void g4_createLoading() {
        excerciceA01();
        excerciceA02();
        excerciceA03();
        excerciceA04();
        excerciceA05();
        excerciceA06();
        excerciceA07();
        excerciceA08();

    }
}
