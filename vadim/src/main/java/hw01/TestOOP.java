public class TestOOP{
    public static void main(String[] args) {
        Client clOne = new Client();
        clOne.name = "Andrej";
        clOne.projectName = "Weather_widjet";
        clOne.lastPay = 2000;
        clOne.allPay = 5000;
        clOne.allTime = 26;

        Client clTwo = new Client();
        clTwo.name = "Roman";
        clTwo.projectName = "Agregat";
        clTwo.lastPay = 3000;
        clTwo.allPay = 8000;
        clTwo.allTime = 56;

        Client clThree = new Client();
        clThree.name = "Vlad";
        clThree.projectName = "Clients_account";
        clThree.lastPay = 6000;
        clThree.allPay = 25000;
        clThree.allTime = 112;

        Client clFour = new Client();
        clFour.name = "Katerina";
        clFour.projectName = "Personal_project";
        clFour.lastPay = 1000;
        clFour.allPay = 15000;
        clFour.allTime = 15;

        Client[] clients = {clOne, clTwo, clThree, clFour};
        Client[] clients = {clOne, clTwo, clThree, clFour};

        System.out.println(getBigestLastPay(clients).name);

        sortClientsByTime(clients);

        for (Client clientByTime : clients) {
            System.out.println(clientByTime.name." - ".clientByTime.allTime);
        }
    }

    static Client getBigestLastPay(Client[] clients) {
        Client max = clients[0];
        for (Client client : clients) {
            if (client.lastPay > max.lastPay) max = client;
        }
        return max;
    }

    public void sortClientsByTime(Client[] clients) {
        Client clientsBoofer;
        for(int i = clients.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( clients[j].allTime > clients[j+1].allTime ){
                    clientsBoofer = clients[j];
                    clients[j] = clients[j+1];
                    clients[j+1] = clientsBoofer;
                }
            }
        }
    }
}