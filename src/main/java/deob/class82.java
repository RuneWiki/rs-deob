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

@ObfuscatedName("cb")
public final class class82 extends class78 {

    @ObfuscatedName("cb.h")
    public Component field1437;

    @ObfuscatedName("cb.h(IILjava/awt/Component;B)V")
    public final void method1489(int arg0, int arg1, Component arg2) {
        this.field1398 = arg0;
        this.field1405 = arg1;
        this.field1400 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1400, this.field1400.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1398, this.field1405), var4, (Point) null);
        this.field1399 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1437 = arg2;
        this.method1563();
    }

    @ObfuscatedName("cb.m(Ljava/awt/Graphics;IIB)V")
    public final void method1518(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1399, arg1, arg2, this.field1437);
    }

    @ObfuscatedName("cb.i(Ljava/awt/Graphics;IIIIB)V")
    public final void method1491(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1399, 0, 0, this.field1437);
        arg0.setClip(var6);
    }
}
