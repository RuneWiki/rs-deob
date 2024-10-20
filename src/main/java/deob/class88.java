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

@ObfuscatedName("cw")
public final class class88 extends class85 {

    @ObfuscatedName("cw.a")
    public Component field1461;

    @ObfuscatedName("cw.a(IILjava/awt/Component;I)V")
    public final void method1542(int arg0, int arg1, Component arg2) {
        this.field1435 = arg0;
        this.field1439 = arg1;
        this.field1438 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1438, this.field1438.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1435, this.field1439), var4, (Point) null);
        this.field1437 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1461 = arg2;
        this.method1616();
    }

    @ObfuscatedName("cw.r(Ljava/awt/Graphics;IIB)V")
    public final void method1543(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1437, arg1, arg2, this.field1461);
    }

    @ObfuscatedName("cw.u(Ljava/awt/Graphics;IIIII)V")
    public final void method1550(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1437, 0, 0, this.field1461);
        arg0.setClip(var6);
    }
}
