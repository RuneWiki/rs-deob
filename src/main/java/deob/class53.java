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

@ObfuscatedName("bi")
public final class class53 extends class322 {

    @ObfuscatedName("bi.u")
    public Component field434;

    @ObfuscatedName("bi.f")
    public Image field435;

    public class53(int arg0, int arg1, Component arg2) {
        this.field3851 = arg0;
        this.field3853 = arg1;
        this.field3852 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3852, this.field3852.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3851, this.field3853), var4, (Point) null);
        this.field435 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method764(arg2);
        this.method5650();
    }

    @ObfuscatedName("bi.u(Ljava/awt/Component;I)V")
    public final void method764(Component arg0) {
        this.field434 = arg0;
    }

    @ObfuscatedName("bi.f(IIB)V")
    public final void method765(int arg0, int arg1) {
        this.method767(this.field434.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bi.b(IIIII)V")
    public final void method766(int arg0, int arg1, int arg2, int arg3) {
        this.method768(this.field434.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bi.g(Ljava/awt/Graphics;III)V")
    public final void method767(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field435, arg1, arg2, this.field434);
        } catch (Exception var5) {
            this.field434.repaint();
        }
    }

    @ObfuscatedName("bi.z(Ljava/awt/Graphics;IIIIB)V")
    public final void method768(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field435, 0, 0, this.field434);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field434.repaint();
        }
    }
}
