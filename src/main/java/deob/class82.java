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
public final class class82 extends class78 {

    @ObfuscatedName("cx.n")
    public Component field1414;

    @ObfuscatedName("cx.n(IILjava/awt/Component;B)V")
    public final void method1513(int arg0, int arg1, Component arg2) {
        this.field1381 = arg0;
        this.field1382 = arg1;
        this.field1384 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1384, this.field1384.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1381, this.field1382), var4, (Point) null);
        this.field1380 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1414 = arg2;
        this.method1590();
    }

    @ObfuscatedName("cx.q(Ljava/awt/Graphics;IIB)V")
    public final void method1514(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1380, arg1, arg2, this.field1414);
    }

    @ObfuscatedName("cx.c(Ljava/awt/Graphics;IIIII)V")
    public final void method1542(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1380, 0, 0, this.field1414);
        arg0.setClip(var6);
    }
}
