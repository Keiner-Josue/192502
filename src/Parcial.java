//## 🌶️ Ejercicio 1 – **El Club Casi Secreto™**

//> En una ciudad donde la lógica es opcional y las contraseñas son más seguras que una puerta sin cerradura, existe un club llamado “Club Casi Secreto™”. El acceso es otorgado solo si:
//> 
//1. Tienes más de 18 años.
//2. Conoces la ultra secreta clave: `"1234"`.
//3. Dices correctamente la frase secreta: `"la matrix vive"`.
//4. El sistema debe verificar **3 intentos consecutivos**.
//5. Si alguien falla una condición, no se le deja entrar, pero se sigue preguntando a los demás.



import java.util.Scanner;

public class Parcial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = input.nextInt();
        System.out.print("Ingresa la clave secreta: ");
        int clave = input.nextInt();
        System.out.print("Escribe la frase secreta: ");
        String frase = input.nextLine();
        if (edad>=18) {
            System.out.println("Cumples el requisito de edad");
            input.close();
        } else if (edad<18) {
            System.out.println("No cumples con el requisito");
            input.close();
        }

        if (clave==1234) {
            System.out.println("La clave es correcta");
            input.close();
            return;
        } while (clave!=1234) {
            System.out.println("la clave es incorrecta tienes otra oportunidad");
            return;
        }

        if (frase==("La matrix vive")) {
            System.out.println("La frase es correcta");
            
        }else if (frase!="La matrix vive") {
            System.out.println("La frase es incorrecta");
            System.out.println("Tienes otra oportunidad");
        }
        System.out.println("cumplistes con los requisitos bienevenido");
        input.close();

    }
}
"Lo anterior no lo borro ya que fue mi primer intento apenas aprendiendo java"

    import java.util.Scanner;

public class ClubCasiSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentosPermitidos = 3;
        int intentos = 0;

        System.out.println("🔐 Bienvenido al Club Casi Secreto™");

        while (intentos < intentosPermitidos) {
            System.out.println("\nIntento #" + (intentos + 1));

            System.out.print("📅 ¿Cuál es tu edad? - : ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            System.out.print("🔑 Ingresa la clave secreta: ");
            String clave = scanner.nextLine();

            System.out.print("🗣️ Di la frase secreta: ");
            String frase = scanner.nextLine();

            if (edad > 18 && clave.equals("1234") && frase.equalsIgnoreCase("la matrix vive")) {
                System.out.println("✅ ¡Acceso concedido! Bienvenido al Club Casi Secreto™ 🎉");
            } else {
                System.out.println("❌ Acceso denegado. No cumples con los requisitos.");
            }

            intentos++;
        }

        System.out.println("\n🚪 Fin de los intentos. El club permanece oculto... 🕵️‍♂️");
        scanner.close();
    }
}
