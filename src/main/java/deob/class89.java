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
public final class class89 extends class86 {

    @ObfuscatedName("cx.e")
    public Component field1479;

    @ObfuscatedName("cx.e(IILjava/awt/Component;B)V")
    public final void method1653(int arg0, int arg1, Component arg2) {
        this.field1452 = arg0;
        this.field1456 = arg1;
        this.field1451 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1451, this.field1451.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1452, this.field1456), var4, (Point) null);
        this.field1454 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1479 = arg2;
        this.method1718();
    }

    @ObfuscatedName("cx.i(Ljava/awt/Graphics;III)V")
    public final void method1648(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1454, arg1, arg2, this.field1479);
    }

    @ObfuscatedName("cx.k(Ljava/awt/Graphics;IIIIS)V")
    public final void method1647(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1454, 0, 0, this.field1479);
        arg0.setClip(var6);
    }
}
