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

@ObfuscatedName("bg")
public final class class76 extends class72 {

    @ObfuscatedName("bg.v")
    public Component field1325;

    @ObfuscatedName("bg.v(IILjava/awt/Component;B)V")
    public final void method1378(int arg0, int arg1, Component arg2) {
        this.field1290 = arg0;
        this.field1293 = arg1;
        this.field1295 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1295, this.field1295.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1290, this.field1293), var4, (Point) null);
        this.field1292 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1325 = arg2;
        this.method1414();
    }

    @ObfuscatedName("bg.t(Ljava/awt/Graphics;IIS)V")
    public final void method1346(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1292, arg1, arg2, this.field1325);
    }

    @ObfuscatedName("bg.f(Ljava/awt/Graphics;IIIII)V")
    public final void method1347(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1292, 0, 0, this.field1325);
        arg0.setClip(var6);
    }
}
