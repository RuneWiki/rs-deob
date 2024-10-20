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
public final class class53 extends class323 {

    @ObfuscatedName("bp.q")
    public Component field440;

    @ObfuscatedName("bp.w")
    public Image field441;

    public class53(int arg0, int arg1, Component arg2) {
        this.field3878 = arg0;
        this.field3879 = arg1;
        this.field3877 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3877, this.field3877.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3878, this.field3879), var4, (Point) null);
        this.field441 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method718(arg2);
        this.method5603();
    }

    @ObfuscatedName("bp.q(Ljava/awt/Component;B)V")
    public final void method718(Component arg0) {
        this.field440 = arg0;
    }

    @ObfuscatedName("bp.w(III)V")
    public final void method719(int arg0, int arg1) {
        this.method729(this.field440.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bp.e(IIIII)V")
    public final void method720(int arg0, int arg1, int arg2, int arg3) {
        this.method722(this.field440.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bp.p(Ljava/awt/Graphics;III)V")
    public final void method729(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field441, arg1, arg2, this.field440);
        } catch (Exception var5) {
            this.field440.repaint();
        }
    }

    @ObfuscatedName("bp.k(Ljava/awt/Graphics;IIIII)V")
    public final void method722(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field441, 0, 0, this.field440);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field440.repaint();
        }
    }
}
