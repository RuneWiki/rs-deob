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

@ObfuscatedName("hr")
public final class class219 extends class221 {

    @ObfuscatedName("hr.k")
    public Component field3169;

    @ObfuscatedName("hr.k(IILjava/awt/Component;B)V")
    public final void method3738(int arg0, int arg1, Component arg2) {
        this.field3178 = arg0;
        this.field3179 = arg1;
        this.field3180 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3180, this.field3180.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3178, this.field3179), var4, (Point) null);
        this.field3177 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3169 = arg2;
        this.method3819();
    }

    @ObfuscatedName("hr.y(Ljava/awt/Graphics;IIB)V")
    public final void method3739(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3177, arg1, arg2, this.field3169);
    }

    @ObfuscatedName("hr.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method3740(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3177, 0, 0, this.field3169);
        arg0.setClip(var6);
    }
}
