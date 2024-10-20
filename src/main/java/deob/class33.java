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
public final class class33 extends class541 {

    @ObfuscatedName("ba.ac")
    public Component field177;

    @ObfuscatedName("ba.al")
    public Image field176;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5216 = arg0;
        this.field5219 = arg1;
        this.field5218 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5217 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5218, this.field5218.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5216, this.field5219), var5, (Point) null);
        this.field176 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method451(arg2);
        this.method8779();
    }

    @ObfuscatedName("ba.ac(Ljava/awt/Component;I)V")
    public final void method451(Component arg0) {
        this.field177 = arg0;
    }

    @ObfuscatedName("ba.al(III)V")
    public final void method452(int arg0, int arg1) {
        this.method463(this.field177.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("ba.ak(IIIIB)V")
    public final void method455(int arg0, int arg1, int arg2, int arg3) {
        this.method453(this.field177.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.ax(Ljava/awt/Graphics;III)V")
    public final void method463(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field176, arg1, arg2, this.field177);
        } catch (Exception var5) {
            this.field177.repaint();
        }
    }

    @ObfuscatedName("ba.ao(Ljava/awt/Graphics;IIIII)V")
    public final void method453(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field176, 0, 0, this.field177);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field177.repaint();
        }
    }
}
