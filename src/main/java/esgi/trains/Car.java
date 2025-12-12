package esgi.trains;

public class Car {
    private int numero;
    private CarClass carclasse;
    private Seat[] siege = new Seat[10];



    Car(int numero,CarClass carclasse,Seat[] siege){
        if (numero<1 || numero>4){
            throw new IllegalArgumentException("Numéro de voiture invalide");
        }
        this.numero = numero;
        this.carclasse=carclasse;
        this.siege=siege;
    }

    boolean checkClasseCar(CarClass carclasse){
        return this.carclasse == carclasse;
    }

    @Override
    public String toString() {
       return("Voiture "+numero+"/siège "+carclasse); // continuer siege apres
    }

}
