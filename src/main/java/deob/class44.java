package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("as")
public class class44 {

    static {
        ImageIO.setUseCache(false);
    }

    public class44() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.v([BI)Llh;")
    public static final class322 method2465(byte[] arg0) {
        Object var1 = null;
        try {
            BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            return new class322(var5, var3, var4);
        } catch (IOException var9) {
        } catch (InterruptedException var10) {
        }
        return new class322(0, 0);
    }
}
