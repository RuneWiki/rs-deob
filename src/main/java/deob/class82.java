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

@ObfuscatedName("cp")
public final class class82 extends class78 {

    @ObfuscatedName("cp.h")
    public Component field1429;

    @ObfuscatedName("cp.h(IILjava/awt/Component;B)V")
    public final void method1519(int arg0, int arg1, Component arg2) {
        this.field1396 = arg0;
        this.field1399 = arg1;
        this.field1398 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1398, this.field1398.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1396, this.field1399), var4, (Point) null);
        this.field1397 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1429 = arg2;
        this.method1593();
    }

    @ObfuscatedName("cp.q(Ljava/awt/Graphics;III)V")
    public final void method1520(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1397, arg1, arg2, this.field1429);
    }

    @ObfuscatedName("cp.v(Ljava/awt/Graphics;IIIII)V")
    public final void method1556(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1397, 0, 0, this.field1429);
        arg0.setClip(var6);
    }
}
