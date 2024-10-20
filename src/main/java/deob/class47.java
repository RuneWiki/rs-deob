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

@ObfuscatedName("av")
public final class class47 extends class321 {

    @ObfuscatedName("av.c")
    public Component field420;

    @ObfuscatedName("av.q")
    public Image field421;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3832 = arg0;
        this.field3834 = arg1;
        this.field3835 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3835, this.field3835.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3832, this.field3834), var4, (Point) null);
        this.field421 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method710(arg2);
        this.method5452();
    }

    @ObfuscatedName("av.c(Ljava/awt/Component;B)V")
    public final void method710(Component arg0) {
        this.field420 = arg0;
    }

    @ObfuscatedName("av.q(III)V")
    public final void method711(int arg0, int arg1) {
        this.method713(this.field420.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("av.m(IIIII)V")
    public final void method719(int arg0, int arg1, int arg2, int arg3) {
        this.method714(this.field420.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("av.j(Ljava/awt/Graphics;IIB)V")
    public final void method713(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field421, arg1, arg2, this.field420);
        } catch (Exception var5) {
            this.field420.repaint();
        }
    }

    @ObfuscatedName("av.g(Ljava/awt/Graphics;IIIII)V")
    public final void method714(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field421, 0, 0, this.field420);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field420.repaint();
        }
    }
}
