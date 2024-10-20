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

@ObfuscatedName("bd")
public final class class58 extends class284 {

    @ObfuscatedName("bd.e")
    public Component field670;

    @ObfuscatedName("bd.n")
    public Image field671;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3747 = arg0;
        this.field3748 = arg1;
        this.field3746 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3746, this.field3746.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3747, this.field3748), var4, (Point) null);
        this.field671 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method726(arg2);
        this.method4726();
    }

    @ObfuscatedName("bd.e(Ljava/awt/Component;B)V")
    public final void method726(Component arg0) {
        this.field670 = arg0;
    }

    @ObfuscatedName("bd.n(III)V")
    public final void method727(int arg0, int arg1) {
        this.method731(this.field670.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bd.g(IIIII)V")
    public final void method729(int arg0, int arg1, int arg2, int arg3) {
        this.method728(this.field670.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.y(Ljava/awt/Graphics;III)V")
    public final void method731(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field671, arg1, arg2, this.field670);
        } catch (Exception var5) {
            this.field670.repaint();
        }
    }

    @ObfuscatedName("bd.w(Ljava/awt/Graphics;IIIII)V")
    public final void method728(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field671, 0, 0, this.field670);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field670.repaint();
        }
    }
}
