class Result {

    /*
     * Complete a seguinte função para que a mesma devolva todos os possíveis números
     * de 4 dígitos, onde cada um seja menor ou igual a <maxDigit>,
     * e a soma dos dígitos de cada número gerado seja 21
     * Ejemplos con maxDigit=6: 3666, 4566
     *
     * Caso nenhum número seja encontrado, retornar null.
     */
    public static List<Integer> calculation(int maxDigit) {
        int i;
        List<Integer> Lista = new LinkedList<Integer>();
        
        for(i= 1000; i  <= 9999; i++){
            char[] num = String.valueOf(i).toCharArray();
            for(int x=0; x < 4; x++){
                if(num[x] <= maxDigit){
                    if( Character.getNumericValue(num[x])  + Character.getNumericValue(num[x+1]) + Character.getNumericValue(num                            [x + 2]) + Character.getNumericValue(num[x + 3]) == 21){
                        Lista.add(i);
                    }
                }
            }
            
        }
            if(Lista.isEmpty()){
                return null;
            } else {
            return Lista;
            }
    }

}


    /*
     * Complete a seguinte função para que a mesma devolva todos os possíveis números
     * de 4 dígitos, onde cada um seja menor ou igual a <maxDigit>,
     * e a soma dos dígitos de cada número gerado seja 21
     * Ejemplos con maxDigit=6: 3666, 4566
     *
     * Caso nenhum número seja encontrado, retornar null.
     */
    public static List<Integer> calculation(int maxDigit) {
       List<Integer>Result = new LinkedList<Integer>();     
        
        for(int i = 1000; i <= 9999; i++){
            char[] num = String.valueOf(i).toCharArray();
            int somaParcial = 0;
            
            for(int x = 0; x < 4; x++){
                if(Character.getNumericValue(num[x]) > maxDigit){
                    break;
                }
                
                somaParcial = somaParcial + Character.getNumericValue(num[x]);
                
                if (x == 3 &&  somaParcial == 21){
                    System.out.println(somaParcial);
                    Result.add(i);
                }
            }
        }
        
        if(Result.isEmpty()){
                return null;
            } else {
            return Result;
            }

    }
	
//Solução final:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete a seguinte função para que a mesma devolva todos os possíveis números
     * de 4 dígitos, onde cada um seja menor ou igual a <maxDigit>,
     * e a soma dos dígitos de cada número gerado seja 21
     * Ejemplos con maxDigit=6: 3666, 4566
     *
     * Caso nenhum número seja encontrado, retornar null.
     */
    public static List<Integer> calculation(int maxDigit) {
       List<Integer>Result = new LinkedList<Integer>();     
        
        for(int i = 1000; i <= 9999; i++){
            char[] num = String.valueOf(i).toCharArray();
            int somaParcial = 0;
            
            for(int x = 0; x < 4; x++){
                if(Character.getNumericValue(num[x]) > maxDigit){
                    break;
                }
                
                somaParcial = somaParcial + Character.getNumericValue(num[x]);
                
                if (x == 3 &&  somaParcial == 21){
                    System.out.println(somaParcial);
                    Result.add(i);
                }
            }
        }
        
        if(Result.isEmpty()){
                return null;
            } else {
            return Result;
            }

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int maxDigit = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.calculation(maxDigit);

        if(result != null){
            for (int i = 0; i < result.size(); i++) {
                if(i > 0){
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(String.valueOf(result.get(i)));
            }            
        }else{
            bufferedWriter.write("null");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
