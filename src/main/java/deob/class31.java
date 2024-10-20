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

@ObfuscatedName("aw")
public final class class31 extends class410 {

    @ObfuscatedName("aw.n")
    public Component field182;

    @ObfuscatedName("aw.c")
    public Image field183;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4350 = arg0;
        this.field4352 = arg1;
        this.field4351 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4351, this.field4351.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4350, this.field4352), var4, (Point) null);
        this.field183 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method420(arg2);
        this.method6584();
    }

    @ObfuscatedName("aw.n(Ljava/awt/Component;I)V")
    public final void method420(Component arg0) {
        this.field182 = arg0;
    }

    @ObfuscatedName("aw.c(III)V")
    public final void method421(int arg0, int arg1) {
        this.method423(this.field182.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("aw.m(IIIII)V")
    public final void method422(int arg0, int arg1, int arg2, int arg3) {
        this.method424(this.field182.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aw.k(Ljava/awt/Graphics;III)V")
    public final void method423(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field183, arg1, arg2, this.field182);
        } catch (Exception var5) {
            this.field182.repaint();
        }
    }

    @ObfuscatedName("aw.o(Ljava/awt/Graphics;IIIII)V")
    public final void method424(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field183, 0, 0, this.field182);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field182.repaint();
        }
    }
}
