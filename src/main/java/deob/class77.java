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
public final class class77 extends class73 {

    @ObfuscatedName("bj.o")
    public Component field1351;

    @ObfuscatedName("bj.o(IILjava/awt/Component;B)V")
    public final void method1407(int arg0, int arg1, Component arg2) {
        this.field1320 = arg0;
        this.field1321 = arg1;
        this.field1319 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1319, this.field1319.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1320, this.field1321), var4, (Point) null);
        this.field1323 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1351 = arg2;
        this.method1475();
    }

    @ObfuscatedName("bj.l(Ljava/awt/Graphics;IIB)V")
    public final void method1408(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1323, arg1, arg2, this.field1351);
    }

    @ObfuscatedName("bj.g(Ljava/awt/Graphics;IIIIB)V")
    public final void method1409(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1323, 0, 0, this.field1351);
        arg0.setClip(var6);
    }
}
