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

@ObfuscatedName("bp")
public final class class58 extends class284 {

    @ObfuscatedName("bp.w")
    public Component field704;

    @ObfuscatedName("bp.s")
    public Image field703;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3776 = arg0;
        this.field3777 = arg1;
        this.field3778 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3778, this.field3778.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3776, this.field3777), var4, (Point) null);
        this.field703 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method732(arg2);
        this.method4780();
    }

    @ObfuscatedName("bp.w(Ljava/awt/Component;I)V")
    public final void method732(Component arg0) {
        this.field704 = arg0;
    }

    @ObfuscatedName("bp.s(III)V")
    public final void method738(int arg0, int arg1) {
        this.method744(this.field704.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bp.q(IIIII)V")
    public final void method742(int arg0, int arg1, int arg2, int arg3) {
        this.method735(this.field704.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bp.o(Ljava/awt/Graphics;III)V")
    public final void method744(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field703, arg1, arg2, this.field704);
        } catch (Exception var5) {
            this.field704.repaint();
        }
    }

    @ObfuscatedName("bp.g(Ljava/awt/Graphics;IIIIB)V")
    public final void method735(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field703, 0, 0, this.field704);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field704.repaint();
        }
    }
}
