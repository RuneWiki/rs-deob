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

@ObfuscatedName("co")
public final class class88 extends class85 {

    @ObfuscatedName("co.p")
    public Component field1489;

    @ObfuscatedName("co.p(IILjava/awt/Component;B)V")
    public final void method1641(int arg0, int arg1, Component arg2) {
        this.field1465 = arg0;
        this.field1461 = arg1;
        this.field1463 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1463, this.field1463.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1465, this.field1461), var4, (Point) null);
        this.field1462 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1489 = arg2;
        this.method1717();
    }

    @ObfuscatedName("co.i(Ljava/awt/Graphics;IIB)V")
    public final void method1661(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1462, arg1, arg2, this.field1489);
    }

    @ObfuscatedName("co.o(Ljava/awt/Graphics;IIIII)V")
    public final void method1643(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1462, 0, 0, this.field1489);
        arg0.setClip(var6);
    }
}
