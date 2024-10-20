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
public final class class59 extends class329 {

    @ObfuscatedName("bh.c")
    public Component field657;

    @ObfuscatedName("bh.i")
    public Image field656;

    public class59(int arg0, int arg1, Component arg2) {
        this.field3961 = arg0;
        this.field3960 = arg1;
        this.field3962 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3962, this.field3962.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3961, this.field3960), var4, (Point) null);
        this.field656 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method756(arg2);
        this.method5408();
    }

    @ObfuscatedName("bh.c(Ljava/awt/Component;I)V")
    public final void method756(Component arg0) {
        this.field657 = arg0;
    }

    @ObfuscatedName("bh.i(III)V")
    public final void method764(int arg0, int arg1) {
        this.method759(this.field657.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bh.o(IIIII)V")
    public final void method758(int arg0, int arg1, int arg2, int arg3) {
        this.method760(this.field657.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bh.j(Ljava/awt/Graphics;III)V")
    public final void method759(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field656, arg1, arg2, this.field657);
        } catch (Exception var5) {
            this.field657.repaint();
        }
    }

    @ObfuscatedName("bh.k(Ljava/awt/Graphics;IIIII)V")
    public final void method760(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field656, 0, 0, this.field657);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field657.repaint();
        }
    }
}
