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

@ObfuscatedName("bc")
public final class class58 extends class283 {

    @ObfuscatedName("bc.a")
    public Component field680;

    @ObfuscatedName("bc.j")
    public Image field679;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3764 = arg0;
        this.field3763 = arg1;
        this.field3765 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3765, this.field3765.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3764, this.field3763), var4, (Point) null);
        this.field679 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method720(arg2);
        this.method4594();
    }

    @ObfuscatedName("bc.a(Ljava/awt/Component;I)V")
    public final void method720(Component arg0) {
        this.field680 = arg0;
    }

    @ObfuscatedName("bc.j(III)V")
    public final void method718(int arg0, int arg1) {
        this.method733(this.field680.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bc.n(IIIII)V")
    public final void method721(int arg0, int arg1, int arg2, int arg3) {
        this.method734(this.field680.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bc.r(Ljava/awt/Graphics;III)V")
    public final void method733(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field679, arg1, arg2, this.field680);
        } catch (Exception var5) {
            this.field680.repaint();
        }
    }

    @ObfuscatedName("bc.v(Ljava/awt/Graphics;IIIII)V")
    public final void method734(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field679, 0, 0, this.field680);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field680.repaint();
        }
    }
}
