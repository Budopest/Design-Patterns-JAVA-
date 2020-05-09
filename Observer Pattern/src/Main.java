public class Main {

    public static void main(String[] args) {

        StockGrapper stockGrapper = new StockGrapper();

        StockObserver stockObserver1 = new StockObserver(stockGrapper);
        //StockObserver stockObserver2 = new StockObserver(stockGrapper);
        IBMStockMonitor ibmStockMonitor = new IBMStockMonitor(stockGrapper);
        stockGrapper.setIbmPrice(197.9);
        stockGrapper.setAppleprice(672);
        stockGrapper.setGoogleprice(671.3);
        stockGrapper.setIbmPrice(191);
        stockGrapper.setIbmPrice(194);
        stockGrapper.setIbmPrice(194);




    }
}
