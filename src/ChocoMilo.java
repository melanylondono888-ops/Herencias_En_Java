public class ChocoMilo extends Postre{

    private boolean tieneMilo;

    public ChocoMilo(String nombrePostre,String sabor, double precio, int stock, boolean disponible, boolean tieneMilo){
        super(nombrePostre, sabor, precio, stock, disponible);
        this.tieneMilo = tieneMilo;
    }

    public boolean isTieneMilo() {
        return tieneMilo;
    }

    public void setTieneMilo(boolean tieneMilo) {
        this.tieneMilo = tieneMilo;
    }

    @Override
    public String toString(){
        return  "=========== POSTRE DE LIMON =======" + "\n" +
                "Postre: " + super.getNombrePostre() + "\n" +
                "Sabor: " + super.getSabor() + "\n" +
                "Precio: " + super.getPrecio() + "\n" +
                "Stock: " + super.getStock() + "\n" +
                "Disponible: " + super.isDisponible() + "\n" +
                "El postre contiene milo? " + tieneMilo;
    }
}
