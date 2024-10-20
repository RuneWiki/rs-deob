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

@ObfuscatedName("hc")
public final class class219 extends class221 {

    @ObfuscatedName("hc.x")
    public Component field3187;

    @ObfuscatedName("hc.x(IILjava/awt/Component;I)V")
    public final void method3764(int arg0, int arg1, Component arg2) {
        this.field3195 = arg0;
        this.field3197 = arg1;
        this.field3196 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3196, this.field3196.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3195, this.field3197), var4, (Point) null);
        this.field3198 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3187 = arg2;
        this.method3852();
    }

    @ObfuscatedName("hc.j(Ljava/awt/Graphics;IIB)V")
    public final void method3765(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3198, arg1, arg2, this.field3187);
    }

    @ObfuscatedName("hc.c(Ljava/awt/Graphics;IIIII)V")
    public final void method3773(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3198, 0, 0, this.field3187);
        arg0.setClip(var6);
    }
}
