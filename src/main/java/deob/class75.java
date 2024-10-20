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

@ObfuscatedName("bi")
public final class class75 extends class71 {

    @ObfuscatedName("bi.g")
    public Component field1322;

    @ObfuscatedName("bi.g(IILjava/awt/Component;I)V")
    public final void method1385(int arg0, int arg1, Component arg2) {
        this.field1294 = arg0;
        this.field1288 = arg1;
        this.field1287 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1287, this.field1287.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1294, this.field1288), var4, (Point) null);
        this.field1289 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1322 = arg2;
        this.method1432();
    }

    @ObfuscatedName("bi.v(Ljava/awt/Graphics;III)V")
    public final void method1360(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1289, arg1, arg2, this.field1322);
    }

    @ObfuscatedName("bi.z(Ljava/awt/Graphics;IIIII)V")
    public final void method1361(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1289, 0, 0, this.field1322);
        arg0.setClip(var6);
    }
}
