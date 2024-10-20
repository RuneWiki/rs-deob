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
public final class class87 extends class84 {

    @ObfuscatedName("cl.p")
    public Component field1491;

    @ObfuscatedName("cl.p(IILjava/awt/Component;B)V")
    public final void method1602(int arg0, int arg1, Component arg2) {
        this.field1462 = arg0;
        this.field1464 = arg1;
        this.field1466 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1466, this.field1466.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1462, this.field1464), var4, (Point) null);
        this.field1465 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1491 = arg2;
        this.method1640();
    }

    @ObfuscatedName("cl.j(Ljava/awt/Graphics;III)V")
    public final void method1570(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1465, arg1, arg2, this.field1491);
    }

    @ObfuscatedName("cl.w(Ljava/awt/Graphics;IIIII)V")
    public final void method1571(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1465, 0, 0, this.field1491);
        arg0.setClip(var6);
    }
}
