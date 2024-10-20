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

@ObfuscatedName("bl")
public final class class33 extends class489 {

    @ObfuscatedName("bl.aj")
    public Component field170;

    @ObfuscatedName("bl.al")
    public Image field169;

    public class33(int arg0, int arg1, Component arg2) {
        this.field4977 = arg0;
        this.field4978 = arg1;
        this.field4980 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4980, this.field4980.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4977, this.field4978), var4, (Point) null);
        this.field169 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method444(arg2);
        this.method8288();
    }

    @ObfuscatedName("bl.aj(Ljava/awt/Component;I)V")
    public final void method444(Component arg0) {
        this.field170 = arg0;
    }

    @ObfuscatedName("bl.al(III)V")
    public final void method452(int arg0, int arg1) {
        this.method447(this.field170.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bl.ac(IIIIB)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3) {
        this.method458(this.field170.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.ab(Ljava/awt/Graphics;IIB)V")
    public final void method447(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field169, arg1, arg2, this.field170);
        } catch (Exception var5) {
            this.field170.repaint();
        }
    }

    @ObfuscatedName("bl.an(Ljava/awt/Graphics;IIIIB)V")
    public final void method458(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field169, 0, 0, this.field170);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field170.repaint();
        }
    }
}
