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

@ObfuscatedName("bu")
public final class class59 extends class329 {

    @ObfuscatedName("bu.o")
    public Component field677;

    @ObfuscatedName("bu.k")
    public Image field678;

    public class59(int arg0, int arg1, Component arg2) {
        this.field3965 = arg0;
        this.field3963 = arg1;
        this.field3964 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3964, this.field3964.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3965, this.field3963), var4, (Point) null);
        this.field678 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method761(arg2);
        this.method5379();
    }

    @ObfuscatedName("bu.o(Ljava/awt/Component;S)V")
    public final void method761(Component arg0) {
        this.field677 = arg0;
    }

    @ObfuscatedName("bu.k(III)V")
    public final void method762(int arg0, int arg1) {
        this.method764(this.field677.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bu.t(IIIII)V")
    public final void method763(int arg0, int arg1, int arg2, int arg3) {
        this.method765(this.field677.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bu.d(Ljava/awt/Graphics;III)V")
    public final void method764(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field678, arg1, arg2, this.field677);
        } catch (Exception var5) {
            this.field677.repaint();
        }
    }

    @ObfuscatedName("bu.h(Ljava/awt/Graphics;IIIII)V")
    public final void method765(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field678, 0, 0, this.field677);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field677.repaint();
        }
    }
}
