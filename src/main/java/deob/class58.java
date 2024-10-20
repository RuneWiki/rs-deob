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

@ObfuscatedName("bp")
public final class class58 extends class307 {

    @ObfuscatedName("bp.p")
    public Component field625;

    @ObfuscatedName("bp.i")
    public Image field626;

    public class58(int arg0, int arg1, Component arg2) {
        this.field3858 = arg0;
        this.field3860 = arg1;
        this.field3861 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3861, this.field3861.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3858, this.field3860), var4, (Point) null);
        this.field626 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method720(arg2);
        this.method5086();
    }

    @ObfuscatedName("bp.p(Ljava/awt/Component;I)V")
    public final void method720(Component arg0) {
        this.field625 = arg0;
    }

    @ObfuscatedName("bp.i(IIB)V")
    public final void method712(int arg0, int arg1) {
        this.method722(this.field625.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bp.w(IIIIB)V")
    public final void method719(int arg0, int arg1, int arg2, int arg3) {
        this.method710(this.field625.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bp.s(Ljava/awt/Graphics;III)V")
    public final void method722(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field626, arg1, arg2, this.field625);
        } catch (Exception var5) {
            this.field625.repaint();
        }
    }

    @ObfuscatedName("bp.j(Ljava/awt/Graphics;IIIII)V")
    public final void method710(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field626, 0, 0, this.field625);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field625.repaint();
        }
    }
}
