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

@ObfuscatedName("ca")
public final class class82 extends class78 {

    @ObfuscatedName("ca.j")
    public Component field1410;

    @ObfuscatedName("ca.j(IILjava/awt/Component;I)V")
    public final void method1504(int arg0, int arg1, Component arg2) {
        this.field1374 = arg0;
        this.field1375 = arg1;
        this.field1377 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1377, this.field1377.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1374, this.field1375), var4, (Point) null);
        this.field1381 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1410 = arg2;
        this.method1580();
    }

    @ObfuscatedName("ca.h(Ljava/awt/Graphics;III)V")
    public final void method1515(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1381, arg1, arg2, this.field1410);
    }

    @ObfuscatedName("ca.m(Ljava/awt/Graphics;IIIIB)V")
    public final void method1505(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1381, 0, 0, this.field1410);
        arg0.setClip(var6);
    }
}
