public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer.ComputerBuilder("1TB","1GB").setBluetooth(true).setGraphicsCard(true).build();

        System.out.println(computer.getHDD()+" "+computer.getRAM()+" "+computer.isBluetooth()+" "+computer.isGraphicsCard());
    }
}