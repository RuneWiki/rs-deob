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

@ObfuscatedName("cc")
public final class class85 extends class81 {

    @ObfuscatedName("cc.k")
    public Component field1483;

    @ObfuscatedName("cc.k(IILjava/awt/Component;I)V")
    public final void method1585(int arg0, int arg1, Component arg2) {
        this.field1445 = arg0;
        this.field1446 = arg1;
        this.field1444 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1444, this.field1444.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1445, this.field1446), var4, (Point) null);
        this.field1447 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1483 = arg2;
        this.method1624();
    }

    @ObfuscatedName("cc.q(Ljava/awt/Graphics;IIB)V")
    public final void method1588(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1447, arg1, arg2, this.field1483);
    }

    @ObfuscatedName("cc.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1567(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1447, 0, 0, this.field1483);
        arg0.setClip(var6);
    }
}
