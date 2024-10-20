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

@ObfuscatedName("ak")
public final class class31 extends class448 {

    @ObfuscatedName("ak.v")
    public Component field183;

    @ObfuscatedName("ak.c")
    public Image field184;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4694 = arg0;
        this.field4692 = arg1;
        this.field4693 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4693, this.field4693.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4694, this.field4692), var4, (Point) null);
        this.field184 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method401(arg2);
        this.method7328();
    }

    @ObfuscatedName("ak.v(Ljava/awt/Component;B)V")
    public final void method401(Component arg0) {
        this.field183 = arg0;
    }

    @ObfuscatedName("ak.c(IIS)V")
    public final void method402(int arg0, int arg1) {
        this.method400(this.field183.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ak.i(IIIII)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3) {
        this.method405(this.field183.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.f(Ljava/awt/Graphics;III)V")
    public final void method400(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field184, arg1, arg2, this.field183);
        } catch (Exception var5) {
            this.field183.repaint();
        }
    }

    @ObfuscatedName("ak.b(Ljava/awt/Graphics;IIIII)V")
    public final void method405(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field184, 0, 0, this.field183);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field183.repaint();
        }
    }
}
