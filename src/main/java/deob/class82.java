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
public final class class82 extends class78 {

    @ObfuscatedName("ch.v")
    public Component field1420;

    @ObfuscatedName("ch.v(IILjava/awt/Component;B)V")
    public final void method1508(int arg0, int arg1, Component arg2) {
        this.field1388 = arg0;
        this.field1391 = arg1;
        this.field1392 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1392, this.field1392.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1388, this.field1391), var4, (Point) null);
        this.field1390 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1420 = arg2;
        this.method1598();
    }

    @ObfuscatedName("ch.f(Ljava/awt/Graphics;III)V")
    public final void method1509(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1390, arg1, arg2, this.field1420);
    }

    @ObfuscatedName("ch.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1510(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1390, 0, 0, this.field1420);
        arg0.setClip(var6);
    }
}
