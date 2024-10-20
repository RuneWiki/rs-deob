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

@ObfuscatedName("hw")
public final class class219 extends class221 {

    @ObfuscatedName("hw.x")
    public Component field3190;

    @ObfuscatedName("hw.x(IILjava/awt/Component;I)V")
    public final void method3787(int arg0, int arg1, Component arg2) {
        this.field3199 = arg0;
        this.field3201 = arg1;
        this.field3202 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3202, this.field3202.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3199, this.field3201), var4, (Point) null);
        this.field3198 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3190 = arg2;
        this.method3882();
    }

    @ObfuscatedName("hw.n(Ljava/awt/Graphics;III)V")
    public final void method3795(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3198, arg1, arg2, this.field3190);
    }

    @ObfuscatedName("hw.g(Ljava/awt/Graphics;IIIII)V")
    public final void method3788(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3198, 0, 0, this.field3190);
        arg0.setClip(var6);
    }
}
