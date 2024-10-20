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

@ObfuscatedName("bc")
public final class class58 extends class284 {

    @ObfuscatedName("bc.j")
    public Component field688;

    @ObfuscatedName("bc.h")
    public Image field689;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3751 = arg0;
        this.field3752 = arg1;
        this.field3750 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3750, this.field3750.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3751, this.field3752), var4, (Point) null);
        this.field689 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method760(arg2);
        this.method4673();
    }

    @ObfuscatedName("bc.j(Ljava/awt/Component;I)V")
    public final void method760(Component arg0) {
        this.field688 = arg0;
    }

    @ObfuscatedName("bc.h(IIB)V")
    public final void method761(int arg0, int arg1) {
        this.method767(this.field688.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bc.f(IIIIS)V")
    public final void method759(int arg0, int arg1, int arg2, int arg3) {
        this.method764(this.field688.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bc.p(Ljava/awt/Graphics;IIB)V")
    public final void method767(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field689, arg1, arg2, this.field688);
        } catch (Exception var5) {
            this.field688.repaint();
        }
    }

    @ObfuscatedName("bc.x(Ljava/awt/Graphics;IIIII)V")
    public final void method764(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field689, 0, 0, this.field688);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field688.repaint();
        }
    }
}
