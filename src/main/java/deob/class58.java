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

@ObfuscatedName("bh")
public final class class58 extends class307 {

    @ObfuscatedName("bh.s")
    public Component field646;

    @ObfuscatedName("bh.g")
    public Image field645;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3879 = arg0;
        this.field3880 = arg1;
        this.field3878 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3878, this.field3878.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3879, this.field3880), var4, (Point) null);
        this.field645 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method695(arg2);
        this.method5267();
    }

    @ObfuscatedName("bh.s(Ljava/awt/Component;I)V")
    public final void method695(Component arg0) {
        this.field646 = arg0;
    }

    @ObfuscatedName("bh.g(III)V")
    public final void method698(int arg0, int arg1) {
        this.method702(this.field646.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bh.m(IIIII)V")
    public final void method697(int arg0, int arg1, int arg2, int arg3) {
        this.method699(this.field646.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bh.h(Ljava/awt/Graphics;III)V")
    public final void method702(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field645, arg1, arg2, this.field646);
        } catch (Exception var5) {
            this.field646.repaint();
        }
    }

    @ObfuscatedName("bh.i(Ljava/awt/Graphics;IIIIB)V")
    public final void method699(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field645, 0, 0, this.field646);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field646.repaint();
        }
    }
}
