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

@ObfuscatedName("cs")
public final class class85 extends class81 {

    @ObfuscatedName("cs.e")
    public Component field1493;

    @ObfuscatedName("cs.e(IILjava/awt/Component;I)V")
    public final void method1609(int arg0, int arg1, Component arg2) {
        this.field1460 = arg0;
        this.field1462 = arg1;
        this.field1465 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1465, this.field1465.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1460, this.field1462), var4, (Point) null);
        this.field1463 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1493 = arg2;
        this.method1688();
    }

    @ObfuscatedName("cs.l(Ljava/awt/Graphics;III)V")
    public final void method1610(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1463, arg1, arg2, this.field1493);
    }

    @ObfuscatedName("cs.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method1611(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1463, 0, 0, this.field1493);
        arg0.setClip(var6);
    }
}
