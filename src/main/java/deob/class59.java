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

@ObfuscatedName("bz")
public final class class59 extends class329 {

    @ObfuscatedName("bz.d")
    public Component field676;

    @ObfuscatedName("bz.z")
    public Image field675;

    public class59(int arg0, int arg1, Component arg2) {
        this.field3961 = arg0;
        this.field3959 = arg1;
        this.field3962 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3962, this.field3962.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3961, this.field3959), var4, (Point) null);
        this.field675 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method732(arg2);
        this.method5416();
    }

    @ObfuscatedName("bz.d(Ljava/awt/Component;B)V")
    public final void method732(Component arg0) {
        this.field676 = arg0;
    }

    @ObfuscatedName("bz.z(III)V")
    public final void method733(int arg0, int arg1) {
        this.method735(this.field676.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bz.n(IIIIS)V")
    public final void method734(int arg0, int arg1, int arg2, int arg3) {
        this.method747(this.field676.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bz.r(Ljava/awt/Graphics;III)V")
    public final void method735(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field675, arg1, arg2, this.field676);
        } catch (Exception var5) {
            this.field676.repaint();
        }
    }

    @ObfuscatedName("bz.e(Ljava/awt/Graphics;IIIIB)V")
    public final void method747(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field675, 0, 0, this.field676);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field676.repaint();
        }
    }
}
