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

@ObfuscatedName("cl")
public final class class88 extends class85 {

    @ObfuscatedName("cl.b")
    public Component field1511;

    @ObfuscatedName("cl.b(IILjava/awt/Component;B)V")
    public final void method1581(int arg0, int arg1, Component arg2) {
        this.field1483 = arg0;
        this.field1482 = arg1;
        this.field1486 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1486, this.field1486.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1483, this.field1482), var4, (Point) null);
        this.field1485 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1511 = arg2;
        this.method1641();
    }

    @ObfuscatedName("cl.c(Ljava/awt/Graphics;IIB)V")
    public final void method1582(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1485, arg1, arg2, this.field1511);
    }

    @ObfuscatedName("cl.j(Ljava/awt/Graphics;IIIII)V")
    public final void method1583(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1485, 0, 0, this.field1511);
        arg0.setClip(var6);
    }
}
