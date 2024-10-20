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

@ObfuscatedName("cr")
public final class class82 extends class78 {

    @ObfuscatedName("cr.i")
    public Component field1430;

    @ObfuscatedName("cr.i(IILjava/awt/Component;B)V")
    public final void method1527(int arg0, int arg1, Component arg2) {
        this.field1394 = arg0;
        this.field1395 = arg1;
        this.field1401 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1401, this.field1401.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1394, this.field1395), var4, (Point) null);
        this.field1396 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1430 = arg2;
        this.method1579();
    }

    @ObfuscatedName("cr.v(Ljava/awt/Graphics;III)V")
    public final void method1528(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1396, arg1, arg2, this.field1430);
    }

    @ObfuscatedName("cr.r(Ljava/awt/Graphics;IIIII)V")
    public final void method1529(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1396, 0, 0, this.field1430);
        arg0.setClip(var6);
    }
}
