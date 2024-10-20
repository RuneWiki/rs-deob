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
public final class class62 extends class332 {

    @ObfuscatedName("bh.x")
    public Component field472;

    @ObfuscatedName("bh.m")
    public Image field471;

    public class62(int arg0, int arg1, Component arg2) {
        this.field3871 = arg0;
        this.field3870 = arg1;
        this.field3873 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3873, this.field3873.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3871, this.field3870), var4, (Point) null);
        this.field471 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method845(arg2);
        this.method5692();
    }

    @ObfuscatedName("bh.x(Ljava/awt/Component;I)V")
    public final void method845(Component arg0) {
        this.field472 = arg0;
    }

    @ObfuscatedName("bh.m(III)V")
    public final void method846(int arg0, int arg1) {
        this.method849(this.field472.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bh.k(IIIIS)V")
    public final void method847(int arg0, int arg1, int arg2, int arg3) {
        this.method853(this.field472.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bh.d(Ljava/awt/Graphics;III)V")
    public final void method849(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field471, arg1, arg2, this.field472);
        } catch (Exception var5) {
            this.field472.repaint();
        }
    }

    @ObfuscatedName("bh.w(Ljava/awt/Graphics;IIIII)V")
    public final void method853(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field471, 0, 0, this.field472);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field472.repaint();
        }
    }
}
