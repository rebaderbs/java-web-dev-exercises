package exercises.technology;

public class SmartPhone extends Computer {
    //child class
    private int displaySize;

    private int photosInCameraRoll;

    public SmartPhone(int storage, int ram, boolean hasKeyBoard, int displaySize, int photosInCameraRoll)   {
        super(storage, ram, hasKeyBoard);
        this.displaySize = displaySize;
        this.photosInCameraRoll = photosInCameraRoll;
    }

    public void takePhoto() {
        this.photosInCameraRoll = this.photosInCameraRoll + 1;
    }

    public int getPhotosInCameraRoll() {
        return photosInCameraRoll;
    }

    public int getDisplaySize() {
        return displaySize;
    }

}
