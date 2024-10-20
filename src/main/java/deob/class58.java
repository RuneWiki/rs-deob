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

@ObfuscatedName("bj")
public final class class58 extends class292 {

    @ObfuscatedName("bj.m")
    public Component field657;

    @ObfuscatedName("bj.p")
    public Image field658;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3821 = arg0;
        this.field3820 = arg1;
        this.field3822 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3822, this.field3822.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3821, this.field3820), var4, (Point) null);
        this.field658 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method775(arg2);
        this.method4856();
    }

    @ObfuscatedName("bj.m(Ljava/awt/Component;I)V")
    public final void method775(Component arg0) {
        this.field657 = arg0;
    }

    @ObfuscatedName("bj.p(IIB)V")
    public final void method776(int arg0, int arg1) {
        this.method787(this.field657.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bj.i(IIIIB)V")
    public final void method777(int arg0, int arg1, int arg2, int arg3) {
        this.method783(this.field657.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bj.j(Ljava/awt/Graphics;IIB)V")
    public final void method787(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field658, arg1, arg2, this.field657);
        } catch (Exception var5) {
            this.field657.repaint();
        }
    }

    @ObfuscatedName("bj.v(Ljava/awt/Graphics;IIIIB)V")
    public final void method783(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field658, 0, 0, this.field657);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field657.repaint();
        }
    }
}
