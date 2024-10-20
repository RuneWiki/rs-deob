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
public final class class82 extends class78 {

    @ObfuscatedName("cs.b")
    public Component field1397;

    @ObfuscatedName("cs.b(IILjava/awt/Component;I)V")
    public final void method1515(int arg0, int arg1, Component arg2) {
        this.field1364 = arg0;
        this.field1365 = arg1;
        this.field1369 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1369, this.field1369.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1364, this.field1365), var4, (Point) null);
        this.field1363 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1397 = arg2;
        this.method1571();
    }

    @ObfuscatedName("cs.g(Ljava/awt/Graphics;IIB)V")
    public final void method1516(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1363, arg1, arg2, this.field1397);
    }

    @ObfuscatedName("cs.j(Ljava/awt/Graphics;IIIII)V")
    public final void method1517(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1363, 0, 0, this.field1397);
        arg0.setClip(var6);
    }
}
