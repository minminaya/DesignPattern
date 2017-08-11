package facade_pattern;

/** 手机外观
 * Created by Niwa on 2017/8/11.
 */
public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera camera = new CameraImpl();

    public void dail(){
        mPhone.dail();
    }
    public void videoChat(){
        camera.open();
        mPhone.dail();
    }
    public void takePicture(){
        camera.open();
        camera.takePicture();
    }

}
