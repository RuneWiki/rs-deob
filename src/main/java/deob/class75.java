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

@ObfuscatedName("bx")
public final class class75 extends class71 {

    @ObfuscatedName("bx.k")
    public Component field1333;

    @ObfuscatedName("bx.k(IILjava/awt/Component;B)V")
    public final void method1337(int arg0, int arg1, Component arg2) {
        this.field1305 = arg0;
        this.field1297 = arg1;
        this.field1303 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1303, this.field1303.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1305, this.field1297), var4, (Point) null);
        this.field1296 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1333 = arg2;
        this.method1409();
    }

    @ObfuscatedName("bx.b(Ljava/awt/Graphics;IIB)V")
    public final void method1338(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1296, arg1, arg2, this.field1333);
    }

    @ObfuscatedName("bx.e(Ljava/awt/Graphics;IIIII)V")
    public final void method1343(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1296, 0, 0, this.field1333);
        arg0.setClip(var6);
    }
}
