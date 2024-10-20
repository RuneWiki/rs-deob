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

@ObfuscatedName("cs")
public final class class143 extends class159 {

    @ObfuscatedName("cs.v")
    public Component field2161;

    @ObfuscatedName("cs.c(Ljava/awt/Graphics;III)V")
    public final void method2597(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field2387, arg1, arg2, this.field2161);
    }

    @ObfuscatedName("cs.b(Ljava/awt/Graphics;IIIII)V")
    public final void method2627(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field2387, 0, 0, this.field2161);
        arg0.setClip(var6);
    }

    @ObfuscatedName("cs.v(IILjava/awt/Component;S)V")
    public final void method2596(int arg0, int arg1, Component arg2) {
        this.field2385 = arg0;
        this.field2384 = arg1;
        this.field2386 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field2386, this.field2386.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field2385, this.field2384), var4, (Point) null);
        this.field2387 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field2161 = arg2;
        this.method2826();
    }
}
