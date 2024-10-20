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
public final class class223 extends class225 {

    @ObfuscatedName("hv.d")
    public Component field3208;

    @ObfuscatedName("hv.d(IILjava/awt/Component;B)V")
    public final void method3847(int arg0, int arg1, Component arg2) {
        this.field3219 = arg0;
        this.field3218 = arg1;
        this.field3217 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3217, this.field3217.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3219, this.field3218), var4, (Point) null);
        this.field3216 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3208 = arg2;
        this.method3923();
    }

    @ObfuscatedName("hv.c(Ljava/awt/Graphics;III)V")
    public final void method3848(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3216, arg1, arg2, this.field3208);
    }

    @ObfuscatedName("hv.n(Ljava/awt/Graphics;IIIII)V")
    public final void method3849(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3216, 0, 0, this.field3208);
        arg0.setClip(var6);
    }
}
