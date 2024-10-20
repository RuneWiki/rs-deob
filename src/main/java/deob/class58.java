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

@ObfuscatedName("bv")
public final class class58 extends class283 {

    @ObfuscatedName("bv.d")
    public Component field661;

    @ObfuscatedName("bv.q")
    public Image field662;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3748 = arg0;
        this.field3746 = arg1;
        this.field3747 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3747, this.field3747.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3748, this.field3746), var4, (Point) null);
        this.field662 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method732(arg2);
        this.method4632();
    }

    @ObfuscatedName("bv.d(Ljava/awt/Component;I)V")
    public final void method732(Component arg0) {
        this.field661 = arg0;
    }

    @ObfuscatedName("bv.q(III)V")
    public final void method722(int arg0, int arg1) {
        this.method724(this.field661.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bv.x(IIIII)V")
    public final void method723(int arg0, int arg1, int arg2, int arg3) {
        this.method725(this.field661.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bv.y(Ljava/awt/Graphics;III)V")
    public final void method724(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field662, arg1, arg2, this.field661);
        } catch (Exception var5) {
            this.field661.repaint();
        }
    }

    @ObfuscatedName("bv.e(Ljava/awt/Graphics;IIIIB)V")
    public final void method725(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field662, 0, 0, this.field661);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field661.repaint();
        }
    }
}
