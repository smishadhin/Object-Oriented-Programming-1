public class Mobile {

    private String mobileOwnerName;
    private String mobileNumber;
    private double mobileBalance;
    private String mobileOSName;
    private boolean lock = false;

    public Mobile() {
    }

    public Mobile(String mobileOwnerName, String mobileNumber, double mobileBalance, String mobileOSName, boolean lock) {
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOSName = mobileOSName;
        this.lock = lock;
    }

    public String getMobileOwnerName() {
        return mobileOwnerName;
    }

    public void setMobileOwnerName(String mobileOwnerName) {
        this.mobileOwnerName = mobileOwnerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getMobileBalance() {
        return mobileBalance;
    }

    public void setMobileBalance(double mobileBalance) {
        this.mobileBalance = mobileBalance;
    }

    public String getMobileOSName() {
        return mobileOSName;
    }

    public void setMobileOSName(String mobileOSName) {
        this.mobileOSName = mobileOSName;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    void ShowInfo() {
        System.out.println(".........\nName: " + this.getMobileOwnerName() +
                "\nMobile Number: " + this.getMobileNumber() +
                "\nInitial Mobile Balance: " + this.getMobileBalance() +
                "\nMobile OS: " + this.getMobileOSName() +
                "\nIs Lock: " + this.isLock());
    }

    void Recharge(int amount) {
        if (!isLock()) {
            setMobileBalance(getMobileBalance() + amount);
            System.out.println("Balance After Recharge:" + getMobileBalance());
        }else {
            System.out.println("Mobile is Locked!!!!!");
        }
    }

    void CallSomeone(int timeDuration) {
        double perMinuitCost = 0.5;
        if (!isLock()) {
            setMobileBalance(getMobileBalance() - (timeDuration * perMinuitCost));
            System.out.println("Balance After Call:" + getMobileBalance());
        }else {
            System.out.println("Mobile is Locked!!!!!");
        }
    }


}
