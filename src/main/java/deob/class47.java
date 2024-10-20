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

@ObfuscatedName("af")
public final class class47 extends class321 {

    @ObfuscatedName("af.y")
    public Component field417;

    @ObfuscatedName("af.c")
    public Image field418;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3827 = arg0;
        this.field3829 = arg1;
        this.field3828 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3828, this.field3828.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3827, this.field3829), var4, (Point) null);
        this.field418 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method716(arg2);
        this.method5446();
    }

    @ObfuscatedName("af.y(Ljava/awt/Component;I)V")
    public final void method716(Component arg0) {
        this.field417 = arg0;
    }

    @ObfuscatedName("af.c(III)V")
    public final void method712(int arg0, int arg1) {
        this.method714(this.field417.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("af.n(IIIIB)V")
    public final void method713(int arg0, int arg1, int arg2, int arg3) {
        this.method715(this.field417.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("af.u(Ljava/awt/Graphics;IIS)V")
    public final void method714(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field418, arg1, arg2, this.field417);
        } catch (Exception var5) {
            this.field417.repaint();
        }
    }

    @ObfuscatedName("af.i(Ljava/awt/Graphics;IIIIB)V")
    public final void method715(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field418, 0, 0, this.field417);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field417.repaint();
        }
    }
}
