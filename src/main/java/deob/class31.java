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
public final class class31 extends class450 {

    @ObfuscatedName("ab.o")
    public Component field177;

    @ObfuscatedName("ab.q")
    public Image field178;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4752 = arg0;
        this.field4751 = arg1;
        this.field4753 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4753, this.field4753.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4752, this.field4751), var4, (Point) null);
        this.field178 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method383(arg2);
        this.method7277();
    }

    @ObfuscatedName("ab.o(Ljava/awt/Component;B)V")
    public final void method383(Component arg0) {
        this.field177 = arg0;
    }

    @ObfuscatedName("ab.q(III)V")
    public final void method385(int arg0, int arg1) {
        this.method387(this.field177.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ab.l(IIIII)V")
    public final void method386(int arg0, int arg1, int arg2, int arg3) {
        this.method389(this.field177.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ab.k(Ljava/awt/Graphics;IIB)V")
    public final void method387(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field178, arg1, arg2, this.field177);
        } catch (Exception var5) {
            this.field177.repaint();
        }
    }

    @ObfuscatedName("ab.a(Ljava/awt/Graphics;IIIII)V")
    public final void method389(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field178, 0, 0, this.field177);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field177.repaint();
        }
    }
}
