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

@ObfuscatedName("bj")
public final class class75 extends class71 {

    @ObfuscatedName("bj.g")
    public Component field1333;

    @ObfuscatedName("bj.g(IILjava/awt/Component;B)V")
    public final void method1319(int arg0, int arg1, Component arg2) {
        this.field1301 = arg0;
        this.field1303 = arg1;
        this.field1299 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1299, this.field1299.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1301, this.field1303), var4, (Point) null);
        this.field1302 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1333 = arg2;
        this.method1380();
    }

    @ObfuscatedName("bj.i(Ljava/awt/Graphics;III)V")
    public final void method1314(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1302, arg1, arg2, this.field1333);
    }

    @ObfuscatedName("bj.k(Ljava/awt/Graphics;IIIIB)V")
    public final void method1315(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1302, 0, 0, this.field1333);
        arg0.setClip(var6);
    }
}
