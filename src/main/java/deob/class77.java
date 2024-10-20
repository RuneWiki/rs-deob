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

@ObfuscatedName("bm")
public final class class77 extends class73 {

    @ObfuscatedName("bm.p")
    public Component field1365;

    @ObfuscatedName("bm.p(IILjava/awt/Component;B)V")
    public final void method1382(int arg0, int arg1, Component arg2) {
        this.field1334 = arg0;
        this.field1336 = arg1;
        this.field1335 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1335, this.field1335.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1334, this.field1336), var4, (Point) null);
        this.field1333 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1365 = arg2;
        this.method1435();
    }

    @ObfuscatedName("bm.k(Ljava/awt/Graphics;III)V")
    public final void method1383(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1333, arg1, arg2, this.field1365);
    }

    @ObfuscatedName("bm.e(Ljava/awt/Graphics;IIIII)V")
    public final void method1384(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1333, 0, 0, this.field1365);
        arg0.setClip(var6);
    }
}
