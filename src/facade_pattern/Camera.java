package facade_pattern;

/**
 * 子系统2接口（拍照）
 * Created by Niwa on 2017/8/11.
 */
public interface Camera {
    /**
     * open camera
     */
    public void open();

    /**
     * close camera
     */
    public void close();

    /**
     * take camera
     */
    public void takePicture();

}
