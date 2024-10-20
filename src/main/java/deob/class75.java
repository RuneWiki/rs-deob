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

@ObfuscatedName("bc")
public final class class75 extends class71 {

    @ObfuscatedName("bc.n")
    public Component field1315;

    @ObfuscatedName("bc.n(IILjava/awt/Component;I)V")
    public final void method1375(int arg0, int arg1, Component arg2) {
        this.field1280 = arg0;
        this.field1281 = arg1;
        this.field1283 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1283, this.field1283.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1280, this.field1281), var4, (Point) null);
        this.field1285 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1315 = arg2;
        this.method1424();
    }

    @ObfuscatedName("bc.x(Ljava/awt/Graphics;IIS)V")
    public final void method1348(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1285, arg1, arg2, this.field1315);
    }

    @ObfuscatedName("bc.k(Ljava/awt/Graphics;IIIIB)V")
    public final void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1285, 0, 0, this.field1315);
        arg0.setClip(var6);
    }
}
