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
public final class class58 extends class283 {

    @ObfuscatedName("bl.i")
    public Component field709;

    @ObfuscatedName("bl.w")
    public Image field708;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3765 = arg0;
        this.field3766 = arg1;
        this.field3767 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3767, this.field3767.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3765, this.field3766), var4, (Point) null);
        this.field708 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method743(arg2);
        this.method4637();
    }

    @ObfuscatedName("bl.i(Ljava/awt/Component;I)V")
    public final void method743(Component arg0) {
        this.field709 = arg0;
    }

    @ObfuscatedName("bl.w(IIB)V")
    public final void method744(int arg0, int arg1) {
        this.method742(this.field709.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bl.a(IIIIB)V")
    public final void method751(int arg0, int arg1, int arg2, int arg3) {
        this.method746(this.field709.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.t(Ljava/awt/Graphics;III)V")
    public final void method742(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field708, arg1, arg2, this.field709);
        } catch (Exception var5) {
            this.field709.repaint();
        }
    }

    @ObfuscatedName("bl.s(Ljava/awt/Graphics;IIIII)V")
    public final void method746(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field708, 0, 0, this.field709);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field709.repaint();
        }
    }
}
