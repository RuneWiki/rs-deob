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

@ObfuscatedName("cd")
public final class class88 extends class85 {

    @ObfuscatedName("cd.j")
    public Component field1465;

    @ObfuscatedName("cd.j(IILjava/awt/Component;I)V")
    public final void method1610(int arg0, int arg1, Component arg2) {
        this.field1438 = arg0;
        this.field1444 = arg1;
        this.field1443 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1443, this.field1443.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1438, this.field1444), var4, (Point) null);
        this.field1440 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1465 = arg2;
        this.method1662();
    }

    @ObfuscatedName("cd.r(Ljava/awt/Graphics;III)V")
    public final void method1594(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1440, arg1, arg2, this.field1465);
    }

    @ObfuscatedName("cd.v(Ljava/awt/Graphics;IIIIS)V")
    public final void method1614(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1440, 0, 0, this.field1465);
        arg0.setClip(var6);
    }
}
