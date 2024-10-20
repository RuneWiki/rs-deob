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

@ObfuscatedName("bd")
public final class class75 extends class71 {

    @ObfuscatedName("bd.g")
    public Component field1329;

    @ObfuscatedName("bd.g(IILjava/awt/Component;I)V")
    public final void method1349(int arg0, int arg1, Component arg2) {
        this.field1293 = arg0;
        this.field1294 = arg1;
        this.field1296 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1296, this.field1296.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1293, this.field1294), var4, (Point) null);
        this.field1295 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1329 = arg2;
        this.method1420();
    }

    @ObfuscatedName("bd.s(Ljava/awt/Graphics;III)V")
    public final void method1351(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1295, arg1, arg2, this.field1329);
    }

    @ObfuscatedName("bd.h(Ljava/awt/Graphics;IIIII)V")
    public final void method1337(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1295, 0, 0, this.field1329);
        arg0.setClip(var6);
    }
}
