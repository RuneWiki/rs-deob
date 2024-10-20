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

@ObfuscatedName("bq")
public final class class58 extends class296 {

    @ObfuscatedName("bq.a")
    public Component field630;

    @ObfuscatedName("bq.w")
    public Image field629;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3834 = arg0;
        this.field3836 = arg1;
        this.field3835 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3835, this.field3835.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3834, this.field3836), var4, (Point) null);
        this.field629 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method694(arg2);
        this.method4776();
    }

    @ObfuscatedName("bq.a(Ljava/awt/Component;I)V")
    public final void method694(Component arg0) {
        this.field630 = arg0;
    }

    @ObfuscatedName("bq.w(III)V")
    public final void method693(int arg0, int arg1) {
        this.method697(this.field630.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bq.e(IIIIB)V")
    public final void method696(int arg0, int arg1, int arg2, int arg3) {
        this.method698(this.field630.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bq.k(Ljava/awt/Graphics;III)V")
    public final void method697(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field629, arg1, arg2, this.field630);
        } catch (Exception var5) {
            this.field630.repaint();
        }
    }

    @ObfuscatedName("bq.u(Ljava/awt/Graphics;IIIII)V")
    public final void method698(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field629, 0, 0, this.field630);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field630.repaint();
        }
    }
}
