public class FresasConCrema extends Postre{

    private String toppings;
    private String crema;

    public FresasConCrema(String nombrePostre, String sabor, String toppings, String crema, double precio, int stock, boolean disponible){
        super(nombrePostre, sabor, precio, stock, disponible);
        this.toppings = toppings;
        this.crema = crema;
    }

    public String getToppings() {
        return toppings;
    }

    public String getCrema() {
        return crema;
    }

    public void setToppings(String toppings) {
        if (toppings.isEmpty()){
            System.out.println("no agregaste ningun topping");
        }else {
            System.out.println("agregaste: " + this.toppings);
        }
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }
}
