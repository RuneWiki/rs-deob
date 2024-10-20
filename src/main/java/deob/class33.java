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
public final class class33 extends class525 {

    @ObfuscatedName("bp.aw")
    public Component field185;

    @ObfuscatedName("bp.ay")
    public Image field186;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5146 = arg0;
        this.field5148 = arg1;
        this.field5149 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5147 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5149, this.field5149.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5146, this.field5148), var5, (Point) null);
        this.field186 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method451(arg2);
        this.method8659();
    }

    @ObfuscatedName("bp.aw(Ljava/awt/Component;I)V")
    public final void method451(Component arg0) {
        this.field185 = arg0;
    }

    @ObfuscatedName("bp.ay(III)V")
    public final void method453(int arg0, int arg1) {
        this.method461(this.field185.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bp.ar(IIIIB)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3) {
        this.method452(this.field185.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bp.am(Ljava/awt/Graphics;IIB)V")
    public final void method461(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field186, arg1, arg2, this.field185);
        } catch (Exception var5) {
            this.field185.repaint();
        }
    }

    @ObfuscatedName("bp.as(Ljava/awt/Graphics;IIIII)V")
    public final void method452(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field186, 0, 0, this.field185);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field185.repaint();
        }
    }
}
