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
public final class class33 extends class546 {

    @ObfuscatedName("bd.az")
    public Component field160;

    @ObfuscatedName("bd.ah")
    public Image field159;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5312 = arg0;
        this.field5311 = arg1;
        this.field5314 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5315 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5314, this.field5314.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5312, this.field5311), var5, (Point) null);
        this.field159 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method438(arg2);
        this.method8858();
    }

    @ObfuscatedName("bd.az(Ljava/awt/Component;I)V")
    public final void method438(Component arg0) {
        this.field160 = arg0;
    }

    @ObfuscatedName("bd.ah(III)V")
    public final void method439(int arg0, int arg1) {
        this.method437(this.field160.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bd.af(IIIII)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3) {
        this.method446(this.field160.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.at(Ljava/awt/Graphics;III)V")
    public final void method437(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field159, arg1, arg2, this.field160);
        } catch (Exception var5) {
            this.field160.repaint();
        }
    }

    @ObfuscatedName("bd.an(Ljava/awt/Graphics;IIIII)V")
    public final void method446(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field159, 0, 0, this.field160);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field160.repaint();
        }
    }
}
