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
