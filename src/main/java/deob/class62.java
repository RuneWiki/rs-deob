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
public final class class62 extends class332 {

    @ObfuscatedName("bn.z")
    public Component field458;

    @ObfuscatedName("bn.k")
    public Image field459;

    public class62(int arg0, int arg1, Component arg2) {
        this.field3886 = arg0;
        this.field3887 = arg1;
        this.field3885 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3885, this.field3885.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3886, this.field3887), var4, (Point) null);
        this.field459 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method810(arg2);
        this.method5728();
    }

    @ObfuscatedName("bn.z(Ljava/awt/Component;I)V")
    public final void method810(Component arg0) {
        this.field458 = arg0;
    }

    @ObfuscatedName("bn.k(III)V")
    public final void method812(int arg0, int arg1) {
        this.method813(this.field458.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bn.s(IIIII)V")
    public final void method819(int arg0, int arg1, int arg2, int arg3) {
        this.method808(this.field458.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bn.t(Ljava/awt/Graphics;IIB)V")
    public final void method813(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field459, arg1, arg2, this.field458);
        } catch (Exception var5) {
            this.field458.repaint();
        }
    }

    @ObfuscatedName("bn.i(Ljava/awt/Graphics;IIIIB)V")
    public final void method808(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field459, 0, 0, this.field458);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field458.repaint();
        }
    }
}
