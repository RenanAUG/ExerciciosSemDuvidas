/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package braintech.cadastrarcerveja;

/**
 *
 * @author aluno
 */
public class CadastrarCerveja {

    public static void main(String[] args) {
        Cerveja cerveja1 =new Cerveja(12345678);
        Cerveja cerveja2 =new Cerveja(99);
        Cerveja cerveja3 =new Cerveja(8989898);
        Cerveja cerveja4 =new Cerveja(7567567);
        Cerveja cerveja5 =new Cerveja(156958659);
     
    
        cerveja1.setInformacao("SKol", "Chopp", 15.50, " AMBEV","9.0%" );
        cerveja2.setInformacao("Budweiser", "Pilsen", 16.50, " AMBEV", "10.0%");
        cerveja3.setInformacao("Brahma", "Duplo Malte", 17.50, " AMBEV", "8.6%");
        cerveja4.setInformacao("Amstel", "Pilsen", 16.70, " AMBEV", "0.8%");
        cerveja5.setInformacao("SubZero", "Pilsen", 18.40, " AMBEV", "3.0%");
    
            
        cerveja1.printCerveja();
        System.out.println("\n-----------------------------");
        cerveja2.printCerveja();
        System.out.println("\n-----------------------------");
        cerveja3.printCerveja();
        System.out.println("\n-----------------------------");
        cerveja4.printCerveja();
        System.out.println("\n-----------------------------");
        cerveja5.printCerveja();
    }
}
