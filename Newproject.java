public class Newproject {
 
public static void main(String[] args) {
    
 
     double dolardun = 18.14;
     double dolarBugun = 18.18;


     boolean   dolarDustuMu = false;

     String okYonu;

     if(dolarBugun<dolardun) { // true
        okYonu ="down.svg";
        System.out.println(okYonu);
     }else if (dolarBugun>dolardun) {
        okYonu ="up.svg";
        System.out.println(okYonu);
     }
     else {
        okYonu = "equal.svg";
        System.out.println(okYonu);
     }

     //array 
     String[] krediler = {"Fast kredi","halkbanktan","Mutlu emekli"};


     for (int i = 1; i < krediler.length; i++) {  
       
         System.out.println(krediler[i]);
     }
     
}

}