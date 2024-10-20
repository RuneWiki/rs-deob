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

@ObfuscatedName("cv")
public final class class88 extends class85 {

    @ObfuscatedName("cv.f")
    public Component field1477;

    @ObfuscatedName("cv.f(IILjava/awt/Component;I)V")
    public final void method1631(int arg0, int arg1, Component arg2) {
        this.field1449 = arg0;
        this.field1450 = arg1;
        this.field1455 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1455, this.field1455.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1449, this.field1450), var4, (Point) null);
        this.field1454 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1477 = arg2;
        this.method1693();
    }

    @ObfuscatedName("cv.t(Ljava/awt/Graphics;IIB)V")
    public final void method1626(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1454, arg1, arg2, this.field1477);
    }

    @ObfuscatedName("cv.n(Ljava/awt/Graphics;IIIII)V")
    public final void method1628(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1454, 0, 0, this.field1477);
        arg0.setClip(var6);
    }
}
