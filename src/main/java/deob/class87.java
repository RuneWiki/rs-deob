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
public final class class87 extends class84 {

    @ObfuscatedName("cb.c")
    public Component field1458;

    @ObfuscatedName("cb.c(IILjava/awt/Component;S)V")
    public final void method1534(int arg0, int arg1, Component arg2) {
        this.field1428 = arg0;
        this.field1427 = arg1;
        this.field1433 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1433, this.field1433.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1428, this.field1427), var4, (Point) null);
        this.field1430 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1458 = arg2;
        this.method1591();
    }

    @ObfuscatedName("cb.j(Ljava/awt/Graphics;IIB)V")
    public final void method1551(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1430, arg1, arg2, this.field1458);
    }

    @ObfuscatedName("cb.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1525(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1430, 0, 0, this.field1458);
        arg0.setClip(var6);
    }
}
