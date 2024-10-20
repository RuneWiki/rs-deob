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

@ObfuscatedName("ba")
public final class class33 extends class558 {

    @ObfuscatedName("ba.aq")
    public Component field157;

    @ObfuscatedName("ba.ad")
    public Image field156;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5443 = arg0;
        this.field5442 = arg1;
        this.field5441 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5440 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5441, this.field5441.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5443, this.field5442), var5, (Point) null);
        this.field156 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method460(arg2);
        this.method9127();
    }

    @ObfuscatedName("ba.aq(Ljava/awt/Component;I)V")
    public final void method460(Component arg0) {
        this.field157 = arg0;
    }

    @ObfuscatedName("ba.ad(III)V")
    public final void method461(int arg0, int arg1) {
        this.method463(this.field157.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ba.ag(IIIII)V")
    public final void method459(int arg0, int arg1, int arg2, int arg3) {
        this.method467(this.field157.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.ak(Ljava/awt/Graphics;III)V")
    public final void method463(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field156, arg1, arg2, this.field157);
        } catch (Exception var5) {
            this.field157.repaint();
        }
    }

    @ObfuscatedName("ba.ap(Ljava/awt/Graphics;IIIII)V")
    public final void method467(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field156, 0, 0, this.field157);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field157.repaint();
        }
    }
}
