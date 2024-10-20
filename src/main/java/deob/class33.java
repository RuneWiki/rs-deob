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

@ObfuscatedName("al")
public final class class33 extends class485 {

    @ObfuscatedName("al.f")
    public Component field193;

    @ObfuscatedName("al.w")
    public Image field194;

    public class33(int arg0, int arg1, Component arg2) {
        this.field5013 = arg0;
        this.field5014 = arg1;
        this.field5015 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field5015, this.field5015.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field5013, this.field5014), var4, (Point) null);
        this.field194 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method466(arg2);
        this.method8368();
    }

    @ObfuscatedName("al.f(Ljava/awt/Component;I)V")
    public final void method466(Component arg0) {
        this.field193 = arg0;
    }

    @ObfuscatedName("al.w(IIB)V")
    public final void method467(int arg0, int arg1) {
        this.method465(this.field193.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("al.v(IIIIB)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        this.method479(this.field193.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("al.s(Ljava/awt/Graphics;III)V")
    public final void method465(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field194, arg1, arg2, this.field193);
        } catch (Exception var5) {
            this.field193.repaint();
        }
    }

    @ObfuscatedName("al.z(Ljava/awt/Graphics;IIIIB)V")
    public final void method479(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field194, 0, 0, this.field193);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field193.repaint();
        }
    }
}
