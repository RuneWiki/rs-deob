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

@ObfuscatedName("bg")
public final class class72 extends class68 {

    @ObfuscatedName("bg.m")
    public Component field1291;

    @ObfuscatedName("bg.m(IILjava/awt/Component;I)V")
    public final void method1329(int arg0, int arg1, Component arg2) {
        this.field1261 = arg0;
        this.field1259 = arg1;
        this.field1258 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1258, this.field1258.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1261, this.field1259), var4, (Point) null);
        this.field1260 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1291 = arg2;
        this.method1391();
    }

    @ObfuscatedName("bg.k(Ljava/awt/Graphics;III)V")
    public final void method1325(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1260, arg1, arg2, this.field1291);
    }

    @ObfuscatedName("bg.y(Ljava/awt/Graphics;IIIIB)V")
    public final void method1337(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1260, 0, 0, this.field1291);
        arg0.setClip(var6);
    }
}
