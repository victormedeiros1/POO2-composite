

public class TesteComposite {
    
    public MenuComponent montar(){
        MenuComponent menu1 = new MenuBarRestaurante();
        MenuComponent menu2 = new BarTorrao();
        MenuComponent menu3 = new RestauranteLuzia();
        
        MenuComponent menuDeSobremesa = new MenuDeSobremesa();
        
        MenuComponent item1 = new Cachaca();
        MenuComponent item2 = new PiraoDeQueijo();
        MenuComponent item3 = new Galinha();
        MenuComponent item4 = new Linguica();
        
        MenuComponent lasanha = new Lasanha();
        MenuComponent moreninha = new Moreninha();
        MenuComponent mousseDeMaracuja = new MousseDeMaracuja();
        
        menu1.add(menu2);
        menu1.add(menu3);
        
        menu1.add(lasanha);
        
        menu2.add(item1);
        menu2.add(item2);
        menu3.add(item3);
        menu3.add(item4);
        menuDeSobremesa.add(moreninha);
        menuDeSobremesa.add(mousseDeMaracuja);
        
        menu1.add(menuDeSobremesa);
        
        
        
        return menu1;
    }
}
