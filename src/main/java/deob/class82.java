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

@ObfuscatedName("cv")
public final class class82 extends class78 {

    @ObfuscatedName("cv.a")
    public Component field1428;

    @ObfuscatedName("cv.a(IILjava/awt/Component;B)V")
    public final void method1603(int arg0, int arg1, Component arg2) {
        this.field1395 = arg0;
        this.field1396 = arg1;
        this.field1394 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1394, this.field1394.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1395, this.field1396), var4, (Point) null);
        this.field1397 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1428 = arg2;
        this.method1670();
    }

    @ObfuscatedName("cv.w(Ljava/awt/Graphics;IIB)V")
    public final void method1604(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1397, arg1, arg2, this.field1428);
    }

    @ObfuscatedName("cv.d(Ljava/awt/Graphics;IIIII)V")
    public final void method1607(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1397, 0, 0, this.field1428);
        arg0.setClip(var6);
    }
}
