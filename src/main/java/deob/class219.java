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

@ObfuscatedName("hv")
public final class class219 extends class221 {

    @ObfuscatedName("hv.i")
    public Component field3171;

    @ObfuscatedName("hv.i(IILjava/awt/Component;I)V")
    public final void method3664(int arg0, int arg1, Component arg2) {
        this.field3180 = arg0;
        this.field3181 = arg1;
        this.field3182 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3182, this.field3182.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3180, this.field3181), var4, (Point) null);
        this.field3179 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3171 = arg2;
        this.method3740();
    }

    @ObfuscatedName("hv.e(Ljava/awt/Graphics;IIB)V")
    public final void method3669(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3179, arg1, arg2, this.field3171);
    }

    @ObfuscatedName("hv.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method3665(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3179, 0, 0, this.field3171);
        arg0.setClip(var6);
    }
}
