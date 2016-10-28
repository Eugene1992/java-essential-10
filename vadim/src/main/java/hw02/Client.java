package hw02;

public class Client {
    private String name;
    private String projectName;
    private int lastPay;
    private int allPay;
    private int allTime;
    private static int objectsCount = 0;
    private static int objectsLimit;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setLastPay(int lastPay) {
        this.lastPay = lastPay;
    }

    public int getLastPay() {
        return this.lastPay;
    }

    public void setAllPay(int allPay) {
        this.allPay = allPay;
    }

    public int getAllPay() {
        return this.allPay;
    }

    public void setAllTime(int allTime) {
        this.allTime = allTime;
    }

    public int getAllTime() {
        return this.allTime;
    }

    public static int getObjectsCount() {
        return objectsCount;
    }

    public static int getObjectsLimit() {
        return objectsLimit;
    }

    public Client() {
        objectsCount++;
//        if (Client.getObjectsLimit() > 1) return false;
    }
}