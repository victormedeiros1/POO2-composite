
/**
 * Write a description of class PiraoDeQueijo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lasanha extends MenuComponent
{
    public Lasanha(){        
    }
    
    public String getName(){
        return "Lasanha";
    }
    
    public String getDescription(){
        return "A melhor do mundo siiiuuuu";
    }
    
    public double getPrice(){
        return 7;
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
