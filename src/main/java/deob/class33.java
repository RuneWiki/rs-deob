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

@ObfuscatedName("bs")
public final class class33 extends class562 {

    @ObfuscatedName("bs.ac")
    public Component field153;

    @ObfuscatedName("bs.ae")
    public Image field152;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5492 = arg0;
        this.field5493 = arg1;
        this.field5494 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5491 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5494, this.field5494.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5492, this.field5493), var5, (Point) null);
        this.field152 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method454(arg2);
        this.method9375();
    }

    @ObfuscatedName("bs.ac(Ljava/awt/Component;I)V")
    public final void method454(Component arg0) {
        this.field153 = arg0;
    }

    @ObfuscatedName("bs.ae(III)V")
    public final void method463(int arg0, int arg1) {
        this.method457(this.field153.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bs.ag(IIIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        this.method455(this.field153.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bs.am(Ljava/awt/Graphics;IIB)V")
    public final void method457(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field152, arg1, arg2, this.field153);
        } catch (Exception var5) {
            this.field153.repaint();
        }
    }

    @ObfuscatedName("bs.ax(Ljava/awt/Graphics;IIIII)V")
    public final void method455(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field152, 0, 0, this.field153);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field153.repaint();
        }
    }
}
