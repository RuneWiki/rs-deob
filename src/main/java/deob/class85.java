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
public final class class85 extends class81 {

    @ObfuscatedName("ch.i")
    public Component field1481;

    @ObfuscatedName("ch.i(IILjava/awt/Component;B)V")
    public final void method1552(int arg0, int arg1, Component arg2) {
        this.field1452 = arg0;
        this.field1447 = arg1;
        this.field1445 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1445, this.field1445.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1452, this.field1447), var4, (Point) null);
        this.field1448 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1481 = arg2;
        this.method1636();
    }

    @ObfuscatedName("ch.h(Ljava/awt/Graphics;IIB)V")
    public final void method1553(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1448, arg1, arg2, this.field1481);
    }

    @ObfuscatedName("ch.e(Ljava/awt/Graphics;IIIII)V")
    public final void method1555(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1448, 0, 0, this.field1481);
        arg0.setClip(var6);
    }
}
