package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("bk")
public class class31 {

    static {
        ImageIO.setUseCache(false);
    }

    public class31() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sp.ap([BB)Lvv;")
    public static final class572 method8331(byte[] arg0) {
        Object var1 = null;
        try {
            Class var2 = ImageIO.class;
            BufferedImage var3;
            synchronized (ImageIO.class) {
                var3 = ImageIO.read(new ByteArrayInputStream(arg0));
            }
            if (var3 != null) {
                int var5 = var3.getWidth();
                int var6 = var3.getHeight();
                int[] var7 = new int[var5 * var6];
                PixelGrabber var8 = new PixelGrabber(var3, 0, 0, var5, var6, var7, 0, var5);
                var8.grabPixels();
                return new class572(var7, var5, var6);
            }
        } catch (IOException var12) {
        } catch (InterruptedException var13) {
        }
        return new class572(0, 0);
    }
}
