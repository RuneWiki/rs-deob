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

@ObfuscatedName("ck")
public final class class88 extends class85 {

    @ObfuscatedName("ck.p")
    public Component field1495;

    @ObfuscatedName("ck.p(IILjava/awt/Component;I)V")
    public final void method1624(int arg0, int arg1, Component arg2) {
        this.field1462 = arg0;
        this.field1464 = arg1;
        this.field1474 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1474, this.field1474.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1462, this.field1464), var4, (Point) null);
        this.field1465 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1495 = arg2;
        this.method1699();
    }

    @ObfuscatedName("ck.e(Ljava/awt/Graphics;III)V")
    public final void method1625(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1465, arg1, arg2, this.field1495);
    }

    @ObfuscatedName("ck.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1626(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1465, 0, 0, this.field1495);
        arg0.setClip(var6);
    }
}
