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
public final class class75 extends class71 {

    @ObfuscatedName("br.e")
    public Component field1325;

    @ObfuscatedName("br.e(IILjava/awt/Component;I)V")
    public final void method1330(int arg0, int arg1, Component arg2) {
        this.field1289 = arg0;
        this.field1290 = arg1;
        this.field1294 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1294, this.field1294.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1289, this.field1290), var4, (Point) null);
        this.field1291 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1325 = arg2;
        this.method1401();
    }

    @ObfuscatedName("br.v(Ljava/awt/Graphics;IIB)V")
    public final void method1339(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1291, arg1, arg2, this.field1325);
    }

    @ObfuscatedName("br.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1354(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1291, 0, 0, this.field1325);
        arg0.setClip(var6);
    }
}
