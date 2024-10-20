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

@ObfuscatedName("ba")
public final class class53 extends class322 {

    @ObfuscatedName("ba.a")
    public Component field419;

    @ObfuscatedName("ba.t")
    public Image field418;

    public class53(int arg0, int arg1, Component arg2) {
        this.field3843 = arg0;
        this.field3841 = arg1;
        this.field3847 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3847, this.field3847.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3843, this.field3841), var4, (Point) null);
        this.field418 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method808(arg2);
        this.method5649();
    }

    @ObfuscatedName("ba.a(Ljava/awt/Component;I)V")
    public final void method808(Component arg0) {
        this.field419 = arg0;
    }

    @ObfuscatedName("ba.t(IIB)V")
    public final void method804(int arg0, int arg1) {
        this.method806(this.field419.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ba.n(IIIII)V")
    public final void method805(int arg0, int arg1, int arg2, int arg3) {
        this.method807(this.field419.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.q(Ljava/awt/Graphics;III)V")
    public final void method806(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field418, arg1, arg2, this.field419);
        } catch (Exception var5) {
            this.field419.repaint();
        }
    }

    @ObfuscatedName("ba.v(Ljava/awt/Graphics;IIIII)V")
    public final void method807(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field418, 0, 0, this.field419);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field419.repaint();
        }
    }
}
