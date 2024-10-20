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

@ObfuscatedName("at")
public final class class34 extends class478 {

    @ObfuscatedName("at.h")
    public Component field196;

    @ObfuscatedName("at.e")
    public Image field195;

    public class34(int arg0, int arg1, Component arg2) {
        this.field4992 = arg0;
        this.field4993 = arg1;
        this.field4991 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4991, this.field4991.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4992, this.field4993), var4, (Point) null);
        this.field195 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method462(arg2);
        this.method8188();
    }

    @ObfuscatedName("at.h(Ljava/awt/Component;I)V")
    public final void method462(Component arg0) {
        this.field196 = arg0;
    }

    @ObfuscatedName("at.e(IIB)V")
    public final void method463(int arg0, int arg1) {
        this.method465(this.field196.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("at.v(IIIIB)V")
    public final void method464(int arg0, int arg1, int arg2, int arg3) {
        this.method461(this.field196.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("at.x(Ljava/awt/Graphics;IIB)V")
    public final void method465(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field195, arg1, arg2, this.field196);
        } catch (Exception var5) {
            this.field196.repaint();
        }
    }

    @ObfuscatedName("at.m(Ljava/awt/Graphics;IIIIS)V")
    public final void method461(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field195, 0, 0, this.field196);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field196.repaint();
        }
    }
}
