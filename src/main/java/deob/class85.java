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

@ObfuscatedName("cr")
public final class class85 extends class81 {

    @ObfuscatedName("cr.m")
    public Component field1503;

    @ObfuscatedName("cr.m(IILjava/awt/Component;B)V")
    public final void method1601(int arg0, int arg1, Component arg2) {
        this.field1469 = arg0;
        this.field1470 = arg1;
        this.field1468 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1468, this.field1468.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1469, this.field1470), var4, (Point) null);
        this.field1471 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1503 = arg2;
        this.method1676();
    }

    @ObfuscatedName("cr.w(Ljava/awt/Graphics;III)V")
    public final void method1597(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1471, arg1, arg2, this.field1503);
    }

    @ObfuscatedName("cr.e(Ljava/awt/Graphics;IIIIS)V")
    public final void method1599(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1471, 0, 0, this.field1503);
        arg0.setClip(var6);
    }
}
