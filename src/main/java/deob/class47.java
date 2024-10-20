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

@ObfuscatedName("ad")
public final class class47 extends class316 {

    @ObfuscatedName("ad.z")
    public Component field385;

    @ObfuscatedName("ad.w")
    public Image field384;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3768 = arg0;
        this.field3770 = arg1;
        this.field3769 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3769, this.field3769.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3768, this.field3770), var4, (Point) null);
        this.field384 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method672(arg2);
        this.method5375();
    }

    @ObfuscatedName("ad.z(Ljava/awt/Component;B)V")
    public final void method672(Component arg0) {
        this.field385 = arg0;
    }

    @ObfuscatedName("ad.w(III)V")
    public final void method673(int arg0, int arg1) {
        this.method675(this.field385.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ad.s(IIIII)V")
    public final void method671(int arg0, int arg1, int arg2, int arg3) {
        this.method676(this.field385.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ad.l(Ljava/awt/Graphics;III)V")
    public final void method675(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field384, arg1, arg2, this.field385);
        } catch (Exception var5) {
            this.field385.repaint();
        }
    }

    @ObfuscatedName("ad.u(Ljava/awt/Graphics;IIIIB)V")
    public final void method676(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field384, 0, 0, this.field385);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field385.repaint();
        }
    }
}
