package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("be")
public class class59 {

    static {
        ImageIO.setUseCache(false);
    }

    public class59() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gy.x([BI)Lla;")
    public static final class335 method3428(byte[] arg0) {
        Object var1 = null;
        try {
            BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            return new class335(var5, var3, var4);
        } catch (IOException var9) {
        } catch (InterruptedException var10) {
        }
        return new class335(0, 0);
    }
}
