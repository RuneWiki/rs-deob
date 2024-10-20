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

@ObfuscatedName("cv")
public final class class82 extends class78 {

    @ObfuscatedName("cv.n")
    public Component field1417;

    @ObfuscatedName("cv.n(IILjava/awt/Component;S)V")
    public final void method1484(int arg0, int arg1, Component arg2) {
        this.field1384 = arg0;
        this.field1389 = arg1;
        this.field1377 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1377, this.field1377.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1384, this.field1389), var4, (Point) null);
        this.field1379 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1417 = arg2;
        this.method1550();
    }

    @ObfuscatedName("cv.d(Ljava/awt/Graphics;III)V")
    public final void method1482(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1379, arg1, arg2, this.field1417);
    }

    @ObfuscatedName("cv.s(Ljava/awt/Graphics;IIIII)V")
    public final void method1483(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1379, 0, 0, this.field1417);
        arg0.setClip(var6);
    }
}
