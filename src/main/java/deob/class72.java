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

@ObfuscatedName("bk")
public final class class72 extends class68 {

    @ObfuscatedName("bk.z")
    public Component field1293;

    @ObfuscatedName("bk.z(IILjava/awt/Component;B)V")
    public final void method1346(int arg0, int arg1, Component arg2) {
        this.field1260 = arg0;
        this.field1259 = arg1;
        this.field1262 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1262, this.field1262.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1260, this.field1259), var4, (Point) null);
        this.field1261 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1293 = arg2;
        this.method1417();
    }

    @ObfuscatedName("bk.n(Ljava/awt/Graphics;IIS)V")
    public final void method1347(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1261, arg1, arg2, this.field1293);
    }

    @ObfuscatedName("bk.u(Ljava/awt/Graphics;IIIII)V")
    public final void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1261, 0, 0, this.field1293);
        arg0.setClip(var6);
    }
}
