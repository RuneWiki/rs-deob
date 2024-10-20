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

@ObfuscatedName("ct")
public final class class88 extends class85 {

    @ObfuscatedName("ct.g")
    public Component field1475;

    @ObfuscatedName("ct.g(IILjava/awt/Component;B)V")
    public final void method1629(int arg0, int arg1, Component arg2) {
        this.field1451 = arg0;
        this.field1448 = arg1;
        this.field1454 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1454, this.field1454.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1451, this.field1448), var4, (Point) null);
        this.field1449 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1475 = arg2;
        this.method1702();
    }

    @ObfuscatedName("ct.h(Ljava/awt/Graphics;III)V")
    public final void method1643(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1449, arg1, arg2, this.field1475);
    }

    @ObfuscatedName("ct.s(Ljava/awt/Graphics;IIIII)V")
    public final void method1655(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1449, 0, 0, this.field1475);
        arg0.setClip(var6);
    }
}
