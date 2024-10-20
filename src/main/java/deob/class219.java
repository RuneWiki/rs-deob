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

@ObfuscatedName("ha")
public final class class219 extends class221 {

    @ObfuscatedName("ha.o")
    public Component field3170;

    @ObfuscatedName("ha.o(IILjava/awt/Component;B)V")
    public final void method3674(int arg0, int arg1, Component arg2) {
        this.field3182 = arg0;
        this.field3180 = arg1;
        this.field3179 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3179, this.field3179.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3182, this.field3180), var4, (Point) null);
        this.field3181 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3170 = arg2;
        this.method3769();
    }

    @ObfuscatedName("ha.m(Ljava/awt/Graphics;III)V")
    public final void method3675(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3181, arg1, arg2, this.field3170);
    }

    @ObfuscatedName("ha.b(Ljava/awt/Graphics;IIIII)V")
    public final void method3673(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3181, 0, 0, this.field3170);
        arg0.setClip(var6);
    }
}
