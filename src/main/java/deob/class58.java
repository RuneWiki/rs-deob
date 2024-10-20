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

@ObfuscatedName("bl")
public final class class58 extends class283 {

    @ObfuscatedName("bl.c")
    public Component field686;

    @ObfuscatedName("bl.o")
    public Image field685;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3748 = arg0;
        this.field3750 = arg1;
        this.field3749 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3749, this.field3749.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3748, this.field3750), var4, (Point) null);
        this.field685 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method699(arg2);
        this.method4592();
    }

    @ObfuscatedName("bl.c(Ljava/awt/Component;I)V")
    public final void method699(Component arg0) {
        this.field686 = arg0;
    }

    @ObfuscatedName("bl.o(IIB)V")
    public final void method700(int arg0, int arg1) {
        this.method702(this.field686.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bl.i(IIIIB)V")
    public final void method701(int arg0, int arg1, int arg2, int arg3) {
        this.method706(this.field686.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.u(Ljava/awt/Graphics;III)V")
    public final void method702(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field685, arg1, arg2, this.field686);
        } catch (Exception var5) {
            this.field686.repaint();
        }
    }

    @ObfuscatedName("bl.g(Ljava/awt/Graphics;IIIIB)V")
    public final void method706(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field685, 0, 0, this.field686);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field686.repaint();
        }
    }
}
