package state_pattern;

/**
 * Created by Niwa on 2017/8/20.
 */
public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
        //调高音量，此时不会生效
        tvController.turnUp();
    }
}
