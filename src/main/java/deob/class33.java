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

@ObfuscatedName("bf")
public final class class33 extends class512 {

    @ObfuscatedName("bf.at")
    public Component field167;

    @ObfuscatedName("bf.an")
    public Image field166;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5097 = arg0;
        this.field5095 = arg1;
        this.field5098 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5096 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5098, this.field5098.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5097, this.field5095), var5, (Point) null);
        this.field166 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method442(arg2);
        this.method8555();
    }

    @ObfuscatedName("bf.at(Ljava/awt/Component;B)V")
    public final void method442(Component arg0) {
        this.field167 = arg0;
    }

    @ObfuscatedName("bf.an(IIS)V")
    public final void method433(int arg0, int arg1) {
        this.method437(this.field167.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bf.av(IIIII)V")
    public final void method435(int arg0, int arg1, int arg2, int arg3) {
        this.method448(this.field167.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bf.as(Ljava/awt/Graphics;IIB)V")
    public final void method437(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field166, arg1, arg2, this.field167);
        } catch (Exception var5) {
            this.field167.repaint();
        }
    }

    @ObfuscatedName("bf.ax(Ljava/awt/Graphics;IIIII)V")
    public final void method448(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field166, 0, 0, this.field167);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field167.repaint();
        }
    }
}
