/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class Url {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws FileNotFoundException,IOException {
        FileReader archivo = new FileReader("exprecion.txt");
        BufferedReader leer = new BufferedReader(archivo);
        String cadena = leer.readLine();
        
        int tamaño = cadena.length(), x = 0, existir = -1, noexistir = 0;
        int tabla[][] = new int[28][57];
        for (int j = 0; j < 28; j++) {
            for(int k=0;k<57;k++){
                tabla[j][k]=-1;
            }
        }
        for (int j = 0; j < 28; j++) {
            for(int k=0;k<57;k++){
                if(j==0){
                    if(k>=3 && k<=9 || k>=11 && k<=25 || k>=27){
                        tabla[j][k]=13;
                    }
                    else if(k==10) tabla[j][k]=1;
                    else if(k==26) tabla[j][k]=9;
                }
                else if(j==1){
                    if(k>=3 && k<=22 || k>=24){
                        tabla[j][k]=15;
                    }
                    else if(k==23){
                        tabla[j][k]=2;
                    }
                    
                }
                
                else if(j==2){
                    if(k>=3 && k<=22 || k>=24){
                        tabla[j][k]=15;
                    }
                    else if(k==23){
                        tabla[j][k]=3;
                    }
                }
                else if(j==3){
                    if(k>=3 && k<=18 || k>=21){
                        tabla[j][k]=15;
                    }
                    else if(k==2)tabla[j][k]=16;
                    else if(k==19){
                        tabla[j][k]=4;
                    }
                }
                else if(j==4){
                    if(k>=3 && k<=21 || k>=23){
                        tabla[j][k]=15;
                    }
                    else if(k==2)tabla[j][k]=16;
                    else if(k==0){
                        tabla[j][k]=6;
                    }
                    else if(k==22) tabla[j][k]=5;
                }
                else if(j==5){
                    if(k>=3 ){
                        tabla[j][k]=15;
                    }
                    else if(k==2)tabla[j][k]=16;
                    else if(k==0){
                        tabla[j][k]=6;
                    }
                 }
                else if(j==6){
                    if(k==1){
                        tabla[j][k]=7;
                    }
                }
                else if(j==7){
                    if(k==1){
                        tabla[j][k]=8;
                    }
                }
                else if(j==8){
                    if(k>=3 && k<=25 ||  k>=27){
                        tabla[j][k]=13;
                    }
                    else if(k==26) tabla[j][k]=9;
                }
                else if(j==9){
                    if(k>=3 && k<=25 ||  k>=27){
                        tabla[j][k]=13;
                    }
                    else if(k==26) tabla[j][k]=10;
                }
                else if(j==10){
                    if(k>=3 && k<=25 || k>=27){
                        tabla[j][k]=15;
                    }
                    else if(k==26){
                        tabla[j][k]=11;
                    }
                }
                else if(j==11){
                    if(k>=3){
                        tabla[j][k]=15;
                    }
                    else if(k==2){
                        tabla[j][k]=12;
                    }
                }
                else if(j==12){
                    
                     if(k==2)tabla[j][k]=16;
                     else if(k==5)tabla[j][k]=17;
                     else if(k==16)tabla[j][k]=25;
                     else if(k==18)tabla[j][k]=23;
                     else if(k>=3 && k<=4 || k>=6 && k<=17 || k>=19){
                        tabla[j][k]=13;
                    }
                }
                else if(j==13){
                    if(k>=3){
                        tabla[j][k]=14;
                    }
                }
                else if(j==14){
                    if(k>=3){
                        tabla[j][k]=15;
                    }
                }
                else if(j==15){
                    if(k>=3){
                        tabla[j][k]=15;
                    }
                    else if(k==2) tabla[j][k]=16;
                }
                else if(j==16){
                    if(k==5){
                        tabla[j][k]=17;
                    }
                    else if(k==16){
                        tabla[j][k]=25;
                    }else if(k==18){
                        tabla[j][k]=23;
                    }
                }
                else if(j==17){
                    if(k>=3 && k<=17 || k>=19){
                        tabla[j][k]=14;
                    }
                    else if(k==18){
                        tabla[j][k]=18;
                    }
                }
                else if(j==18){
                    if(k==15){
                        tabla[j][k]=19;
                    }
                }
                else if(j==19){
                    if(k==2){
                        tabla[j][k]=20;
                    }
                }
                else if(j==20){
                    if(k==7){
                        tabla[j][k]=27;
                    }
                    else if(k==15) tabla[j][k]=21;
                }
                else if(j==21){
                    if(k==27){
                        tabla[j][k]=22;
                    }
                }
                else if(j==23){
                    if(k>=3 && k<=20 || k>=22){
                        tabla[j][k]=14;
                    }
                    else if(k==21){
                        tabla[j][k]=24;
                    }
                }
                else if(j==24){
                    if(k==9){
                        tabla[j][k]=19;
                    }
                }
                else if(j==25){
                    if(k>=3 && k<=6 || k>=8){
                        tabla[j][k]=14;
                    }
                    else if(k==7){
                        tabla[j][k]=26;
                    }
                }
                else if(j==26){
                    if(k==23){
                        tabla[j][k]=19;
                    }
                }
                else if(j==27){
                    if(k==22){
                        tabla[j][k]=22;
                    }
                    else if(k==24)tabla[j][k]=22;
                }
                
                
                
                
                
                else tabla[j][k]=-1;
            }
        }
        
     
        int estado = 0;
        int columna = 0;
        do{
           
            char letra = cadena.charAt(x);
            switch (letra) {
                case ':': columna = 0;   break;
                case '/': columna = 1;   break;
                case '.': columna = 2;   break;
                case 'a': columna = 3;   break;
                case 'b': columna = 4;   break;
                case 'c': columna = 5;   break;
                case 'd': columna = 6;   break;
                case 'e': columna = 7;   break;
                case 'f': columna = 8;   break;
                case 'g': columna = 9;   break;
                case 'h': columna = 10;   break;
                case 'i': columna = 11;   break;
                case 'j': columna = 12;   break;
                case 'k': columna = 13;   break;
                
                case 'l': columna = 14;   break;
                case 'm': columna = 15;   break;
                case 'n': columna = 16;   break;
                case 'ñ': columna = 17;   break;
                case 'o': columna = 18;   break;
                case 'p': columna = 19;   break;
                case 'q': columna = 20;   break;
                case 'r': columna = 21;   break;
                case 's': columna = 22;   break;
                case 't': columna = 23;   break;
                case 'u': columna = 24;   break;
                case 'v': columna = 25;   break;
                case 'w': columna = 26;   break;
                case 'x': columna = 27;   break;
                
                case 'y': columna = 28;   break;
                case 'z': columna = 28;   break;
                case 'A': columna = 30;   break;
                case 'B': columna = 31;   break;
                case 'C': columna = 32;   break;
                case 'D': columna = 33;   break;
                case 'E': columna = 34;   break;
                case 'F': columna = 35;   break;
                case 'G': columna = 36;   break;
                case 'H': columna = 37;   break;
                case 'I': columna = 38;   break;
                case 'J': columna = 39;   break;
                case 'K': columna = 40;   break;
                case 'L': columna = 41;   break;
                case 'M': columna = 42;   break;
                case 'N': columna = 43;   break;
                case 'Ñ': columna = 44;   break;
                case 'O': columna = 45;   break;
                case 'P': columna = 46;   break;
                case 'Q': columna = 47;   break;
                case 'R': columna = 48;   break;
                case 'S': columna = 49;   break;
                case 'T': columna = 50;   break;
                case 'U': columna = 51;   break;
                case 'V': columna = 52;   break;
                case 'W': columna = 53;   break;
                case 'X': columna = 54;   break;
                case 'Y': columna = 55;   break;
                case 'Z': columna = 56; break;
                
                default: columna = -1;  break;
            }
            if (columna >= 0) {
                int num = tabla[estado][columna];
                if(num>0){
                   estado=num;
               }
               else estado=-1;
                if (estado == 19 || estado == 22) {
                    existir=1;
                    
                }
                else if(estado==20){
                    existir=-1;
                }
            } else {
                existir=-1;
                
            }
            
            x++;
        }while(x < tamaño && estado >= 0);
        if(existir>0){
             System.out.println("Palabra correcta");
        }
        else if(existir<0){
            System.out.println("Palabra Incorrecta");
        }
       
    }
    
}

        // TODO code application logic here
   
