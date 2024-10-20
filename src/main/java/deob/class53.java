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

@ObfuscatedName("bq")
public final class class53 extends class323 {

    @ObfuscatedName("bq.c")
    public Component field442;

    @ObfuscatedName("bq.t")
    public Image field441;

    public class53(int arg0, int arg1, Component arg2) {
        this.field3852 = arg0;
        this.field3851 = arg1;
        this.field3853 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3853, this.field3853.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3852, this.field3851), var4, (Point) null);
        this.field441 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method757(arg2);
        this.method5656();
    }

    @ObfuscatedName("bq.c(Ljava/awt/Component;I)V")
    public final void method757(Component arg0) {
        this.field442 = arg0;
    }

    @ObfuscatedName("bq.t(III)V")
    public final void method759(int arg0, int arg1) {
        this.method765(this.field442.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bq.o(IIIII)V")
    public final void method760(int arg0, int arg1, int arg2, int arg3) {
        this.method762(this.field442.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bq.e(Ljava/awt/Graphics;III)V")
    public final void method765(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field441, arg1, arg2, this.field442);
        } catch (Exception var5) {
            this.field442.repaint();
        }
    }

    @ObfuscatedName("bq.i(Ljava/awt/Graphics;IIIII)V")
    public final void method762(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field441, 0, 0, this.field442);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field442.repaint();
        }
    }
}
