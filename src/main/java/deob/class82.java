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

@ObfuscatedName("cz")
public final class class82 extends class78 {

    @ObfuscatedName("cz.f")
    public Component field1435;

    @ObfuscatedName("cz.f(IILjava/awt/Component;B)V")
    public final void method1547(int arg0, int arg1, Component arg2) {
        this.field1403 = arg0;
        this.field1405 = arg1;
        this.field1407 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1407, this.field1407.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1403, this.field1405), var4, (Point) null);
        this.field1406 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1435 = arg2;
        this.method1618();
    }

    @ObfuscatedName("cz.u(Ljava/awt/Graphics;III)V")
    public final void method1548(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1406, arg1, arg2, this.field1435);
    }

    @ObfuscatedName("cz.x(Ljava/awt/Graphics;IIIII)V")
    public final void method1549(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1406, 0, 0, this.field1435);
        arg0.setClip(var6);
    }
}
