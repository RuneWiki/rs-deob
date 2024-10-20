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

@ObfuscatedName("bb")
public final class class58 extends class284 {

    @ObfuscatedName("bb.d")
    public Component field702;

    @ObfuscatedName("bb.k")
    public Image field701;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3776 = arg0;
        this.field3777 = arg1;
        this.field3778 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3778, this.field3778.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3776, this.field3777), var4, (Point) null);
        this.field701 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method752(arg2);
        this.method4764();
    }

    @ObfuscatedName("bb.d(Ljava/awt/Component;B)V")
    public final void method752(Component arg0) {
        this.field702 = arg0;
    }

    @ObfuscatedName("bb.k(III)V")
    public final void method753(int arg0, int arg1) {
        this.method755(this.field702.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bb.e(IIIII)V")
    public final void method754(int arg0, int arg1, int arg2, int arg3) {
        this.method760(this.field702.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bb.p(Ljava/awt/Graphics;III)V")
    public final void method755(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field701, arg1, arg2, this.field702);
        } catch (Exception var5) {
            this.field702.repaint();
        }
    }

    @ObfuscatedName("bb.q(Ljava/awt/Graphics;IIIII)V")
    public final void method760(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field701, 0, 0, this.field702);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field702.repaint();
        }
    }
}
