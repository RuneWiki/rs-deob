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
public final class class58 extends class283 {

    @ObfuscatedName("bw.i")
    public Component field681;

    @ObfuscatedName("bw.h")
    public Image field680;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3754 = arg0;
        this.field3756 = arg1;
        this.field3755 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3755, this.field3755.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3754, this.field3756), var4, (Point) null);
        this.field680 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method736(arg2);
        this.method4715();
    }

    @ObfuscatedName("bw.i(Ljava/awt/Component;I)V")
    public final void method736(Component arg0) {
        this.field681 = arg0;
    }

    @ObfuscatedName("bw.h(III)V")
    public final void method738(int arg0, int arg1) {
        this.method739(this.field681.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bw.u(IIIII)V")
    public final void method737(int arg0, int arg1, int arg2, int arg3) {
        this.method740(this.field681.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bw.q(Ljava/awt/Graphics;III)V")
    public final void method739(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field680, arg1, arg2, this.field681);
        } catch (Exception var5) {
            this.field681.repaint();
        }
    }

    @ObfuscatedName("bw.g(Ljava/awt/Graphics;IIIII)V")
    public final void method740(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field680, 0, 0, this.field681);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field681.repaint();
        }
    }
}
