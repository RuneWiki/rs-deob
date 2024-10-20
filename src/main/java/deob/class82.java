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

@ObfuscatedName("cj")
public final class class82 extends class78 {

    @ObfuscatedName("cj.o")
    public Component field1417;

    @ObfuscatedName("cj.o(IILjava/awt/Component;B)V")
    public final void method1500(int arg0, int arg1, Component arg2) {
        this.field1384 = arg0;
        this.field1386 = arg1;
        this.field1385 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1385, this.field1385.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1384, this.field1386), var4, (Point) null);
        this.field1388 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1417 = arg2;
        this.method1545();
    }

    @ObfuscatedName("cj.e(Ljava/awt/Graphics;III)V")
    public final void method1479(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1388, arg1, arg2, this.field1417);
    }

    @ObfuscatedName("cj.u(Ljava/awt/Graphics;IIIII)V")
    public final void method1498(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1388, 0, 0, this.field1417);
        arg0.setClip(var6);
    }
}
