public class Postre{

     private String nombrePostre;
     private String sabor;
     private double precio;
     private int stock;
     private boolean disponible;


     public Postre(){

     }

     public Postre(String nombrePostre, String sabor, double precio, int stock, boolean disponible){

          this.nombrePostre = nombrePostre;
          this.sabor = sabor;
          this.precio = precio;
          this.stock = stock;
          this.disponible = disponible;
     }

     public String getNombrePostre() {
          return nombrePostre;
     }

     public String getSabor() {
          return sabor;
     }

     public double getPrecio() {
          return precio;
     }

     public int getStock() {
          return stock;
     }

     public boolean isDisponible() {
          return disponible;
     }

     public void setNombrePostre(String nombrePostre) {

          if (nombrePostre.isEmpty()){
               System.out.println("El nombre no puede estar vacio");
          }else {
               System.out.println("El nombre fue guardado con exito");
               this.nombrePostre = nombrePostre;
          }

     }

     public void setSabor(String sabor) {
          this.sabor = sabor;
     }

     public void setPrecio(double precio) {
          this.precio = precio;
     }

     public void setStock(int stock) {
          this.stock = stock;
     }

     public void setDisponible(boolean disponible) {
          this.disponible = disponible;
     }

     @Override
     public String toString(){
          return "Postre: " + this.nombrePostre + "\n" +
                  "Sabor: " + this.sabor + "\n" +
                  "Precio: " + this.precio + "\n" +
                  "Stock: " + this.stock + "\n" +
                  "Disponible: " + this.disponible + "\n";
     }


}
