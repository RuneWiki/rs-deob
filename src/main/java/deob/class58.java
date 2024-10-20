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

@ObfuscatedName("bj")
public final class class58 extends class320 {

    @ObfuscatedName("bj.b")
    public Component field621;

    @ObfuscatedName("bj.q")
    public Image field622;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3883 = arg0;
        this.field3885 = arg1;
        this.field3884 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3884, this.field3884.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3883, this.field3885), var4, (Point) null);
        this.field622 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method759(arg2);
        this.method5302();
    }

    @ObfuscatedName("bj.b(Ljava/awt/Component;I)V")
    public final void method759(Component arg0) {
        this.field621 = arg0;
    }

    @ObfuscatedName("bj.q(III)V")
    public final void method751(int arg0, int arg1) {
        this.method753(this.field621.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bj.o(IIIII)V")
    public final void method749(int arg0, int arg1, int arg2, int arg3) {
        this.method754(this.field621.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bj.p(Ljava/awt/Graphics;IIB)V")
    public final void method753(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field622, arg1, arg2, this.field621);
        } catch (Exception var5) {
            this.field621.repaint();
        }
    }

    @ObfuscatedName("bj.a(Ljava/awt/Graphics;IIIII)V")
    public final void method754(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field622, 0, 0, this.field621);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field621.repaint();
        }
    }
}
