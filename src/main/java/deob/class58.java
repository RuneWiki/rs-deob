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

@ObfuscatedName("bl")
public final class class58 extends class292 {

    @ObfuscatedName("bl.b")
    public Component field639;

    @ObfuscatedName("bl.s")
    public Image field638;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3814 = arg0;
        this.field3813 = arg1;
        this.field3816 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3816, this.field3816.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3814, this.field3813), var4, (Point) null);
        this.field638 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method694(arg2);
        this.method4757();
    }

    @ObfuscatedName("bl.b(Ljava/awt/Component;I)V")
    public final void method694(Component arg0) {
        this.field639 = arg0;
    }

    @ObfuscatedName("bl.s(IIB)V")
    public final void method704(int arg0, int arg1) {
        this.method697(this.field639.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bl.r(IIIII)V")
    public final void method696(int arg0, int arg1, int arg2, int arg3) {
        this.method698(this.field639.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.g(Ljava/awt/Graphics;IIB)V")
    public final void method697(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field638, arg1, arg2, this.field639);
        } catch (Exception var5) {
            this.field639.repaint();
        }
    }

    @ObfuscatedName("bl.x(Ljava/awt/Graphics;IIIIB)V")
    public final void method698(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field638, 0, 0, this.field639);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field639.repaint();
        }
    }
}
