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
public final class class58 extends class283 {

    @ObfuscatedName("ba.p")
    public Component field690;

    @ObfuscatedName("ba.m")
    public Image field691;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3761 = arg0;
        this.field3762 = arg1;
        this.field3763 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3763, this.field3763.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3761, this.field3762), var4, (Point) null);
        this.field691 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method707(arg2);
        this.method4577();
    }

    @ObfuscatedName("ba.p(Ljava/awt/Component;I)V")
    public final void method707(Component arg0) {
        this.field690 = arg0;
    }

    @ObfuscatedName("ba.m(III)V")
    public final void method708(int arg0, int arg1) {
        this.method710(this.field690.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ba.e(IIIIB)V")
    public final void method709(int arg0, int arg1, int arg2, int arg3) {
        this.method711(this.field690.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.t(Ljava/awt/Graphics;IIB)V")
    public final void method710(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field691, arg1, arg2, this.field690);
        } catch (Exception var5) {
            this.field690.repaint();
        }
    }

    @ObfuscatedName("ba.w(Ljava/awt/Graphics;IIIIS)V")
    public final void method711(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field691, 0, 0, this.field690);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field690.repaint();
        }
    }
}
