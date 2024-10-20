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

@ObfuscatedName("af")
public final class class52 extends class324 {

    @ObfuscatedName("af.n")
    public Component field425;

    @ObfuscatedName("af.h")
    public Image field424;

    public class52(int arg0, int arg1, Component arg2) {
        this.field3863 = arg0;
        this.field3861 = arg1;
        this.field3862 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3862, this.field3862.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3863, this.field3861), var4, (Point) null);
        this.field424 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method737(arg2);
        this.method5663();
    }

    @ObfuscatedName("af.n(Ljava/awt/Component;I)V")
    public final void method737(Component arg0) {
        this.field425 = arg0;
    }

    @ObfuscatedName("af.h(III)V")
    public final void method738(int arg0, int arg1) {
        this.method740(this.field425.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("af.l(IIIII)V")
    public final void method739(int arg0, int arg1, int arg2, int arg3) {
        this.method741(this.field425.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("af.g(Ljava/awt/Graphics;IIB)V")
    public final void method740(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field424, arg1, arg2, this.field425);
        } catch (Exception var5) {
            this.field425.repaint();
        }
    }

    @ObfuscatedName("af.b(Ljava/awt/Graphics;IIIII)V")
    public final void method741(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field424, 0, 0, this.field425);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field425.repaint();
        }
    }
}
