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

@ObfuscatedName("bk")
public final class class33 extends class542 {

    @ObfuscatedName("bk.am")
    public Component field171;

    @ObfuscatedName("bk.ap")
    public Image field172;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5259 = arg0;
        this.field5257 = arg1;
        this.field5258 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5260 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5258, this.field5258.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5259, this.field5257), var5, (Point) null);
        this.field172 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method464(arg2);
        this.method8954();
    }

    @ObfuscatedName("bk.am(Ljava/awt/Component;I)V")
    public final void method464(Component arg0) {
        this.field171 = arg0;
    }

    @ObfuscatedName("bk.ap(III)V")
    public final void method466(int arg0, int arg1) {
        this.method468(this.field171.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bk.af(IIIIB)V")
    public final void method467(int arg0, int arg1, int arg2, int arg3) {
        this.method482(this.field171.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bk.aj(Ljava/awt/Graphics;III)V")
    public final void method468(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field172, arg1, arg2, this.field171);
        } catch (Exception var5) {
            this.field171.repaint();
        }
    }

    @ObfuscatedName("bk.aq(Ljava/awt/Graphics;IIIIB)V")
    public final void method482(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field172, 0, 0, this.field171);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field171.repaint();
        }
    }
}
