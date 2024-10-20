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

@ObfuscatedName("ab")
public final class class52 extends class322 {

    @ObfuscatedName("ab.f")
    public Component field418;

    @ObfuscatedName("ab.i")
    public Image field417;

    public class52(int arg0, int arg1, Component arg2) {
        this.field3848 = arg0;
        this.field3849 = arg1;
        this.field3847 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3847, this.field3847.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3848, this.field3849), var4, (Point) null);
        this.field417 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method768(arg2);
        this.method5616();
    }

    @ObfuscatedName("ab.f(Ljava/awt/Component;B)V")
    public final void method768(Component arg0) {
        this.field418 = arg0;
    }

    @ObfuscatedName("ab.i(III)V")
    public final void method763(int arg0, int arg1) {
        this.method762(this.field418.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ab.y(IIIIB)V")
    public final void method760(int arg0, int arg1, int arg2, int arg3) {
        this.method764(this.field418.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ab.w(Ljava/awt/Graphics;III)V")
    public final void method762(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field417, arg1, arg2, this.field418);
        } catch (Exception var5) {
            this.field418.repaint();
        }
    }

    @ObfuscatedName("ab.p(Ljava/awt/Graphics;IIIII)V")
    public final void method764(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field417, 0, 0, this.field418);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field418.repaint();
        }
    }
}
