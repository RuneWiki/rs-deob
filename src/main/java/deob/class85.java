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

@ObfuscatedName("cx")
public final class class85 extends class81 {

    @ObfuscatedName("cx.s")
    public Component field1467;

    @ObfuscatedName("cx.s(IILjava/awt/Component;S)V")
    public final void method1571(int arg0, int arg1, Component arg2) {
        this.field1432 = arg0;
        this.field1433 = arg1;
        this.field1436 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1436, this.field1436.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1432, this.field1433), var4, (Point) null);
        this.field1434 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1467 = arg2;
        this.method1612();
    }

    @ObfuscatedName("cx.z(Ljava/awt/Graphics;III)V")
    public final void method1547(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1434, arg1, arg2, this.field1467);
    }

    @ObfuscatedName("cx.t(Ljava/awt/Graphics;IIIIB)V")
    public final void method1548(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1434, 0, 0, this.field1467);
        arg0.setClip(var6);
    }
}
