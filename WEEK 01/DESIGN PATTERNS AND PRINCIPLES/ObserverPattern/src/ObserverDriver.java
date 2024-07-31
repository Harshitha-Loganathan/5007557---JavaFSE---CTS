public class ObserverDriver {
    public static void main(String[] args) {
        // Create the subject (StockMarket)
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp1 = new MobileApp("App1");
        Observer mobileApp2 = new MobileApp("App2");
        Observer webApp = new WebApp("Web1");

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        System.out.println("Setting stock price to 100.0");
        stockMarket.setStockPrice(100.0);

        // Deregister one observer
        stockMarket.deregisterObserver(mobileApp2);

        // Change stock price and notify remaining observers
        System.out.println("Setting stock price to 200.0");
        stockMarket.setStockPrice(200.0);
    }
}
