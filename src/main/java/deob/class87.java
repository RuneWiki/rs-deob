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

@ObfuscatedName("ci")
public final class class87 extends class84 {

    @ObfuscatedName("ci.u")
    public Component field1462;

    @ObfuscatedName("ci.u(IILjava/awt/Component;I)V")
    public final void method1602(int arg0, int arg1, Component arg2) {
        this.field1434 = arg0;
        this.field1435 = arg1;
        this.field1437 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1437, this.field1437.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1434, this.field1435), var4, (Point) null);
        this.field1436 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1462 = arg2;
        this.method1666();
    }

    @ObfuscatedName("ci.k(Ljava/awt/Graphics;IIS)V")
    public final void method1603(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1436, arg1, arg2, this.field1462);
    }

    @ObfuscatedName("ci.x(Ljava/awt/Graphics;IIIII)V")
    public final void method1621(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1436, 0, 0, this.field1462);
        arg0.setClip(var6);
    }
}
