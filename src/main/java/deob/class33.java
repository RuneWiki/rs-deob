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

@ObfuscatedName("bg")
public final class class33 extends class538 {

    @ObfuscatedName("bg.at")
    public Component field161;

    @ObfuscatedName("bg.ah")
    public Image field162;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5217 = arg0;
        this.field5216 = arg1;
        this.field5219 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5218 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5219, this.field5219.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5217, this.field5216), var5, (Point) null);
        this.field162 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method468(arg2);
        this.method8844();
    }

    @ObfuscatedName("bg.at(Ljava/awt/Component;B)V")
    public final void method468(Component arg0) {
        this.field161 = arg0;
    }

    @ObfuscatedName("bg.ah(IIB)V")
    public final void method469(int arg0, int arg1) {
        this.method471(this.field161.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bg.ar(IIIIB)V")
    public final void method470(int arg0, int arg1, int arg2, int arg3) {
        this.method472(this.field161.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.ao(Ljava/awt/Graphics;III)V")
    public final void method471(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field162, arg1, arg2, this.field161);
        } catch (Exception var5) {
            this.field161.repaint();
        }
    }

    @ObfuscatedName("bg.ab(Ljava/awt/Graphics;IIIIB)V")
    public final void method472(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field162, 0, 0, this.field161);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field161.repaint();
        }
    }
}
