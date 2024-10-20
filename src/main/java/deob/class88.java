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

@ObfuscatedName("cf")
public final class class88 extends class85 {

    @ObfuscatedName("cf.i")
    public Component field1495;

    @ObfuscatedName("cf.i(IILjava/awt/Component;I)V")
    public final void method1545(int arg0, int arg1, Component arg2) {
        this.field1470 = arg0;
        this.field1471 = arg1;
        this.field1472 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1472, this.field1472.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1470, this.field1471), var4, (Point) null);
        this.field1473 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1495 = arg2;
        this.method1606();
    }

    @ObfuscatedName("cf.p(Ljava/awt/Graphics;IIB)V")
    public final void method1573(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1473, arg1, arg2, this.field1495);
    }

    @ObfuscatedName("cf.a(Ljava/awt/Graphics;IIIIS)V")
    public final void method1546(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1473, 0, 0, this.field1495);
        arg0.setClip(var6);
    }
}
