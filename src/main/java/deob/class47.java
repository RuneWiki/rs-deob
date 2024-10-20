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

@ObfuscatedName("ad")
public final class class47 extends class321 {

    @ObfuscatedName("ad.f")
    public Component field388;

    @ObfuscatedName("ad.h")
    public Image field387;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3853 = arg0;
        this.field3856 = arg1;
        this.field3854 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3854, this.field3854.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3853, this.field3856), var4, (Point) null);
        this.field387 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method689(arg2);
        this.method5418();
    }

    @ObfuscatedName("ad.f(Ljava/awt/Component;I)V")
    public final void method689(Component arg0) {
        this.field388 = arg0;
    }

    @ObfuscatedName("ad.h(III)V")
    public final void method688(int arg0, int arg1) {
        this.method691(this.field388.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ad.e(IIIIB)V")
    public final void method698(int arg0, int arg1, int arg2, int arg3) {
        this.method692(this.field388.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ad.b(Ljava/awt/Graphics;IIB)V")
    public final void method691(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field387, arg1, arg2, this.field388);
        } catch (Exception var5) {
            this.field388.repaint();
        }
    }

    @ObfuscatedName("ad.l(Ljava/awt/Graphics;IIIII)V")
    public final void method692(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field387, 0, 0, this.field388);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field388.repaint();
        }
    }
}
