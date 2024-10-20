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

@ObfuscatedName("ah")
public final class class31 extends class411 {

    @ObfuscatedName("ah.l")
    public Component field175;

    @ObfuscatedName("ah.q")
    public Image field174;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4364 = arg0;
        this.field4365 = arg1;
        this.field4366 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4366, this.field4366.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4364, this.field4365), var4, (Point) null);
        this.field174 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method425(arg2);
        this.method6622();
    }

    @ObfuscatedName("ah.l(Ljava/awt/Component;I)V")
    public final void method425(Component arg0) {
        this.field175 = arg0;
    }

    @ObfuscatedName("ah.q(III)V")
    public final void method424(int arg0, int arg1) {
        this.method427(this.field175.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ah.f(IIIII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3) {
        this.method428(this.field175.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ah.j(Ljava/awt/Graphics;III)V")
    public final void method427(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field174, arg1, arg2, this.field175);
        } catch (Exception var5) {
            this.field175.repaint();
        }
    }

    @ObfuscatedName("ah.m(Ljava/awt/Graphics;IIIII)V")
    public final void method428(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field174, 0, 0, this.field175);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field175.repaint();
        }
    }
}
