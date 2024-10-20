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

@ObfuscatedName("bd")
public final class class33 extends class560 {

    @ObfuscatedName("bd.ab")
    public Component field148;

    @ObfuscatedName("bd.ay")
    public Image field147;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5458 = arg0;
        this.field5456 = arg1;
        this.field5460 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5457 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5460, this.field5460.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5458, this.field5456), var5, (Point) null);
        this.field147 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method424(arg2);
        this.method9208();
    }

    @ObfuscatedName("bd.ab(Ljava/awt/Component;B)V")
    public final void method424(Component arg0) {
        this.field148 = arg0;
    }

    @ObfuscatedName("bd.ay(IIB)V")
    public final void method435(int arg0, int arg1) {
        this.method427(this.field148.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bd.an(IIIII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3) {
        this.method437(this.field148.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.au(Ljava/awt/Graphics;IIB)V")
    public final void method427(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field147, arg1, arg2, this.field148);
        } catch (Exception var5) {
            this.field148.repaint();
        }
    }

    @ObfuscatedName("bd.ax(Ljava/awt/Graphics;IIIII)V")
    public final void method437(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field147, 0, 0, this.field148);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field148.repaint();
        }
    }
}
