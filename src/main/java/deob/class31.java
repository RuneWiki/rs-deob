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

@ObfuscatedName("aq")
public final class class31 extends class455 {

    @ObfuscatedName("aq.c")
    public Component field186;

    @ObfuscatedName("aq.p")
    public Image field185;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4807 = arg0;
        this.field4809 = arg1;
        this.field4808 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4808, this.field4808.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4807, this.field4809), var4, (Point) null);
        this.field185 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method420(arg2);
        this.method7567();
    }

    @ObfuscatedName("aq.c(Ljava/awt/Component;I)V")
    public final void method420(Component arg0) {
        this.field186 = arg0;
    }

    @ObfuscatedName("aq.p(III)V")
    public final void method421(int arg0, int arg1) {
        this.method423(this.field186.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("aq.f(IIIIB)V")
    public final void method422(int arg0, int arg1, int arg2, int arg3) {
        this.method424(this.field186.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aq.n(Ljava/awt/Graphics;III)V")
    public final void method423(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field185, arg1, arg2, this.field186);
        } catch (Exception var5) {
            this.field186.repaint();
        }
    }

    @ObfuscatedName("aq.k(Ljava/awt/Graphics;IIIIB)V")
    public final void method424(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field185, 0, 0, this.field186);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field186.repaint();
        }
    }
}
