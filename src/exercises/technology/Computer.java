package exercises.technology;

public class Computer {
    //parent class
        private int storage; //in GB
        private int ram; //in GB
        private boolean hasKeyBoard;

    public Computer(int storage, int ram, boolean hasKeyBoard){
            this.storage = storage;
            this.ram = ram;
            this.hasKeyBoard = hasKeyBoard;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public boolean isHasKeyBoard() {
        return hasKeyBoard;
    }

    public String canPlayWorldOfWarcraft() {
        String statusMessage;
        if (this.storage >= 100 && this.ram >= 8 && hasKeyBoard) {
            statusMessage = "LEEERRROOOYYYYYYYYY JENKINS!!!";
        } else if (this.storage >= 100 && this.ram >= 4 && hasKeyBoard) {
            statusMessage = "Playable, but dungeons/raids will be laggy!";
        } else {
            statusMessage = "Need to upgrade your n00b system!";
        }
        return statusMessage;
    }
}

