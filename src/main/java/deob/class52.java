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

@ObfuscatedName("ai")
public final class class52 extends class325 {

    @ObfuscatedName("ai.m")
    public Component field414;

    @ObfuscatedName("ai.f")
    public Image field415;

    public class52(int arg0, int arg1, Component arg2) {
        this.field3879 = arg0;
        this.field3878 = arg1;
        this.field3881 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3881, this.field3881.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3879, this.field3878), var4, (Point) null);
        this.field415 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method766(arg2);
        this.method5540();
    }

    @ObfuscatedName("ai.m(Ljava/awt/Component;B)V")
    public final void method766(Component arg0) {
        this.field414 = arg0;
    }

    @ObfuscatedName("ai.f(III)V")
    public final void method767(int arg0, int arg1) {
        this.method769(this.field414.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ai.q(IIIIB)V")
    public final void method774(int arg0, int arg1, int arg2, int arg3) {
        this.method770(this.field414.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ai.w(Ljava/awt/Graphics;III)V")
    public final void method769(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field415, arg1, arg2, this.field414);
        } catch (Exception var5) {
            this.field414.repaint();
        }
    }

    @ObfuscatedName("ai.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method770(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field415, 0, 0, this.field414);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field414.repaint();
        }
    }
}
