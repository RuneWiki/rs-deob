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

@ObfuscatedName("cb")
public final class class85 extends class81 {

    @ObfuscatedName("cb.x")
    public Component field1463;

    @ObfuscatedName("cb.x(IILjava/awt/Component;I)V")
    public final void method1549(int arg0, int arg1, Component arg2) {
        this.field1429 = arg0;
        this.field1431 = arg1;
        this.field1430 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1430, this.field1430.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1429, this.field1431), var4, (Point) null);
        this.field1432 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1463 = arg2;
        this.method1618();
    }

    @ObfuscatedName("cb.r(Ljava/awt/Graphics;III)V")
    public final void method1550(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1432, arg1, arg2, this.field1463);
    }

    @ObfuscatedName("cb.j(Ljava/awt/Graphics;IIIII)V")
    public final void method1551(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1432, 0, 0, this.field1463);
        arg0.setClip(var6);
    }
}
