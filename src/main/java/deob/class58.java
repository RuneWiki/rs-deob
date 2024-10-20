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

@ObfuscatedName("bq")
public final class class58 extends class283 {

    @ObfuscatedName("bq.e")
    public Component field687;

    @ObfuscatedName("bq.o")
    public Image field686;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3756 = arg0;
        this.field3755 = arg1;
        this.field3757 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3757, this.field3757.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3756, this.field3755), var4, (Point) null);
        this.field686 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method722(arg2);
        this.method4656();
    }

    @ObfuscatedName("bq.e(Ljava/awt/Component;I)V")
    public final void method722(Component arg0) {
        this.field687 = arg0;
    }

    @ObfuscatedName("bq.o(IIB)V")
    public final void method718(int arg0, int arg1) {
        this.method720(this.field687.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bq.m(IIIII)V")
    public final void method731(int arg0, int arg1, int arg2, int arg3) {
        this.method721(this.field687.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bq.g(Ljava/awt/Graphics;IIB)V")
    public final void method720(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field686, arg1, arg2, this.field687);
        } catch (Exception var5) {
            this.field687.repaint();
        }
    }

    @ObfuscatedName("bq.d(Ljava/awt/Graphics;IIIIB)V")
    public final void method721(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field686, 0, 0, this.field687);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field687.repaint();
        }
    }
}
