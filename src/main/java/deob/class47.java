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

@ObfuscatedName("ae")
public final class class47 extends class319 {

    @ObfuscatedName("ae.v")
    public Component field412;

    @ObfuscatedName("ae.s")
    public Image field411;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3805 = arg0;
        this.field3807 = arg1;
        this.field3806 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3806, this.field3806.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3805, this.field3807), var4, (Point) null);
        this.field411 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method701(arg2);
        this.method5461();
    }

    @ObfuscatedName("ae.v(Ljava/awt/Component;I)V")
    public final void method701(Component arg0) {
        this.field412 = arg0;
    }

    @ObfuscatedName("ae.s(IIB)V")
    public final void method700(int arg0, int arg1) {
        this.method704(this.field412.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ae.o(IIIIB)V")
    public final void method703(int arg0, int arg1, int arg2, int arg3) {
        this.method705(this.field412.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ae.k(Ljava/awt/Graphics;III)V")
    public final void method704(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field411, arg1, arg2, this.field412);
        } catch (Exception var5) {
            this.field412.repaint();
        }
    }

    @ObfuscatedName("ae.u(Ljava/awt/Graphics;IIIII)V")
    public final void method705(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field411, 0, 0, this.field412);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field412.repaint();
        }
    }
}
