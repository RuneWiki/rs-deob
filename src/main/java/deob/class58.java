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
public final class class58 extends class286 {

    @ObfuscatedName("ba.w")
    public Component field708;

    @ObfuscatedName("ba.o")
    public Image field709;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3767 = arg0;
        this.field3768 = arg1;
        this.field3769 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3769, this.field3769.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3767, this.field3768), var4, (Point) null);
        this.field709 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method707(arg2);
        this.method4664();
    }

    @ObfuscatedName("ba.w(Ljava/awt/Component;I)V")
    public final void method707(Component arg0) {
        this.field708 = arg0;
    }

    @ObfuscatedName("ba.o(III)V")
    public final void method720(int arg0, int arg1) {
        this.method710(this.field708.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ba.x(IIIIB)V")
    public final void method709(int arg0, int arg1, int arg2, int arg3) {
        this.method708(this.field708.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.k(Ljava/awt/Graphics;III)V")
    public final void method710(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field709, arg1, arg2, this.field708);
        } catch (Exception var5) {
            this.field708.repaint();
        }
    }

    @ObfuscatedName("ba.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method708(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field709, 0, 0, this.field708);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field708.repaint();
        }
    }
}
