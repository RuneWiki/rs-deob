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

@ObfuscatedName("ba")
public final class class58 extends class292 {

    @ObfuscatedName("ba.d")
    public Component field658;

    @ObfuscatedName("ba.x")
    public Image field657;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3816 = arg0;
        this.field3817 = arg1;
        this.field3815 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3815, this.field3815.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3816, this.field3817), var4, (Point) null);
        this.field657 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method745(arg2);
        this.method4868();
    }

    @ObfuscatedName("ba.d(Ljava/awt/Component;B)V")
    public final void method745(Component arg0) {
        this.field658 = arg0;
    }

    @ObfuscatedName("ba.x(III)V")
    public final void method756(int arg0, int arg1) {
        this.method747(this.field658.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ba.k(IIIII)V")
    public final void method746(int arg0, int arg1, int arg2, int arg3) {
        this.method748(this.field658.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.z(Ljava/awt/Graphics;III)V")
    public final void method747(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field657, arg1, arg2, this.field658);
        } catch (Exception var5) {
            this.field658.repaint();
        }
    }

    @ObfuscatedName("ba.v(Ljava/awt/Graphics;IIIII)V")
    public final void method748(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field657, 0, 0, this.field658);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field658.repaint();
        }
    }
}
