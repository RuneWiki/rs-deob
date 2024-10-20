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

@ObfuscatedName("bb")
public final class class77 extends class73 {

    @ObfuscatedName("bb.n")
    public Component field1362;

    @ObfuscatedName("bb.n(IILjava/awt/Component;I)V")
    public final void method1418(int arg0, int arg1, Component arg2) {
        this.field1332 = arg0;
        this.field1325 = arg1;
        this.field1333 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1333, this.field1333.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1332, this.field1325), var4, (Point) null);
        this.field1328 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1362 = arg2;
        this.method1493();
    }

    @ObfuscatedName("bb.d(Ljava/awt/Graphics;IIB)V")
    public final void method1419(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1328, arg1, arg2, this.field1362);
    }

    @ObfuscatedName("bb.z(Ljava/awt/Graphics;IIIII)V")
    public final void method1422(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1328, 0, 0, this.field1362);
        arg0.setClip(var6);
    }
}
