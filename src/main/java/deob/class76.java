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

@ObfuscatedName("bx")
public final class class76 extends class72 {

    @ObfuscatedName("bx.c")
    public Component field1321;

    @ObfuscatedName("bx.c(IILjava/awt/Component;B)V")
    public final void method1345(int arg0, int arg1, Component arg2) {
        this.field1292 = arg0;
        this.field1289 = arg1;
        this.field1288 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1288, this.field1288.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1292, this.field1289), var4, (Point) null);
        this.field1290 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1321 = arg2;
        this.method1417();
    }

    @ObfuscatedName("bx.j(Ljava/awt/Graphics;III)V")
    public final void method1367(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1290, arg1, arg2, this.field1321);
    }

    @ObfuscatedName("bx.y(Ljava/awt/Graphics;IIIIB)V")
    public final void method1346(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1290, 0, 0, this.field1321);
        arg0.setClip(var6);
    }
}
