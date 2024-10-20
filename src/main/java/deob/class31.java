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

@ObfuscatedName("ax")
public final class class31 extends class454 {

    @ObfuscatedName("ax.s")
    public Component field176;

    @ObfuscatedName("ax.h")
    public Image field177;

    public class31(int arg0, int arg1, Component arg2) {
        this.field4779 = arg0;
        this.field4780 = arg1;
        this.field4778 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4778, this.field4778.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4779, this.field4780), var4, (Point) null);
        this.field177 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method398(arg2);
        this.method7315();
    }

    @ObfuscatedName("ax.s(Ljava/awt/Component;B)V")
    public final void method398(Component arg0) {
        this.field176 = arg0;
    }

    @ObfuscatedName("ax.h(IIS)V")
    public final void method390(int arg0, int arg1) {
        this.method405(this.field176.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ax.w(IIIII)V")
    public final void method391(int arg0, int arg1, int arg2, int arg3) {
        this.method388(this.field176.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ax.v(Ljava/awt/Graphics;IIB)V")
    public final void method405(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field177, arg1, arg2, this.field176);
        } catch (Exception var5) {
            this.field176.repaint();
        }
    }

    @ObfuscatedName("ax.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method388(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field177, 0, 0, this.field176);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field176.repaint();
        }
    }
}
