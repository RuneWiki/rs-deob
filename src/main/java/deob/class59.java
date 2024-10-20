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

@ObfuscatedName("bh")
public final class class59 extends class329 {

    @ObfuscatedName("bh.g")
    public Component field664;

    @ObfuscatedName("bh.e")
    public Image field663;

    public class59(int arg0, int arg1, Component arg2) {
        this.field3967 = arg0;
        this.field3968 = arg1;
        this.field3969 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3969, this.field3969.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3967, this.field3968), var4, (Point) null);
        this.field663 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method790(arg2);
        this.method5428();
    }

    @ObfuscatedName("bh.g(Ljava/awt/Component;I)V")
    public final void method790(Component arg0) {
        this.field664 = arg0;
    }

    @ObfuscatedName("bh.e(III)V")
    public final void method791(int arg0, int arg1) {
        this.method793(this.field664.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bh.b(IIIII)V")
    public final void method792(int arg0, int arg1, int arg2, int arg3) {
        this.method804(this.field664.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bh.z(Ljava/awt/Graphics;IIB)V")
    public final void method793(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field663, arg1, arg2, this.field664);
        } catch (Exception var5) {
            this.field664.repaint();
        }
    }

    @ObfuscatedName("bh.n(Ljava/awt/Graphics;IIIII)V")
    public final void method804(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field663, 0, 0, this.field664);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field664.repaint();
        }
    }
}
