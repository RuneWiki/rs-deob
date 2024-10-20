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
public final class class62 extends class332 {

    @ObfuscatedName("bq.m")
    public Component field461;

    @ObfuscatedName("bq.o")
    public Image field462;

    public class62(int arg0, int arg1, Component arg2) {
        this.field3878 = arg0;
        this.field3877 = arg1;
        this.field3879 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3879, this.field3879.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3878, this.field3877), var4, (Point) null);
        this.field462 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method808(arg2);
        this.method5760();
    }

    @ObfuscatedName("bq.m(Ljava/awt/Component;B)V")
    public final void method808(Component arg0) {
        this.field461 = arg0;
    }

    @ObfuscatedName("bq.o(IIB)V")
    public final void method807(int arg0, int arg1) {
        this.method809(this.field461.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bq.q(IIIII)V")
    public final void method811(int arg0, int arg1, int arg2, int arg3) {
        this.method810(this.field461.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bq.j(Ljava/awt/Graphics;III)V")
    public final void method809(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field462, arg1, arg2, this.field461);
        } catch (Exception var5) {
            this.field461.repaint();
        }
    }

    @ObfuscatedName("bq.p(Ljava/awt/Graphics;IIIII)V")
    public final void method810(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field462, 0, 0, this.field461);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field461.repaint();
        }
    }
}
