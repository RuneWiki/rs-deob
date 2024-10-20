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
public final class class88 extends class85 {

    @ObfuscatedName("cj.t")
    public Component field1523;

    @ObfuscatedName("cj.t(IILjava/awt/Component;I)V")
    public final void method1635(int arg0, int arg1, Component arg2) {
        this.field1496 = arg0;
        this.field1497 = arg1;
        this.field1500 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1500, this.field1500.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1496, this.field1497), var4, (Point) null);
        this.field1498 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1523 = arg2;
        this.method1678();
    }

    @ObfuscatedName("cj.l(Ljava/awt/Graphics;III)V")
    public final void method1611(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1498, arg1, arg2, this.field1523);
    }

    @ObfuscatedName("cj.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method1609(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1498, 0, 0, this.field1523);
        arg0.setClip(var6);
    }
}
