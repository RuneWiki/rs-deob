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

@ObfuscatedName("bw")
public final class class33 extends class557 {

    @ObfuscatedName("bw.ak")
    public Component field170;

    @ObfuscatedName("bw.al")
    public Image field171;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5425 = arg0;
        this.field5423 = arg1;
        this.field5421 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5424 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5421, this.field5421.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5425, this.field5423), var5, (Point) null);
        this.field171 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method463(arg2);
        this.method9185();
    }

    @ObfuscatedName("bw.ak(Ljava/awt/Component;I)V")
    public final void method463(Component arg0) {
        this.field170 = arg0;
    }

    @ObfuscatedName("bw.al(III)V")
    public final void method451(int arg0, int arg1) {
        this.method453(this.field170.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bw.aj(IIIII)V")
    public final void method449(int arg0, int arg1, int arg2, int arg3) {
        this.method465(this.field170.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bw.az(Ljava/awt/Graphics;III)V")
    public final void method453(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field171, arg1, arg2, this.field170);
        } catch (Exception var5) {
            this.field170.repaint();
        }
    }

    @ObfuscatedName("bw.af(Ljava/awt/Graphics;IIIIB)V")
    public final void method465(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field171, 0, 0, this.field170);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field170.repaint();
        }
    }
}
