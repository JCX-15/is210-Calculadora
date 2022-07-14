package calculadora.plasnt;
import java.util.*;
/**
 *
 * @author barreto
 */
public class CalculadoraPlasnt {
    public static void main(String[] args) {
        //Calculadora para efectuar expresiones simples
        Scanner sc =new Scanner(System.in);
        System.out.print("Ingrese la expresion que desea efectuar(sin espacios): ");
        String a = sc.next();
        String nums[]=a.split("[0-9]");
        String operador[]=a.split("[/*+-]");
        int agreg = Integer.parseInt(operador[0]);
        for(int i=1;i<operador.length;i++){
            if(nums[i].equals("+")){
                agreg += Integer.parseInt(operador[i]);
            }else{
                if(nums[i].equals("-")){
                    agreg -= Integer.parseInt(operador[i]);
                }else{
                    if(nums[i].equals("*")){
                        agreg *= Integer.parseInt(operador[i]);
                    }else{
                        if(nums[i].equals("/")){
                            agreg /= Integer.parseInt(operador[i]);
                        }else{
                            System.out.println("Expresion no valida.");
                        }
                        
                    }
                }
            }
        }
        System.out.println(agreg);
    }
    
}
