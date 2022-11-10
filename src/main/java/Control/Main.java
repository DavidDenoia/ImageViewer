package Control;

import java.io.File;
import Model.Image;
import View.Peristence.FileImageLoader;
/**
 *
 * @author David
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\David\\Desktop\\Ingeneria Informatica\\3ª Curso Plan Nuevo\\1ª Cuatrimestre\\Ingenieria de Software 2\\Imagenes");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        
        MainFrame mainFrame = new MainFrame(imageLoader);
        mainFrame.getImageDisplay().show(image);
    }
    
}
