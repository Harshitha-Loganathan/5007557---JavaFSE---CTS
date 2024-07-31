public class BuilderPatternDriver{
    public static void main(String[] args) {
        // Create a Computer instance using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setMotherboard("ASUS ROG")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build();

        // Print the details of the gaming computer
        System.out.println("Gaming Computer Configuration:");
        System.out.println("CPU: " + gamingComputer.getCPU());
        System.out.println("RAM: " + gamingComputer.getRAM());
        System.out.println("Storage: " + gamingComputer.getStorage());
        System.out.println("Graphics Card: " + gamingComputer.getGraphicsCard());
        System.out.println("Power Supply: " + gamingComputer.getPowerSupply());
        System.out.println("Motherboard: " + gamingComputer.getMotherboard());
        System.out.println("Bluetooth Enabled: " + gamingComputer.isBluetoothEnabled());
        System.out.println("WiFi Enabled: " + gamingComputer.isWifiEnabled());

        // Create another Computer instance with different configuration
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated")
                .setPowerSupply("500W")
                .setMotherboard("MSI Pro")
                .setBluetoothEnabled(false)
                .setWifiEnabled(true)
                .build();

        // Print the details of the office computer
        System.out.println("\nOffice Computer Configuration:");
        System.out.println("CPU: " + officeComputer.getCPU());
        System.out.println("RAM: " + officeComputer.getRAM());
        System.out.println("Storage: " + officeComputer.getStorage());
        System.out.println("Graphics Card: " + officeComputer.getGraphicsCard());
        System.out.println("Power Supply: " + officeComputer.getPowerSupply());
        System.out.println("Motherboard: " + officeComputer.getMotherboard());
        System.out.println("Bluetooth Enabled: " + officeComputer.isBluetoothEnabled());
        System.out.println("WiFi Enabled: " + officeComputer.isWifiEnabled());
    }
}
