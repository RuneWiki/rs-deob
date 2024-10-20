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

@ObfuscatedName("cd")
public final class class82 extends class78 {

    @ObfuscatedName("cd.o")
    public Component field1412;

    @ObfuscatedName("cd.o(IILjava/awt/Component;I)V")
    public final void method1465(int arg0, int arg1, Component arg2) {
        this.field1378 = arg0;
        this.field1379 = arg1;
        this.field1377 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1377, this.field1377.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1378, this.field1379), var4, (Point) null);
        this.field1380 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1412 = arg2;
        this.method1527();
    }

    @ObfuscatedName("cd.f(Ljava/awt/Graphics;III)V")
    public final void method1458(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1380, arg1, arg2, this.field1412);
    }

    @ObfuscatedName("cd.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1459(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1380, 0, 0, this.field1412);
        arg0.setClip(var6);
    }
}
