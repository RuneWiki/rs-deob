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
public final class class46 extends class394 {

    @ObfuscatedName("am.f")
    public Component field318;

    @ObfuscatedName("am.e")
    public Image field317;

    public class46(int arg0, int arg1, Component arg2) {
        this.field4237 = arg0;
        this.field4236 = arg1;
        this.field4238 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4238, this.field4238.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4237, this.field4236), var4, (Point) null);
        this.field317 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method391(arg2);
        this.method6249();
    }

    @ObfuscatedName("am.f(Ljava/awt/Component;B)V")
    public final void method391(Component arg0) {
        this.field318 = arg0;
    }

    @ObfuscatedName("am.e(III)V")
    public final void method380(int arg0, int arg1) {
        this.method401(this.field318.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("am.v(IIIIS)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3) {
        this.method383(this.field318.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.y(Ljava/awt/Graphics;III)V")
    public final void method401(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field317, arg1, arg2, this.field318);
        } catch (Exception var5) {
            this.field318.repaint();
        }
    }

    @ObfuscatedName("am.j(Ljava/awt/Graphics;IIIII)V")
    public final void method383(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field317, 0, 0, this.field318);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field318.repaint();
        }
    }
}
