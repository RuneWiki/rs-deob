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

@ObfuscatedName("e")
public final class class18 extends class395 {

    @ObfuscatedName("e.s")
    public Component field94;

    @ObfuscatedName("e.t")
    public Image field95;

    public class18(int arg0, int arg1, Component arg2) {
        this.field4254 = arg0;
        this.field4253 = arg1;
        this.field4252 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4252, this.field4252.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4254, this.field4253), var4, (Point) null);
        this.field95 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method175(arg2);
        this.method6340();
    }

    @ObfuscatedName("e.s(Ljava/awt/Component;I)V")
    public final void method175(Component arg0) {
        this.field94 = arg0;
    }

    @ObfuscatedName("e.t(IIB)V")
    public final void method176(int arg0, int arg1) {
        this.method188(this.field94.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("e.v(IIIII)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3) {
        this.method178(this.field94.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("e.j(Ljava/awt/Graphics;IIB)V")
    public final void method188(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field95, arg1, arg2, this.field94);
        } catch (Exception var5) {
            this.field94.repaint();
        }
    }

    @ObfuscatedName("e.l(Ljava/awt/Graphics;IIIII)V")
    public final void method178(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field95, 0, 0, this.field94);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field94.repaint();
        }
    }
}
