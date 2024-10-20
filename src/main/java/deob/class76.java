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

@ObfuscatedName("bs")
public final class class76 extends class72 {

    @ObfuscatedName("bs.e")
    public Component field1345;

    @ObfuscatedName("bs.e(IILjava/awt/Component;S)V")
    public final void method1356(int arg0, int arg1, Component arg2) {
        this.field1311 = arg0;
        this.field1310 = arg1;
        this.field1312 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1312, this.field1312.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1311, this.field1310), var4, (Point) null);
        this.field1313 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1345 = arg2;
        this.method1416();
    }

    @ObfuscatedName("bs.v(Ljava/awt/Graphics;III)V")
    public final void method1377(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1313, arg1, arg2, this.field1345);
    }

    @ObfuscatedName("bs.k(Ljava/awt/Graphics;IIIII)V")
    public final void method1357(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1313, 0, 0, this.field1345);
        arg0.setClip(var6);
    }
}
