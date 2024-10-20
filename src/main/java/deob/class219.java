package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("he")
public final class class219 extends class221 {

    @ObfuscatedName("he.b")
    public Component field3185;

    @ObfuscatedName("he.b(IILjava/awt/Component;B)V")
    public final void method3799(int arg0, int arg1, Component arg2) {
        this.field3195 = arg0;
        this.field3194 = arg1;
        this.field3193 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3193, this.field3193.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3195, this.field3194), var4, (Point) null);
        this.field3196 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3185 = arg2;
        this.method3880();
    }

    @ObfuscatedName("he.e(Ljava/awt/Graphics;IIB)V")
    public final void method3798(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3196, arg1, arg2, this.field3185);
    }

    @ObfuscatedName("he.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method3801(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3196, 0, 0, this.field3185);
        arg0.setClip(var6);
    }
}
