
/**
 * Write a description of class PiraoDeQueijo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MousseDeMaracuja extends MenuDeSobremesa
{
    public MousseDeMaracuja(){        
    }
    
    public String getName(){
        return "Mousse";
    }
    
    public String getDescription(){
        return "Azedissimo";
    }
    
    public double getPrice(){
        return 15;
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
