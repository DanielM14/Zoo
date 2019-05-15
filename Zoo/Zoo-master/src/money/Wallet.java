package money;

public class Wallet {

    private int wallet;
    private int totalWallet = 150;
    private int cost;
    public Wallet() {
        totalWallet = wallet - totalWallet;
    }
    public Wallet(int wallet){
        this.wallet = wallet;
        totalWallet = wallet - totalWallet;
    }



    public void setWallet(int w){
        wallet = w;
        totalWallet = wallet - totalWallet;
    }
    public int getTotalWallet(){
        return totalWallet;
    }

}

