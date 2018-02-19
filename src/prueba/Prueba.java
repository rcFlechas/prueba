
package prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Prueba {

    private static String leerNumero(String s){
        Scanner scanner= new Scanner(System.in);
        System.out.println(s);
        return scanner.next();
    }      
    
    public static void procesarMeses(){
        Map<Integer, Mes> meses = new HashMap<>(12);
        meses.put(1, Mes.ENERO);
        meses.put(2, Mes.FEBRERO);
        meses.put(3, Mes.MARZO);
        meses.put(4, Mes.ABRIL);
        meses.put(5, Mes.MAYO);
        meses.put(6, Mes.JUNIO);
        meses.put(7, Mes.JULIO);
        meses.put(8, Mes.AGOSTO);
        meses.put(9, Mes.SEPTIEMBRE);
        meses.put(10, Mes.OCTUBRE);
        meses.put(11, Mes.NOVIEMBRE);
        meses.put(12, Mes.DICIEMBRE);        
        
        int m = 0;
        do{
            m = Integer.parseInt(leerNumero("Digite numero del mes: "));
            Mes mes;
            if(m >=1 && m <=12){
                mes = meses.get(m);
                System.out.println("MES: " + mes.getNombreMes() + ", DIAS: "+ mes.getDias());
            }else if(m == 0) System.out.println("FIN");
            else System.out.println("NO VALIDO");
        }while(m != 0);  
    }
    
    public static void ordenarLista(){        
        List<Carro> lc = new ArrayList<>(7);
        lc.add(new Carro("Renault", "2017'", 2900));
        lc.add(new Carro("Chevrolet", "2012'", 2200));
        lc.add(new Carro("Jeep", "2015'", 2700));
        lc.add(new Carro("Ferrari", "2011'", 2400));
        lc.add(new Carro("Mazda", "2010'", 100));
        lc.add(new Carro("Maclaren", "2009'", 600));
        lc.add(new Carro("Audi", "2001'", 2500));
        
//        Collections.sort(lc, new Comparator<Carro>() {
//            @Override
//            public int compare(Carro c1, Carro c2) {
//                return c1.getKm() - c2.getKm();
//            }
//        });
        
//        Collections.sort(lc, new Comparator<Carro>() {
//            @Override
//            public int compare(Carro c1, Carro c2) {
//                return c1.getModelo().compareTo(c2.getModelo());
//            }
//        });

        Collections.sort(lc);

        for (Carro carro : lc) {
            System.out.println(carro.toString());
        }
        
        Carro c1 = new Carro("Chevrolet", "2008",100);
        Carro c2 = new Carro("Chevrolet", "2008", 100);
        
        System.out.println(c1.equals(c2));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {          
        ordenarLista();
        procesarMeses();       
        
        
//        int [] lista = {8,9,3};
//        int n = lista.length;
//        String [] simbolo = new String [n];
//        int i,j,aux,izq,der,m;
//        
//        for (i = 1;  i < n; i++) {
//            aux = lista[i]; izq =0; der = i-1;
//            
//            while(izq<=der){
//                m=((izq+der)/2);
//                if(aux < lista[m]){
//                    der = m-1;
//                    simbolo[i-1] = "-";
//                }else{
//                    izq = m+1;
//                    simbolo[i-1] = "+";
//                }
//            }
//            j = i-1;
//            while(j>=izq){
//                lista[j+1] = lista[j];
//                j = j-1;
//            }
//            lista[izq] = aux;
//        }
//        simbolo[i-1] = "$";
//        
//        String salida = "";
//        for(i=0;i<n;i++){
//            salida += lista[i] + simbolo[i];
//        }
//        System.out.println(salida);
    }    
}
