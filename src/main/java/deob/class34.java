package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("av")
public final class class34 extends class474 {

    @ObfuscatedName("av.a")
    public Component field186;

    @ObfuscatedName("av.f")
    public Image field187;

    public class34(int arg0, int arg1, Component arg2) {
        this.field4943 = arg0;
        this.field4941 = arg1;
        this.field4942 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4942, this.field4942.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4943, this.field4941), var4, (Point) null);
        this.field187 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method483(arg2);
        this.method8094();
    }

    @ObfuscatedName("av.a(Ljava/awt/Component;I)V")
    public final void method483(Component arg0) {
        this.field186 = arg0;
    }

    @ObfuscatedName("av.f(IIS)V")
    public final void method476(int arg0, int arg1) {
        this.method478(this.field186.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("av.c(IIIII)V")
    public final void method477(int arg0, int arg1, int arg2, int arg3) {
        this.method479(this.field186.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("av.x(Ljava/awt/Graphics;III)V")
    public final void method478(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field187, arg1, arg2, this.field186);
        } catch (Exception var5) {
            this.field186.repaint();
        }
    }

    @ObfuscatedName("av.h(Ljava/awt/Graphics;IIIII)V")
    public final void method479(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field187, 0, 0, this.field186);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field186.repaint();
        }
    }
}
