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

@ObfuscatedName("bm")
public final class class59 extends class329 {

    @ObfuscatedName("bm.t")
    public Component field641;

    @ObfuscatedName("bm.q")
    public Image field642;

    public class59(int arg0, int arg1, Component arg2) {
        this.field3965 = arg0;
        this.field3966 = arg1;
        this.field3967 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3967, this.field3967.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3965, this.field3966), var4, (Point) null);
        this.field642 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method778(arg2);
        this.method5356();
    }

    @ObfuscatedName("bm.t(Ljava/awt/Component;S)V")
    public final void method778(Component arg0) {
        this.field641 = arg0;
    }

    @ObfuscatedName("bm.q(III)V")
    public final void method780(int arg0, int arg1) {
        this.method782(this.field641.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bm.i(IIIII)V")
    public final void method793(int arg0, int arg1, int arg2, int arg3) {
        this.method781(this.field641.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bm.a(Ljava/awt/Graphics;IIS)V")
    public final void method782(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field642, arg1, arg2, this.field641);
        } catch (Exception var5) {
            this.field641.repaint();
        }
    }

    @ObfuscatedName("bm.l(Ljava/awt/Graphics;IIIIB)V")
    public final void method781(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field642, 0, 0, this.field641);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field641.repaint();
        }
    }
}
