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
public final class class87 extends class84 {

    @ObfuscatedName("cs.z")
    public Component field1474;

    @ObfuscatedName("cs.z(IILjava/awt/Component;I)V")
    public final void method1620(int arg0, int arg1, Component arg2) {
        this.field1448 = arg0;
        this.field1451 = arg1;
        this.field1449 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1449, this.field1449.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1448, this.field1451), var4, (Point) null);
        this.field1450 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1474 = arg2;
        this.method1650();
    }

    @ObfuscatedName("cs.h(Ljava/awt/Graphics;IIB)V")
    public final void method1592(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1450, arg1, arg2, this.field1474);
    }

    @ObfuscatedName("cs.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method1593(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1450, 0, 0, this.field1474);
        arg0.setClip(var6);
    }
}
