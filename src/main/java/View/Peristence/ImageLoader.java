package View.Peristence;

import Model.Image;

/**
 *
 * @author David
 */
public interface ImageLoader {
    
    Image load();
    Image next();
    Image prev();
    
}
