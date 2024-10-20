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

@ObfuscatedName("bz")
public final class class77 extends class73 {

    @ObfuscatedName("bz.n")
    public Component field1368;

    @ObfuscatedName("bz.n(IILjava/awt/Component;B)V")
    public final void method1466(int arg0, int arg1, Component arg2) {
        this.field1335 = arg0;
        this.field1337 = arg1;
        this.field1336 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1336, this.field1336.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1335, this.field1337), var4, (Point) null);
        this.field1338 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1368 = arg2;
        this.method1503();
    }

    @ObfuscatedName("bz.o(Ljava/awt/Graphics;III)V")
    public final void method1435(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1338, arg1, arg2, this.field1368);
    }

    @ObfuscatedName("bz.a(Ljava/awt/Graphics;IIIIB)V")
    public final void method1436(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1338, 0, 0, this.field1368);
        arg0.setClip(var6);
    }
}
