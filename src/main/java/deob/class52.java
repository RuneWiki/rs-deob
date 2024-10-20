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

@ObfuscatedName("am")
public final class class52 extends class325 {

    @ObfuscatedName("am.a")
    public Component field446;

    @ObfuscatedName("am.s")
    public Image field445;

    public class52(int arg0, int arg1, Component arg2) {
        this.field3869 = arg0;
        this.field3868 = arg1;
        this.field3871 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3871, this.field3871.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3869, this.field3868), var4, (Point) null);
        this.field445 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method753(arg2);
        this.method5625();
    }

    @ObfuscatedName("am.a(Ljava/awt/Component;B)V")
    public final void method753(Component arg0) {
        this.field446 = arg0;
    }

    @ObfuscatedName("am.s(IIB)V")
    public final void method755(int arg0, int arg1) {
        this.method764(this.field446.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("am.g(IIIII)V")
    public final void method756(int arg0, int arg1, int arg2, int arg3) {
        this.method758(this.field446.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.x(Ljava/awt/Graphics;IIB)V")
    public final void method764(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field445, arg1, arg2, this.field446);
        } catch (Exception var5) {
            this.field446.repaint();
        }
    }

    @ObfuscatedName("am.h(Ljava/awt/Graphics;IIIII)V")
    public final void method758(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field445, 0, 0, this.field446);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field446.repaint();
        }
    }
}
