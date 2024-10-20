package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("gg")
public final class class193 {

    @ObfuscatedName("gg.w")
    public final int[] field2171;

    public class193() {
        this.field2171 = new int[4096];
    }

    public class193(int[] arg0) {
        this.field2171 = arg0;
    }

    @ObfuscatedName("dt.i([BB)Lgg;")
    public static class193 method2399(byte[] arg0) {
        if (arg0 == null) {
            return new class193();
        }
        Object var1 = null;
        class414 var7;
        try {
            BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            var7 = new class414(var5, var3, var4);
            return new class193(var7.field4396);
        } catch (IOException var10) {
        } catch (InterruptedException var11) {
        }
        var7 = new class414(0, 0);
        return new class193(var7.field4396);
    }

    @ObfuscatedName("gg.w(III)I")
    public final int method3576(int arg0, int arg1) {
        return this.field2171[arg1 * 64 + arg0];
    }
}
