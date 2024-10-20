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

@ObfuscatedName("bx")
public final class class53 extends class322 {

    @ObfuscatedName("bx.z")
    public Component field418;

    @ObfuscatedName("bx.n")
    public Image field419;

    public class53(int arg0, int arg1, Component arg2) {
        this.field3853 = arg0;
        this.field3854 = arg1;
        this.field3855 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3855, this.field3855.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3853, this.field3854), var4, (Point) null);
        this.field419 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method777(arg2);
        this.method5508();
    }

    @ObfuscatedName("bx.z(Ljava/awt/Component;I)V")
    public final void method777(Component arg0) {
        this.field418 = arg0;
    }

    @ObfuscatedName("bx.n(III)V")
    public final void method768(int arg0, int arg1) {
        this.method770(this.field418.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bx.v(IIIII)V")
    public final void method767(int arg0, int arg1, int arg2, int arg3) {
        this.method769(this.field418.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bx.u(Ljava/awt/Graphics;IIB)V")
    public final void method770(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field419, arg1, arg2, this.field418);
        } catch (Exception var5) {
            this.field418.repaint();
        }
    }

    @ObfuscatedName("bx.r(Ljava/awt/Graphics;IIIII)V")
    public final void method769(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field419, 0, 0, this.field418);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field418.repaint();
        }
    }
}
