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
public final class class75 extends class71 {

    @ObfuscatedName("bx.e")
    public Component field1316;

    @ObfuscatedName("bx.e(IILjava/awt/Component;I)V")
    public final void method1357(int arg0, int arg1, Component arg2) {
        this.field1282 = arg0;
        this.field1281 = arg1;
        this.field1285 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1285, this.field1285.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1282, this.field1281), var4, (Point) null);
        this.field1284 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1316 = arg2;
        this.method1426();
    }

    @ObfuscatedName("bx.p(Ljava/awt/Graphics;III)V")
    public final void method1358(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1284, arg1, arg2, this.field1316);
    }

    @ObfuscatedName("bx.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1359(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1284, 0, 0, this.field1316);
        arg0.setClip(var6);
    }
}
