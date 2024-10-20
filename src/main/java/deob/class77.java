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

@ObfuscatedName("bo")
public final class class77 extends class73 {

    @ObfuscatedName("bo.e")
    public Component field1298;

    @ObfuscatedName("bo.e(IILjava/awt/Component;I)V")
    public final void method1398(int arg0, int arg1, Component arg2) {
        this.field1264 = arg0;
        this.field1263 = arg1;
        this.field1267 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1267, this.field1267.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1264, this.field1263), var4, (Point) null);
        this.field1266 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1298 = arg2;
        this.method1465();
    }

    @ObfuscatedName("bo.a(Ljava/awt/Graphics;IIB)V")
    public final void method1395(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1266, arg1, arg2, this.field1298);
    }

    @ObfuscatedName("bo.l(Ljava/awt/Graphics;IIIII)V")
    public final void method1396(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1266, 0, 0, this.field1298);
        arg0.setClip(var6);
    }
}
