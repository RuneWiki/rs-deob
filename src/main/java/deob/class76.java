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

@ObfuscatedName("by")
public final class class76 extends class72 {

    @ObfuscatedName("by.p")
    public Component field1321;

    @ObfuscatedName("by.p(IILjava/awt/Component;I)V")
    public final void method1399(int arg0, int arg1, Component arg2) {
        this.field1290 = arg0;
        this.field1291 = arg1;
        this.field1289 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1289, this.field1289.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1290, this.field1291), var4, (Point) null);
        this.field1292 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1321 = arg2;
        this.method1447();
    }

    @ObfuscatedName("by.y(Ljava/awt/Graphics;III)V")
    public final void method1384(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1292, arg1, arg2, this.field1321);
    }

    @ObfuscatedName("by.d(Ljava/awt/Graphics;IIIIS)V")
    public final void method1401(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1292, 0, 0, this.field1321);
        arg0.setClip(var6);
    }
}
