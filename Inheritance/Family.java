/*QUESTRION
Grandfather: cash= 10 lakh , asset=20 lakh;
father:      cash= 5  lakh , asset=22 lakh;
you spend:   cash= 22 lakh ;

*/
package family;

class Grandfather {
     int cash1 = 10;
     int asset1 = 20;
}

class Father extends Grandfather {
     int cash2 = 5;
     int asset2 = 22;
    
    public void calculateProperties() {
        cash2 += cash1;
        asset2 += asset1;
    }
}

class You extends Father {
     int cash=22;
     int asset=0;
     int total = 0;
    
    
    public void calculateTotalProperties() {
        cash = cash2 - cash;
        asset=asset2;
        
        if (cash < 0) {
            total = asset + cash;
        } else {
            total = asset + cash;
        }
        
        System.out.print("Total Properties = " + total);
        System.out.print(" lakh");
    }
}

public class Family {
    public static void main(String[] args) {
        You object = new You();
        object.calculateProperties();
        object.calculateTotalProperties();
    }
}
