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

@ObfuscatedName("cw")
public final class class82 extends class78 {

    @ObfuscatedName("cw.j")
    public Component field1416;

    @ObfuscatedName("cw.j(IILjava/awt/Component;I)V")
    public final void method1520(int arg0, int arg1, Component arg2) {
        this.field1382 = arg0;
        this.field1381 = arg1;
        this.field1388 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1388, this.field1388.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1382, this.field1381), var4, (Point) null);
        this.field1383 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1416 = arg2;
        this.method1591();
    }

    @ObfuscatedName("cw.m(Ljava/awt/Graphics;IIB)V")
    public final void method1516(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1383, arg1, arg2, this.field1416);
    }

    @ObfuscatedName("cw.f(Ljava/awt/Graphics;IIIII)V")
    public final void method1519(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1383, 0, 0, this.field1416);
        arg0.setClip(var6);
    }
}
