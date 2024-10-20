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

@ObfuscatedName("ch")
public final class class88 extends class85 {

    @ObfuscatedName("ch.c")
    public Component field1509;

    @ObfuscatedName("ch.c(IILjava/awt/Component;B)V")
    public final void method1532(int arg0, int arg1, Component arg2) {
        this.field1485 = arg0;
        this.field1479 = arg1;
        this.field1477 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1477, this.field1477.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1485, this.field1479), var4, (Point) null);
        this.field1481 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1509 = arg2;
        this.method1586();
    }

    @ObfuscatedName("ch.q(Ljava/awt/Graphics;III)V")
    public final void method1533(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1481, arg1, arg2, this.field1509);
    }

    @ObfuscatedName("ch.y(Ljava/awt/Graphics;IIIII)V")
    public final void method1534(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1481, 0, 0, this.field1509);
        arg0.setClip(var6);
    }
}
