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

@ObfuscatedName("ar")
public final class class31 extends class431 {

    @ObfuscatedName("ar.c")
    public Component field184;

    @ObfuscatedName("ar.l")
    public Image field183;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4585 = arg0;
        this.field4586 = arg1;
        this.field4587 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4587, this.field4587.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4585, this.field4586), var4, (Point) null);
        this.field183 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method414(arg2);
        this.method7028();
    }

    @ObfuscatedName("ar.c(Ljava/awt/Component;I)V")
    public final void method414(Component arg0) {
        this.field184 = arg0;
    }

    @ObfuscatedName("ar.l(IIB)V")
    public final void method427(int arg0, int arg1) {
        this.method416(this.field184.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ar.s(IIIII)V")
    public final void method417(int arg0, int arg1, int arg2, int arg3) {
        this.method418(this.field184.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ar.e(Ljava/awt/Graphics;IIB)V")
    public final void method416(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field183, arg1, arg2, this.field184);
        } catch (Exception var5) {
            this.field184.repaint();
        }
    }

    @ObfuscatedName("ar.r(Ljava/awt/Graphics;IIIIB)V")
    public final void method418(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field183, 0, 0, this.field184);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field184.repaint();
        }
    }
}
