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

@ObfuscatedName("cr")
public final class class88 extends class85 {

    @ObfuscatedName("cr.q")
    public Component field1496;

    @ObfuscatedName("cr.q(IILjava/awt/Component;I)V")
    public final void method1636(int arg0, int arg1, Component arg2) {
        this.field1467 = arg0;
        this.field1468 = arg1;
        this.field1470 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1470, this.field1470.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1467, this.field1468), var4, (Point) null);
        this.field1469 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1496 = arg2;
        this.method1677();
    }

    @ObfuscatedName("cr.c(Ljava/awt/Graphics;III)V")
    public final void method1645(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1469, arg1, arg2, this.field1496);
    }

    @ObfuscatedName("cr.p(Ljava/awt/Graphics;IIIIB)V")
    public final void method1618(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1469, 0, 0, this.field1496);
        arg0.setClip(var6);
    }
}
