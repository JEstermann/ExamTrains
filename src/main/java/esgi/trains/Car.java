package esgi.trains;

import java.util.List;

public class Car {
    private int numero;
    private CarClass carclasse;
    private List<Seat> sieges;



    public Car(int numero,CarClass carclasse,List<Seat> sieges){
        if (numero<1 || numero>4){
            throw new IllegalArgumentException("Numéro de voiture invalide");
        }
        this.numero = numero;
        this.carclasse=carclasse;
        this.sieges=sieges;
    }

    boolean checkClasseCar(CarClass carclasse){
        return this.carclasse == carclasse;
    }

    @Override
    public String toString() {
       return("Voiture "+numero+"/siège "+carclasse); // continuer siege apres
    }
    
    public Seat search(SearchSeatCriteria criteria){
        for (Seat seat : seat) {
            if (criteria.match(seat)) {
                return seat;
            }
        }
        return null;
    }

    public int getId() {
        return this.numero;
    }
}
