public class LimonYGalleta extends Postre{

    private String tipoGalleta;

    public LimonYGalleta(String nombrePostre, String sabor, String tipoGalleta, double precio, int stock, boolean disponible ){
        super(nombrePostre, sabor, precio, stock, disponible);
        this.tipoGalleta = tipoGalleta;
    }

    public String getTipoGalleta() {
        return tipoGalleta;
    }

    public void setTipoGalleta(String tipoGalleta) {
        if (tipoGalleta.isEmpty()){
            System.out.println("El tipo de galleta no puede estar vacio");
        }
        this.tipoGalleta = tipoGalleta;
    }

    @Override
    public String toString(){
        return  "=========== POSTRE DE LIMON =======" + "\n" +
                "Postre: " + super.getNombrePostre() + "\n" +
                "Sabor: " + super.getSabor() + "\n" +
                "Precio: " + super.getPrecio() + "\n" +
                "Stock: " + super.getStock() + "\n" +
                "Disponible: " + super.isDisponible() + "\n";
    }
}
