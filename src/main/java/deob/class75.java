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

@ObfuscatedName("bs")
public final class class75 extends class71 {

    @ObfuscatedName("bs.t")
    public Component field1314;

    @ObfuscatedName("bs.t(IILjava/awt/Component;B)V")
    public final void method1352(int arg0, int arg1, Component arg2) {
        this.field1286 = arg0;
        this.field1282 = arg1;
        this.field1281 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1281, this.field1281.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1286, this.field1282), var4, (Point) null);
        this.field1280 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1314 = arg2;
        this.method1391();
    }

    @ObfuscatedName("bs.s(Ljava/awt/Graphics;IIB)V")
    public final void method1330(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1280, arg1, arg2, this.field1314);
    }

    @ObfuscatedName("bs.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1345(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1280, 0, 0, this.field1314);
        arg0.setClip(var6);
    }
}
