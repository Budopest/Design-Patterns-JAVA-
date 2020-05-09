public class StockObserver implements Observer {

    private double ibmPrice;
    private double appleprice;
    private double googleprice;

    private static int obseverIDTracker = 0;

    private  int observerID;

    private Subject stockGrapper;

    public StockObserver(Subject stockGrapper){
        this.stockGrapper = stockGrapper;
        this.observerID = ++obseverIDTracker;
        System.out.println("observer: "+this.observerID + " is created");
        stockGrapper.register(this);
    }



    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        // the subject push the update & data (the argument)
        // you may not need the instance of the subject in this case
        // you can call update with no arguments push only the update
        // then the observer can pull data using the subject passed through the constructor
        this.ibmPrice = ibmPrice;
        this.appleprice = applePrice;
        this.googleprice = googlePrice;

        printStockPrices(ibmPrice,applePrice,googlePrice);

    }

    private void printStockPrices(double ibmPrice, double applePrice, double googlePrice) {
        System.out.println(observerID + "\nibm stock pricd : " + ibmPrice + "\n"
                        +"apple stock pricd : " + applePrice + "\n"
                        +"google stock pricd : " + googlePrice + "\n"
                );
    }
}
