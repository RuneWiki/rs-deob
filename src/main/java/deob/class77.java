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

@ObfuscatedName("br")
public final class class77 extends class73 {

    @ObfuscatedName("br.n")
    public Component field1355;

    @ObfuscatedName("br.n(IILjava/awt/Component;I)V")
    public final void method1366(int arg0, int arg1, Component arg2) {
        this.field1321 = arg0;
        this.field1322 = arg1;
        this.field1320 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1320, this.field1320.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1321, this.field1322), var4, (Point) null);
        this.field1324 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1355 = arg2;
        this.method1446();
    }

    @ObfuscatedName("br.w(Ljava/awt/Graphics;IIS)V")
    public final void method1367(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1324, arg1, arg2, this.field1355);
    }

    @ObfuscatedName("br.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1368(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1324, 0, 0, this.field1355);
        arg0.setClip(var6);
    }
}
