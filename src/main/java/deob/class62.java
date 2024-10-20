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

@ObfuscatedName("be")
public final class class62 extends class333 {

    @ObfuscatedName("be.f")
    public Component field466;

    @ObfuscatedName("be.b")
    public Image field465;

    public class62(int arg0, int arg1, Component arg2) {
        this.field3892 = arg0;
        this.field3893 = arg1;
        this.field3894 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3894, this.field3894.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3892, this.field3893), var4, (Point) null);
        this.field465 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method827(arg2);
        this.method5716();
    }

    @ObfuscatedName("be.f(Ljava/awt/Component;B)V")
    public final void method827(Component arg0) {
        this.field466 = arg0;
    }

    @ObfuscatedName("be.b(III)V")
    public final void method828(int arg0, int arg1) {
        this.method830(this.field466.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("be.l(IIIII)V")
    public final void method829(int arg0, int arg1, int arg2, int arg3) {
        this.method835(this.field466.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("be.m(Ljava/awt/Graphics;III)V")
    public final void method830(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field465, arg1, arg2, this.field466);
        } catch (Exception var5) {
            this.field466.repaint();
        }
    }

    @ObfuscatedName("be.z(Ljava/awt/Graphics;IIIII)V")
    public final void method835(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field465, 0, 0, this.field466);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field466.repaint();
        }
    }
}
