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

@ObfuscatedName("bp")
public final class class58 extends class286 {

    @ObfuscatedName("bp.s")
    public Component field686;

    @ObfuscatedName("bp.c")
    public Image field687;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3772 = arg0;
        this.field3774 = arg1;
        this.field3773 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3773, this.field3773.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3772, this.field3774), var4, (Point) null);
        this.field687 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method718(arg2);
        this.method4735();
    }

    @ObfuscatedName("bp.s(Ljava/awt/Component;I)V")
    public final void method718(Component arg0) {
        this.field686 = arg0;
    }

    @ObfuscatedName("bp.c(IIB)V")
    public final void method731(int arg0, int arg1) {
        this.method723(this.field686.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bp.f(IIIII)V")
    public final void method734(int arg0, int arg1, int arg2, int arg3) {
        this.method720(this.field686.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bp.m(Ljava/awt/Graphics;IIS)V")
    public final void method723(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field687, arg1, arg2, this.field686);
        } catch (Exception var5) {
            this.field686.repaint();
        }
    }

    @ObfuscatedName("bp.h(Ljava/awt/Graphics;IIIII)V")
    public final void method720(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field687, 0, 0, this.field686);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field686.repaint();
        }
    }
}
