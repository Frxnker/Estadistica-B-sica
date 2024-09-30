public class EstadisticaBasica {
    public static void main(String[] args) {

        int numero = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int c = 0;
        int i = 0;
        double m = 0;
        
        for (i = 0; i < 10; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numero = Integer.parseInt(System.console().readLine());

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            c += numero;
        }

        m = c / i;

        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
        System.out.println("La media es: " + m);
        
    }
}
