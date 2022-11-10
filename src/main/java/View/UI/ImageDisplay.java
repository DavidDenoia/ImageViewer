package View.UI;

import Model.Image;

/**
 *
 * @author David
 */
public interface ImageDisplay {
    
    Image current();
    void show(Image image);
}
