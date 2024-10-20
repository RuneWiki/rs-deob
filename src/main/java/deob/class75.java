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

@ObfuscatedName("bv")
public final class class75 extends class71 {

    @ObfuscatedName("bv.e")
    public Component field1329;

    @ObfuscatedName("bv.e(IILjava/awt/Component;I)V")
    public final void method1323(int arg0, int arg1, Component arg2) {
        this.field1298 = arg0;
        this.field1297 = arg1;
        this.field1300 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1300, this.field1300.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1298, this.field1297), var4, (Point) null);
        this.field1299 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1329 = arg2;
        this.method1383();
    }

    @ObfuscatedName("bv.o(Ljava/awt/Graphics;III)V")
    public final void method1324(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1299, arg1, arg2, this.field1329);
    }

    @ObfuscatedName("bv.y(Ljava/awt/Graphics;IIIII)V")
    public final void method1325(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1299, 0, 0, this.field1329);
        arg0.setClip(var6);
    }
}
