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

@ObfuscatedName("bc")
public final class class75 extends class71 {

    @ObfuscatedName("bc.b")
    public Component field1320;

    @ObfuscatedName("bc.b(IILjava/awt/Component;S)V")
    public final void method1342(int arg0, int arg1, Component arg2) {
        this.field1288 = arg0;
        this.field1286 = arg1;
        this.field1291 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1291, this.field1291.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1288, this.field1286), var4, (Point) null);
        this.field1287 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1320 = arg2;
        this.method1420();
    }

    @ObfuscatedName("bc.u(Ljava/awt/Graphics;III)V")
    public final void method1346(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1287, arg1, arg2, this.field1320);
    }

    @ObfuscatedName("bc.x(Ljava/awt/Graphics;IIIII)V")
    public final void method1344(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1287, 0, 0, this.field1320);
        arg0.setClip(var6);
    }
}
