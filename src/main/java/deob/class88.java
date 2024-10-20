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
public final class class88 extends class85 {

    @ObfuscatedName("cv.y")
    public Component field1479;

    @ObfuscatedName("cv.y(IILjava/awt/Component;B)V")
    public final void method1600(int arg0, int arg1, Component arg2) {
        this.field1450 = arg0;
        this.field1455 = arg1;
        this.field1451 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1451, this.field1451.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1450, this.field1455), var4, (Point) null);
        this.field1452 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1479 = arg2;
        this.method1672();
    }

    @ObfuscatedName("cv.m(Ljava/awt/Graphics;III)V")
    public final void method1601(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1452, arg1, arg2, this.field1479);
    }

    @ObfuscatedName("cv.d(Ljava/awt/Graphics;IIIII)V")
    public final void method1602(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1452, 0, 0, this.field1479);
        arg0.setClip(var6);
    }
}
