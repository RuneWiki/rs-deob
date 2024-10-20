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
public final class class88 extends class85 {

    @ObfuscatedName("cs.l")
    public Component field1477;

    @ObfuscatedName("cs.l(IILjava/awt/Component;B)V")
    public final void method1625(int arg0, int arg1, Component arg2) {
        this.field1450 = arg0;
        this.field1452 = arg1;
        this.field1455 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1455, this.field1455.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1450, this.field1452), var4, (Point) null);
        this.field1453 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1477 = arg2;
        this.method1671();
    }

    @ObfuscatedName("cs.b(Ljava/awt/Graphics;IIB)V")
    public final void method1605(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1453, arg1, arg2, this.field1477);
    }

    @ObfuscatedName("cs.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method1624(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1453, 0, 0, this.field1477);
        arg0.setClip(var6);
    }
}
