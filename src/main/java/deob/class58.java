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

@ObfuscatedName("bw")
public final class class58 extends class284 {

    @ObfuscatedName("bw.i")
    public Component field700;

    @ObfuscatedName("bw.j")
    public Image field701;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3767 = arg0;
        this.field3769 = arg1;
        this.field3768 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3768, this.field3768.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3767, this.field3769), var4, (Point) null);
        this.field701 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method759(arg2);
        this.method4626();
    }

    @ObfuscatedName("bw.i(Ljava/awt/Component;I)V")
    public final void method759(Component arg0) {
        this.field700 = arg0;
    }

    @ObfuscatedName("bw.j(III)V")
    public final void method760(int arg0, int arg1) {
        this.method762(this.field700.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bw.a(IIIIB)V")
    public final void method758(int arg0, int arg1, int arg2, int arg3) {
        this.method763(this.field700.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bw.r(Ljava/awt/Graphics;III)V")
    public final void method762(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field701, arg1, arg2, this.field700);
        } catch (Exception var5) {
            this.field700.repaint();
        }
    }

    @ObfuscatedName("bw.o(Ljava/awt/Graphics;IIIII)V")
    public final void method763(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field701, 0, 0, this.field700);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field700.repaint();
        }
    }
}
