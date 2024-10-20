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
public final class class58 extends class283 {

    @ObfuscatedName("bh.i")
    public Component field697;

    @ObfuscatedName("bh.c")
    public Image field698;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3760 = arg0;
        this.field3762 = arg1;
        this.field3761 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3761, this.field3761.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3760, this.field3762), var4, (Point) null);
        this.field698 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method698(arg2);
        this.method4635();
    }

    @ObfuscatedName("bh.i(Ljava/awt/Component;B)V")
    public final void method698(Component arg0) {
        this.field697 = arg0;
    }

    @ObfuscatedName("bh.c(III)V")
    public final void method703(int arg0, int arg1) {
        this.method697(this.field697.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bh.e(IIIIB)V")
    public final void method700(int arg0, int arg1, int arg2, int arg3) {
        this.method702(this.field697.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bh.v(Ljava/awt/Graphics;IIB)V")
    public final void method697(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field698, arg1, arg2, this.field697);
        } catch (Exception var5) {
            this.field697.repaint();
        }
    }

    @ObfuscatedName("bh.b(Ljava/awt/Graphics;IIIII)V")
    public final void method702(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field698, 0, 0, this.field697);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field697.repaint();
        }
    }
}
