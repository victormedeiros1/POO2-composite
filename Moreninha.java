
/**
 * Write a description of class PiraoDeQueijo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moreninha extends MenuDeSobremesa
{
    public Moreninha(){        
    }
    
    public String getName(){
        return "Moreninha";
    }
    
    public String getDescription(){
        return "Geladissima";
    }
    
    public double getPrice(){
        return 10;
    }
    
    public boolean isVegetarian(){
        return false;
    }
    
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}
