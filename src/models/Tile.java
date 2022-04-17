package models;

public class Tile {
    private boolean isPillaged;
    private Output output;

    public boolean getIsPillaged() {
        return this.isPillaged;
    }

    public void setIsPillaged(boolean isPillaged) {
        this.isPillaged = isPillaged;
    }

    public Output getOutput(){
        return this.output;
    }
}
