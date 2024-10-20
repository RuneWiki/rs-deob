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

@ObfuscatedName("cs")
public final class class89 extends class86 {

    @ObfuscatedName("cs.i")
    public Component field1504;

    @ObfuscatedName("cs.i(IILjava/awt/Component;B)V")
    public final void method1617(int arg0, int arg1, Component arg2) {
        this.field1477 = arg0;
        this.field1476 = arg1;
        this.field1479 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1479, this.field1479.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1477, this.field1476), var4, (Point) null);
        this.field1478 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1504 = arg2;
        this.method1679();
    }

    @ObfuscatedName("cs.b(Ljava/awt/Graphics;IIB)V")
    public final void method1632(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1478, arg1, arg2, this.field1504);
    }

    @ObfuscatedName("cs.r(Ljava/awt/Graphics;IIIII)V")
    public final void method1610(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1478, 0, 0, this.field1504);
        arg0.setClip(var6);
    }
}
