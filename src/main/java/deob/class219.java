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

@ObfuscatedName("hf")
public final class class219 extends class221 {

    @ObfuscatedName("hf.s")
    public Component field3174;

    @ObfuscatedName("hf.s(IILjava/awt/Component;I)V")
    public final void method3626(int arg0, int arg1, Component arg2) {
        this.field3183 = arg0;
        this.field3184 = arg1;
        this.field3182 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3182, this.field3182.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3183, this.field3184), var4, (Point) null);
        this.field3185 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3174 = arg2;
        this.method3695();
    }

    @ObfuscatedName("hf.c(Ljava/awt/Graphics;IIS)V")
    public final void method3625(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3185, arg1, arg2, this.field3174);
    }

    @ObfuscatedName("hf.f(Ljava/awt/Graphics;IIIII)V")
    public final void method3628(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3185, 0, 0, this.field3174);
        arg0.setClip(var6);
    }
}
