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

@ObfuscatedName("bv")
public final class class62 extends class333 {

    @ObfuscatedName("bv.n")
    public Component field457;

    @ObfuscatedName("bv.v")
    public Image field458;

    public class62(int arg0, int arg1, Component arg2) {
        this.field3894 = arg0;
        this.field3892 = arg1;
        this.field3893 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3893, this.field3893.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3894, this.field3892), var4, (Point) null);
        this.field458 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method844(arg2);
        this.method5800();
    }

    @ObfuscatedName("bv.n(Ljava/awt/Component;I)V")
    public final void method844(Component arg0) {
        this.field457 = arg0;
    }

    @ObfuscatedName("bv.v(III)V")
    public final void method838(int arg0, int arg1) {
        this.method841(this.field457.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bv.d(IIIII)V")
    public final void method839(int arg0, int arg1, int arg2, int arg3) {
        this.method840(this.field457.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bv.c(Ljava/awt/Graphics;III)V")
    public final void method841(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field458, arg1, arg2, this.field457);
        } catch (Exception var5) {
            this.field457.repaint();
        }
    }

    @ObfuscatedName("bv.y(Ljava/awt/Graphics;IIIII)V")
    public final void method840(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field458, 0, 0, this.field457);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field457.repaint();
        }
    }
}
