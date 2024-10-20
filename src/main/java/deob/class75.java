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

@ObfuscatedName("ba")
public final class class75 extends class71 {

    @ObfuscatedName("ba.t")
    public Component field1324;

    @ObfuscatedName("ba.t(IILjava/awt/Component;B)V")
    public final void method1359(int arg0, int arg1, Component arg2) {
        this.field1296 = arg0;
        this.field1288 = arg1;
        this.field1292 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1292, this.field1292.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1296, this.field1288), var4, (Point) null);
        this.field1289 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1324 = arg2;
        this.method1400();
    }

    @ObfuscatedName("ba.o(Ljava/awt/Graphics;IIB)V")
    public final void method1363(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1289, arg1, arg2, this.field1324);
    }

    @ObfuscatedName("ba.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1289, 0, 0, this.field1324);
        arg0.setClip(var6);
    }
}
