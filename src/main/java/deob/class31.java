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

@ObfuscatedName("ab")
public final class class31 extends class453 {

    @ObfuscatedName("ab.c")
    public Component field177;

    @ObfuscatedName("ab.v")
    public Image field176;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4776 = arg0;
        this.field4777 = arg1;
        this.field4778 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4778, this.field4778.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4776, this.field4777), var4, (Point) null);
        this.field176 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method368(arg2);
        this.method7424();
    }

    @ObfuscatedName("ab.c(Ljava/awt/Component;B)V")
    public final void method368(Component arg0) {
        this.field177 = arg0;
    }

    @ObfuscatedName("ab.v(IIB)V")
    public final void method360(int arg0, int arg1) {
        this.method362(this.field177.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ab.q(IIIII)V")
    public final void method366(int arg0, int arg1, int arg2, int arg3) {
        this.method373(this.field177.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ab.f(Ljava/awt/Graphics;III)V")
    public final void method362(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field176, arg1, arg2, this.field177);
        } catch (Exception var5) {
            this.field177.repaint();
        }
    }

    @ObfuscatedName("ab.j(Ljava/awt/Graphics;IIIIB)V")
    public final void method373(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field176, 0, 0, this.field177);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field177.repaint();
        }
    }
}
