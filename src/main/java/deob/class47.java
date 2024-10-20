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

@ObfuscatedName("aj")
public final class class47 extends class321 {

    @ObfuscatedName("aj.f")
    public Component field416;

    @ObfuscatedName("aj.l")
    public Image field417;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3856 = arg0;
        this.field3855 = arg1;
        this.field3857 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3857, this.field3857.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3856, this.field3855), var4, (Point) null);
        this.field417 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method710(arg2);
        this.method5535();
    }

    @ObfuscatedName("aj.f(Ljava/awt/Component;I)V")
    public final void method710(Component arg0) {
        this.field416 = arg0;
    }

    @ObfuscatedName("aj.l(III)V")
    public final void method711(int arg0, int arg1) {
        this.method717(this.field416.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("aj.w(IIIIB)V")
    public final void method712(int arg0, int arg1, int arg2, int arg3) {
        this.method713(this.field416.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aj.s(Ljava/awt/Graphics;IIB)V")
    public final void method717(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field417, arg1, arg2, this.field416);
        } catch (Exception var5) {
            this.field416.repaint();
        }
    }

    @ObfuscatedName("aj.e(Ljava/awt/Graphics;IIIII)V")
    public final void method713(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field417, 0, 0, this.field416);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field416.repaint();
        }
    }
}
