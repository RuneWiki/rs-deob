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

@ObfuscatedName("ab")
public final class class47 extends class316 {

    @ObfuscatedName("ab.w")
    public Component field380;

    @ObfuscatedName("ab.m")
    public Image field379;

    public class47(int arg0, int arg1, Component arg2) {
        this.field3775 = arg0;
        this.field3776 = arg1;
        this.field3774 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3774, this.field3774.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3775, this.field3776), var4, (Point) null);
        this.field379 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method741(arg2);
        this.method5416();
    }

    @ObfuscatedName("ab.w(Ljava/awt/Component;I)V")
    public final void method741(Component arg0) {
        this.field380 = arg0;
    }

    @ObfuscatedName("ab.m(IIB)V")
    public final void method731(int arg0, int arg1) {
        this.method733(this.field380.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ab.q(IIIII)V")
    public final void method732(int arg0, int arg1, int arg2, int arg3) {
        this.method730(this.field380.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ab.x(Ljava/awt/Graphics;IIB)V")
    public final void method733(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field379, arg1, arg2, this.field380);
        } catch (Exception var5) {
            this.field380.repaint();
        }
    }

    @ObfuscatedName("ab.j(Ljava/awt/Graphics;IIIII)V")
    public final void method730(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field379, 0, 0, this.field380);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field380.repaint();
        }
    }
}
