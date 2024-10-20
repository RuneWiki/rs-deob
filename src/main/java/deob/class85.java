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

@ObfuscatedName("ce")
public final class class85 extends class81 {

    @ObfuscatedName("ce.a")
    public Component field1504;

    @ObfuscatedName("ce.a(IILjava/awt/Component;I)V")
    public final void method1557(int arg0, int arg1, Component arg2) {
        this.field1469 = arg0;
        this.field1475 = arg1;
        this.field1473 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1473, this.field1473.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1469, this.field1475), var4, (Point) null);
        this.field1471 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1504 = arg2;
        this.method1629();
    }

    @ObfuscatedName("ce.d(Ljava/awt/Graphics;III)V")
    public final void method1558(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1471, arg1, arg2, this.field1504);
    }

    @ObfuscatedName("ce.v(Ljava/awt/Graphics;IIIIB)V")
    public final void method1559(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1471, 0, 0, this.field1504);
        arg0.setClip(var6);
    }
}
