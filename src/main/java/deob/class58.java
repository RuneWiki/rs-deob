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

@ObfuscatedName("bj")
public final class class58 extends class296 {

    @ObfuscatedName("bj.n")
    public Component field658;

    @ObfuscatedName("bj.v")
    public Image field657;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3839 = arg0;
        this.field3840 = arg1;
        this.field3838 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3838, this.field3838.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3839, this.field3840), var4, (Point) null);
        this.field657 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method716(arg2);
        this.method4824();
    }

    @ObfuscatedName("bj.n(Ljava/awt/Component;B)V")
    public final void method716(Component arg0) {
        this.field658 = arg0;
    }

    @ObfuscatedName("bj.v(III)V")
    public final void method717(int arg0, int arg1) {
        this.method719(this.field658.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bj.y(IIIIB)V")
    public final void method718(int arg0, int arg1, int arg2, int arg3) {
        this.method720(this.field658.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bj.r(Ljava/awt/Graphics;IIB)V")
    public final void method719(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field657, arg1, arg2, this.field658);
        } catch (Exception var5) {
            this.field658.repaint();
        }
    }

    @ObfuscatedName("bj.h(Ljava/awt/Graphics;IIIII)V")
    public final void method720(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field657, 0, 0, this.field658);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field658.repaint();
        }
    }
}
