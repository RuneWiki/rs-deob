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

@ObfuscatedName("am")
public final class class31 extends class411 {

    @ObfuscatedName("am.i")
    public Component field167;

    @ObfuscatedName("am.w")
    public Image field166;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4374 = arg0;
        this.field4375 = arg1;
        this.field4376 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4376, this.field4376.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4374, this.field4375), var4, (Point) null);
        this.field166 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method411(arg2);
        this.method6602();
    }

    @ObfuscatedName("am.i(Ljava/awt/Component;I)V")
    public final void method411(Component arg0) {
        this.field167 = arg0;
    }

    @ObfuscatedName("am.w(III)V")
    public final void method409(int arg0, int arg1) {
        this.method410(this.field167.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("am.s(IIIII)V")
    public final void method408(int arg0, int arg1, int arg2, int arg3) {
        this.method422(this.field167.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.a(Ljava/awt/Graphics;III)V")
    public final void method410(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field166, arg1, arg2, this.field167);
        } catch (Exception var5) {
            this.field167.repaint();
        }
    }

    @ObfuscatedName("am.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method422(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field166, 0, 0, this.field167);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field167.repaint();
        }
    }
}
