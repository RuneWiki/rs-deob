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

@ObfuscatedName("bg")
public final class class53 extends class322 {

    @ObfuscatedName("bg.c")
    public Component field417;

    @ObfuscatedName("bg.x")
    public Image field416;

    public class53(int arg0, int arg1, Component arg2) {
        this.field3849 = arg0;
        this.field3850 = arg1;
        this.field3848 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3848, this.field3848.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3849, this.field3850), var4, (Point) null);
        this.field416 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method757(arg2);
        this.method5628();
    }

    @ObfuscatedName("bg.c(Ljava/awt/Component;I)V")
    public final void method757(Component arg0) {
        this.field417 = arg0;
    }

    @ObfuscatedName("bg.x(III)V")
    public final void method744(int arg0, int arg1) {
        this.method747(this.field417.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bg.t(IIIII)V")
    public final void method740(int arg0, int arg1, int arg2, int arg3) {
        this.method743(this.field417.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.g(Ljava/awt/Graphics;IIB)V")
    public final void method747(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field416, arg1, arg2, this.field417);
        } catch (Exception var5) {
            this.field417.repaint();
        }
    }

    @ObfuscatedName("bg.l(Ljava/awt/Graphics;IIIII)V")
    public final void method743(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field416, 0, 0, this.field417);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field417.repaint();
        }
    }
}
