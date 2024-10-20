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

@ObfuscatedName("co")
public final class class88 extends class85 {

    @ObfuscatedName("co.g")
    public Component field1484;

    @ObfuscatedName("co.g(IILjava/awt/Component;I)V")
    public final void method1586(int arg0, int arg1, Component arg2) {
        this.field1459 = arg0;
        this.field1460 = arg1;
        this.field1462 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1462, this.field1462.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1459, this.field1460), var4, (Point) null);
        this.field1461 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1484 = arg2;
        this.method1645();
    }

    @ObfuscatedName("co.m(Ljava/awt/Graphics;III)V")
    public final void method1587(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1461, arg1, arg2, this.field1484);
    }

    @ObfuscatedName("co.v(Ljava/awt/Graphics;IIIII)V")
    public final void method1609(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1461, 0, 0, this.field1484);
        arg0.setClip(var6);
    }
}
