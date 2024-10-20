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

@ObfuscatedName("ay")
public final class class47 extends class321 {

    @ObfuscatedName("ay.g")
    public Component field425;

    @ObfuscatedName("ay.r")
    public Image field426;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3865 = arg0;
        this.field3862 = arg1;
        this.field3863 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3863, this.field3863.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3865, this.field3862), var4, (Point) null);
        this.field426 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method751(arg2);
        this.method5655();
    }

    @ObfuscatedName("ay.g(Ljava/awt/Component;B)V")
    public final void method751(Component arg0) {
        this.field425 = arg0;
    }

    @ObfuscatedName("ay.r(III)V")
    public final void method758(int arg0, int arg1) {
        this.method754(this.field425.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ay.e(IIIII)V")
    public final void method753(int arg0, int arg1, int arg2, int arg3) {
        this.method755(this.field425.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ay.q(Ljava/awt/Graphics;IIB)V")
    public final void method754(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field426, arg1, arg2, this.field425);
        } catch (Exception var5) {
            this.field425.repaint();
        }
    }

    @ObfuscatedName("ay.c(Ljava/awt/Graphics;IIIII)V")
    public final void method755(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field426, 0, 0, this.field425);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field425.repaint();
        }
    }
}
