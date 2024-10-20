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

@ObfuscatedName("bq")
public final class class33 extends class569 {

    @ObfuscatedName("bq.ap")
    public Component field145;

    @ObfuscatedName("bq.aw")
    public Image field144;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5543 = arg0;
        this.field5542 = arg1;
        this.field5540 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5541 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5540, this.field5540.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5543, this.field5542), var5, (Point) null);
        this.field144 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method468(arg2);
        this.method9696();
    }

    @ObfuscatedName("bq.ap(Ljava/awt/Component;I)V")
    public final void method468(Component arg0) {
        this.field145 = arg0;
    }

    @ObfuscatedName("bq.aw(III)V")
    public final void method470(int arg0, int arg1) {
        this.method471(this.field145.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bq.ak(IIIII)V")
    public final void method467(int arg0, int arg1, int arg2, int arg3) {
        this.method472(this.field145.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bq.aj(Ljava/awt/Graphics;III)V")
    public final void method471(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field144, arg1, arg2, this.field145);
        } catch (Exception var5) {
            this.field145.repaint();
        }
    }

    @ObfuscatedName("bq.ai(Ljava/awt/Graphics;IIIII)V")
    public final void method472(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field144, 0, 0, this.field145);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field145.repaint();
        }
    }
}
