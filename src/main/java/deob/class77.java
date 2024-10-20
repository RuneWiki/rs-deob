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

@ObfuscatedName("bu")
public final class class77 extends class73 {

    @ObfuscatedName("bu.b")
    public Component field1358;

    @ObfuscatedName("bu.b(IILjava/awt/Component;I)V")
    public final void method1355(int arg0, int arg1, Component arg2) {
        this.field1324 = arg0;
        this.field1326 = arg1;
        this.field1327 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1327, this.field1327.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1324, this.field1326), var4, (Point) null);
        this.field1330 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1358 = arg2;
        this.method1394();
    }

    @ObfuscatedName("bu.e(Ljava/awt/Graphics;III)V")
    public final void method1346(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1330, arg1, arg2, this.field1358);
    }

    @ObfuscatedName("bu.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1341(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1330, 0, 0, this.field1358);
        arg0.setClip(var6);
    }
}
