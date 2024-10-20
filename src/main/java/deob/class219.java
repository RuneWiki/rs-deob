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

@ObfuscatedName("hj")
public final class class219 extends class221 {

    @ObfuscatedName("hj.n")
    public Component field3165;

    @ObfuscatedName("hj.n(IILjava/awt/Component;B)V")
    public final void method3776(int arg0, int arg1, Component arg2) {
        this.field3176 = arg0;
        this.field3175 = arg1;
        this.field3174 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3174, this.field3174.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3176, this.field3175), var4, (Point) null);
        this.field3173 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3165 = arg2;
        this.method3856();
    }

    @ObfuscatedName("hj.d(Ljava/awt/Graphics;III)V")
    public final void method3777(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3173, arg1, arg2, this.field3165);
    }

    @ObfuscatedName("hj.m(Ljava/awt/Graphics;IIIIB)V")
    public final void method3780(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3173, 0, 0, this.field3165);
        arg0.setClip(var6);
    }
}
