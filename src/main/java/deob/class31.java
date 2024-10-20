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

@ObfuscatedName("ax")
public final class class31 extends class429 {

    @ObfuscatedName("ax.c")
    public Component field179;

    @ObfuscatedName("ax.b")
    public Image field180;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4551 = arg0;
        this.field4550 = arg1;
        this.field4548 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4548, this.field4548.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4551, this.field4550), var4, (Point) null);
        this.field180 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method450(arg2);
        this.method7010();
    }

    @ObfuscatedName("ax.c(Ljava/awt/Component;I)V")
    public final void method450(Component arg0) {
        this.field179 = arg0;
    }

    @ObfuscatedName("ax.b(IIB)V")
    public final void method452(int arg0, int arg1) {
        this.method445(this.field179.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ax.p(IIIII)V")
    public final void method444(int arg0, int arg1, int arg2, int arg3) {
        this.method446(this.field179.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ax.m(Ljava/awt/Graphics;III)V")
    public final void method445(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field180, arg1, arg2, this.field179);
        } catch (Exception var5) {
            this.field179.repaint();
        }
    }

    @ObfuscatedName("ax.t(Ljava/awt/Graphics;IIIII)V")
    public final void method446(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field180, 0, 0, this.field179);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field179.repaint();
        }
    }
}
