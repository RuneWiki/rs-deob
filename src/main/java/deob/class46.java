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

@ObfuscatedName("aa")
public final class class46 extends class392 {

    @ObfuscatedName("aa.f")
    public Component field301;

    @ObfuscatedName("aa.o")
    public Image field302;

    public class46(int arg0, int arg1, Component arg2) {
        this.field4225 = arg0;
        this.field4227 = arg1;
        this.field4226 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field4226, this.field4226.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4225, this.field4227), var4, (Point) null);
        this.field302 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method350(arg2);
        this.method6196();
    }

    @ObfuscatedName("aa.f(Ljava/awt/Component;I)V")
    public final void method350(Component arg0) {
        this.field301 = arg0;
    }

    @ObfuscatedName("aa.o(III)V")
    public final void method355(int arg0, int arg1) {
        this.method352(this.field301.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("aa.u(IIIIB)V")
    public final void method349(int arg0, int arg1, int arg2, int arg3) {
        this.method351(this.field301.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aa.p(Ljava/awt/Graphics;IIB)V")
    public final void method352(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field302, arg1, arg2, this.field301);
        } catch (Exception var5) {
            this.field301.repaint();
        }
    }

    @ObfuscatedName("aa.b(Ljava/awt/Graphics;IIIII)V")
    public final void method351(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field302, 0, 0, this.field301);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field301.repaint();
        }
    }
}
