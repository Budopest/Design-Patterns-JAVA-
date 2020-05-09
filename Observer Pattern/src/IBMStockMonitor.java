public class IBMStockMonitor implements Observer {

    private double ibmPrice;

    private static int obseverIDTracker = 0;

    private  int observerID;

    private Subject stockGrapper;

    public IBMStockMonitor(Subject stockGrapper){
        this.stockGrapper = stockGrapper;
        this.observerID = ++obseverIDTracker;
        System.out.println("observer: "+this.observerID + " is created");
        stockGrapper.register(this);
    }



    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {

        if(ibmPrice > this.ibmPrice) System.out.println("ibm stock is going up\n");
        else if(ibmPrice < this.ibmPrice) System.out.println("ibm stock is going down\n");
        else System.out.println("ibm stock is steady\n");
        this.ibmPrice = ibmPrice;



    }




}
