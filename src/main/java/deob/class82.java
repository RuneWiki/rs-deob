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
public final class class82 extends class78 {

    @ObfuscatedName("cd.k")
    public Component field1397;

    @ObfuscatedName("cd.k(IILjava/awt/Component;I)V")
    public final void method1490(int arg0, int arg1, Component arg2) {
        this.field1362 = arg0;
        this.field1363 = arg1;
        this.field1365 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1365, this.field1365.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1362, this.field1363), var4, (Point) null);
        this.field1364 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1397 = arg2;
        this.method1562();
    }

    @ObfuscatedName("cd.h(Ljava/awt/Graphics;III)V")
    public final void method1525(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1364, arg1, arg2, this.field1397);
    }

    @ObfuscatedName("cd.o(Ljava/awt/Graphics;IIIII)V")
    public final void method1515(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1364, 0, 0, this.field1397);
        arg0.setClip(var6);
    }
}
