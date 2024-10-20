package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("bv")
public class class31 {

    static {
        ImageIO.setUseCache(false);
    }

    public class31() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sl.at([BI)Luz;")
    public static final class541 method7894(byte[] arg0) {
        Object var1 = null;
        try {
            Class var2 = ImageIO.class;
            BufferedImage var3;
            synchronized (ImageIO.class) {
                var3 = ImageIO.read(new ByteArrayInputStream(arg0));
            }
            int var5 = var3.getWidth();
            int var6 = var3.getHeight();
            int[] var7 = new int[var5 * var6];
            PixelGrabber var8 = new PixelGrabber(var3, 0, 0, var5, var6, var7, 0, var5);
            var8.grabPixels();
            return new class541(var7, var5, var6);
        } catch (IOException var12) {
        } catch (InterruptedException var13) {
        }
        return new class541(0, 0);
    }
}
