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

@ObfuscatedName("bn")
public final class class62 extends class333 {

    @ObfuscatedName("bn.h")
    public Component field449;

    @ObfuscatedName("bn.v")
    public Image field448;

    public class62(int arg0, int arg1, Component arg2) {
        this.field3893 = arg0;
        this.field3894 = arg1;
        this.field3892 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3892, this.field3892.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3893, this.field3894), var4, (Point) null);
        this.field448 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method839(arg2);
        this.method5651();
    }

    @ObfuscatedName("bn.h(Ljava/awt/Component;B)V")
    public final void method839(Component arg0) {
        this.field449 = arg0;
    }

    @ObfuscatedName("bn.v(III)V")
    public final void method835(int arg0, int arg1) {
        this.method830(this.field449.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bn.x(IIIIB)V")
    public final void method829(int arg0, int arg1, int arg2, int arg3) {
        this.method831(this.field449.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bn.w(Ljava/awt/Graphics;III)V")
    public final void method830(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field448, arg1, arg2, this.field449);
        } catch (Exception var5) {
            this.field449.repaint();
        }
    }

    @ObfuscatedName("bn.t(Ljava/awt/Graphics;IIIII)V")
    public final void method831(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field448, 0, 0, this.field449);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field449.repaint();
        }
    }
}
