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

@ObfuscatedName("cg")
public final class class82 extends class78 {

    @ObfuscatedName("cg.j")
    public Component field1438;

    @ObfuscatedName("cg.j(IILjava/awt/Component;B)V")
    public final void method1507(int arg0, int arg1, Component arg2) {
        this.field1401 = arg0;
        this.field1402 = arg1;
        this.field1403 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1403, this.field1403.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1401, this.field1402), var4, (Point) null);
        this.field1400 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1438 = arg2;
        this.method1565();
    }

    @ObfuscatedName("cg.l(Ljava/awt/Graphics;III)V")
    public final void method1518(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1400, arg1, arg2, this.field1438);
    }

    @ObfuscatedName("cg.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1508(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1400, 0, 0, this.field1438);
        arg0.setClip(var6);
    }
}
