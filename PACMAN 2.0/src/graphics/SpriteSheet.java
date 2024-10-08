package graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

 /* @author AXEL ROMAN */

public class SpriteSheet {
    public final int [] pixels;
    private final int width;
    private final int height;
    
    
    public SpriteSheet(final String url, final int width, final int height){
        this.width = width;
        this.height = height;
        
        pixels = new int[width * height];
        
        BufferedImage img;
        try {
            img = ImageIO.read(SpriteSheet.class.getResource(url));
            img.getRGB(0, 0, width, height, pixels, 0, width);
        } catch (IOException e) {
        }
        
    }
    
}
