/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prima;
import java.util.*;
/**
 *
 * @author Praktikum
 */
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean temu=false;
        System.out.print("Awal : ");
        int awal=input.nextInt();
        System.out.print("Akhir: ");
        int akhir=input.nextInt();
        System.out.print("Deret bilangan Prima antara "+awal+" dan "+akhir+" = ");
        for (int i = awal; i <= akhir; i++) {
            if(i==2){
                temu=true;
            }
            else{
                for (int j = 2; j < i; j++) {
                    if(i%j==0){
                        temu=false; break;
                    }
                    else
                        temu=true;
                }
            }
            if(temu){
                System.out.print(i+" ");
            }
        }
    }
}
