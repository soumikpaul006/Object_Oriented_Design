public class Computer
{
    //REQUIRED PARAMETER
    private String HDD;
    private String RAM;

    //OPTIONAL PARAMETERS
    private boolean isGraphicsCard;
    private boolean isBluetooth;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCard() {
        return isGraphicsCard;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCard = builder.isGraphicsCard;
        this.isBluetooth = builder.isBluetooth;
    }

    public static class ComputerBuilder {

        //REQUIRED PARAMETER
        private String HDD;
        private String RAM;

        //OPTIONAL PARAMETERS
        private boolean isGraphicsCard;
        private boolean isBluetooth;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
            this.isGraphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean bluetooth) {
            this.isBluetooth = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
