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

@ObfuscatedName("bo")
public final class class33 extends class500 {

    @ObfuscatedName("bo.af")
    public Component field185;

    @ObfuscatedName("bo.an")
    public Image field186;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5069 = arg0;
        this.field5071 = arg1;
        this.field5070 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5072 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5070, this.field5070.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5069, this.field5071), var5, (Point) null);
        this.field186 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method475(arg2);
        this.method8640();
    }

    @ObfuscatedName("bo.af(Ljava/awt/Component;B)V")
    public final void method475(Component arg0) {
        this.field185 = arg0;
    }

    @ObfuscatedName("bo.an(III)V")
    public final void method476(int arg0, int arg1) {
        this.method479(this.field185.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("bo.aw(IIIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3) {
        this.method477(this.field185.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bo.ac(Ljava/awt/Graphics;III)V")
    public final void method479(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field186, arg1, arg2, this.field185);
        } catch (Exception var5) {
            this.field185.repaint();
        }
    }

    @ObfuscatedName("bo.au(Ljava/awt/Graphics;IIIII)V")
    public final void method477(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field186, 0, 0, this.field185);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field185.repaint();
        }
    }
}
