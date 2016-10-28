public class TestOOP{
    public static void main(String[] args) {
        Client clOne = new Client();
        clOne.setName("Andrej");
        clOne.setProjectName("Weather_widjet");
        clOne.setLastPay(2000);
        clOne.setAllPay(5000);
        clOne.setAllTime(26);

        Client clTwo = new Client();
        clTwo.setName("Roman");
        clTwo.setProjectName("Agregat");
        clTwo.setLastPay(3000);
        clTwo.setAllPay(8000);
        clTwo.setAllTime(56);

        Client clThree = new Client();
        clThree.setName("Vlad");
        clThree.setProjectName("Clients_account");
        clThree.setLastPay(6000);
        clThree.setAllPay(25000);
        clThree.setAllTime(112);

        Client clFour = new Client();
        clFour.setName("Katerina");
        clFour.setProjectName("Personal_project");
        clFour.setLastPay(1000);
        clFour.setAllPay(15000);
        clFour.setAllTime(15);

        Client[] clients = {clOne, clTwo, clThree, clFour};

        System.out.println(getBigestLastPay(clients).getName());

        sortClientsByTime(clients);

        for (Client clientByTime : clients) {
            System.out.println(clientByTime.getName()." - ".clientByTime.getAllTime());
        }
    }

    static Client getBigestLastPay(Client[] clients) {
        Client max = clients[0];
        for (Client client : clients) {
            if (client.getLastPay() > max.getLastPay()) max = client;
        }
        return max;
    }

    public void sortClientsByTime(Client[] clients) {
        Client clientsBoofer;
        for(int i = clients.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( clients[j].getAllTime() > clients[j+1].getAllTime() ){
                    clientsBoofer = clients[j];
                    clients[j] = clients[j+1];
                    clients[j+1] = clientsBoofer;
                }
            }
        }
    }
}