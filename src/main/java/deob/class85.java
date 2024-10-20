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

@ObfuscatedName("ch")
public final class class85 extends class81 {

    @ObfuscatedName("ch.l")
    public Component field1505;

    @ObfuscatedName("ch.l(IILjava/awt/Component;B)V")
    public final void method1621(int arg0, int arg1, Component arg2) {
        this.field1471 = arg0;
        this.field1473 = arg1;
        this.field1475 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1475, this.field1475.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1471, this.field1473), var4, (Point) null);
        this.field1476 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1505 = arg2;
        this.method1691();
    }

    @ObfuscatedName("ch.g(Ljava/awt/Graphics;III)V")
    public final void method1622(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1476, arg1, arg2, this.field1505);
    }

    @ObfuscatedName("ch.r(Ljava/awt/Graphics;IIIIB)V")
    public final void method1623(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1476, 0, 0, this.field1505);
        arg0.setClip(var6);
    }
}
