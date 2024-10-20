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

@ObfuscatedName("bf")
public final class class58 extends class283 {

    @ObfuscatedName("bf.n")
    public Component field674;

    @ObfuscatedName("bf.p")
    public Image field675;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3761 = arg0;
        this.field3760 = arg1;
        this.field3762 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3762, this.field3762.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3761, this.field3760), var4, (Point) null);
        this.field675 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method726(arg2);
        this.method4732();
    }

    @ObfuscatedName("bf.n(Ljava/awt/Component;B)V")
    public final void method726(Component arg0) {
        this.field674 = arg0;
    }

    @ObfuscatedName("bf.p(III)V")
    public final void method727(int arg0, int arg1) {
        this.method729(this.field674.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bf.i(IIIII)V")
    public final void method740(int arg0, int arg1, int arg2, int arg3) {
        this.method730(this.field674.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bf.j(Ljava/awt/Graphics;IIB)V")
    public final void method729(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field675, arg1, arg2, this.field674);
        } catch (Exception var5) {
            this.field674.repaint();
        }
    }

    @ObfuscatedName("bf.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method730(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field675, 0, 0, this.field674);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field674.repaint();
        }
    }
}
