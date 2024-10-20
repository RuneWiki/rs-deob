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

@ObfuscatedName("cq")
public final class class88 extends class85 {

    @ObfuscatedName("cq.a")
    public Component field1490;

    @ObfuscatedName("cq.a(IILjava/awt/Component;S)V")
    public final void method1570(int arg0, int arg1, Component arg2) {
        this.field1466 = arg0;
        this.field1467 = arg1;
        this.field1468 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1468, this.field1468.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1466, this.field1467), var4, (Point) null);
        this.field1465 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1490 = arg2;
        this.method1627();
    }

    @ObfuscatedName("cq.x(Ljava/awt/Graphics;III)V")
    public final void method1563(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1465, arg1, arg2, this.field1490);
    }

    @ObfuscatedName("cq.e(Ljava/awt/Graphics;IIIII)V")
    public final void method1580(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1465, 0, 0, this.field1490);
        arg0.setClip(var6);
    }
}
