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

@ObfuscatedName("bt")
public final class class33 extends class545 {

    @ObfuscatedName("bt.aq")
    public Component field168;

    @ObfuscatedName("bt.aw")
    public Image field167;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5279 = arg0;
        this.field5280 = arg1;
        this.field5282 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5281 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5282, this.field5282.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5279, this.field5280), var5, (Point) null);
        this.field167 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method438(arg2);
        this.method8970();
    }

    @ObfuscatedName("bt.aq(Ljava/awt/Component;I)V")
    public final void method438(Component arg0) {
        this.field168 = arg0;
    }

    @ObfuscatedName("bt.aw(III)V")
    public final void method428(int arg0, int arg1) {
        this.method437(this.field168.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bt.al(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3) {
        this.method431(this.field168.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bt.ai(Ljava/awt/Graphics;IIB)V")
    public final void method437(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field167, arg1, arg2, this.field168);
        } catch (Exception var5) {
            this.field168.repaint();
        }
    }

    @ObfuscatedName("bt.ar(Ljava/awt/Graphics;IIIIB)V")
    public final void method431(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field167, 0, 0, this.field168);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field168.repaint();
        }
    }
}
