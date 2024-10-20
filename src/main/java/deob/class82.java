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

@ObfuscatedName("ci")
public final class class82 extends class78 {

    @ObfuscatedName("ci.m")
    public Component field1381;

    @ObfuscatedName("ci.m(IILjava/awt/Component;I)V")
    public final void method1556(int arg0, int arg1, Component arg2) {
        this.field1348 = arg0;
        this.field1350 = arg1;
        this.field1349 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1349, this.field1349.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1348, this.field1350), var4, (Point) null);
        this.field1351 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1381 = arg2;
        this.method1628();
    }

    @ObfuscatedName("ci.l(Ljava/awt/Graphics;IIB)V")
    public final void method1557(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1351, arg1, arg2, this.field1381);
    }

    @ObfuscatedName("ci.y(Ljava/awt/Graphics;IIIIB)V")
    public final void method1558(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1351, 0, 0, this.field1381);
        arg0.setClip(var6);
    }
}
