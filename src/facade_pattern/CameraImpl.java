package facade_pattern;

/** 子系统2实现类
 * Created by Niwa on 2017/8/11.
 */
public class CameraImpl implements Camera {


    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }
}
