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

@ObfuscatedName("bk")
public final class class53 extends class322 {

    @ObfuscatedName("bk.s")
    public Component field411;

    @ObfuscatedName("bk.j")
    public Image field410;

    public class53(int arg0, int arg1, Component arg2) {
        this.field3855 = arg0;
        this.field3857 = arg1;
        this.field3856 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3856, this.field3856.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3855, this.field3857), var4, (Point) null);
        this.field410 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method725(arg2);
        this.method5561();
    }

    @ObfuscatedName("bk.s(Ljava/awt/Component;B)V")
    public final void method725(Component arg0) {
        this.field411 = arg0;
    }

    @ObfuscatedName("bk.j(III)V")
    public final void method729(int arg0, int arg1) {
        this.method728(this.field411.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bk.i(IIIII)V")
    public final void method727(int arg0, int arg1, int arg2, int arg3) {
        this.method731(this.field411.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bk.k(Ljava/awt/Graphics;III)V")
    public final void method728(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field410, arg1, arg2, this.field411);
        } catch (Exception var5) {
            this.field411.repaint();
        }
    }

    @ObfuscatedName("bk.u(Ljava/awt/Graphics;IIIII)V")
    public final void method731(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field410, 0, 0, this.field411);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field411.repaint();
        }
    }
}
