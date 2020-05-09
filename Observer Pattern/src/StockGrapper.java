
import java.util.ArrayList;

public class StockGrapper implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double appleprice;
    private double googleprice;

    public  StockGrapper (){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);

    }

    @Override
    public void unregister(Observer o) {
        int index = observers.indexOf(o);
        System.out.println("Observer: "+index+1+" deleted");
        observers.remove(index);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(ibmPrice,appleprice,googleprice);
        }

    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAppleprice(double appleprice) {
        this.appleprice = appleprice;
        notifyObserver();

    }

    public void setGoogleprice(double googleprice) {
        this.googleprice = googleprice;
        notifyObserver();

    }
}
