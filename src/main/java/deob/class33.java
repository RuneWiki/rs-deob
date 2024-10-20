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

@ObfuscatedName("by")
public final class class33 extends class526 {

    @ObfuscatedName("by.au")
    public Component field179;

    @ObfuscatedName("by.ae")
    public Image field180;

    public class33(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field5190 = arg0;
        this.field5192 = arg1;
        this.field5191 = new int[arg0 * arg1 + 1];
        if (arg3) {
            this.field5189 = new float[arg0 * arg1 + 1];
        }
        DataBufferInt var5 = new DataBufferInt(this.field5191, this.field5191.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5190, this.field5192), var5, (Point) null);
        this.field180 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method463(arg2);
        this.method8690();
    }

    @ObfuscatedName("by.au(Ljava/awt/Component;S)V")
    public final void method463(Component arg0) {
        this.field179 = arg0;
    }

    @ObfuscatedName("by.ae(IIB)V")
    public final void method472(int arg0, int arg1) {
        this.method469(this.field179.getGraphics(), arg0, arg1);
    }

    @ObfuscatedName("by.ao(IIIII)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3) {
        this.method467(this.field179.getGraphics(), arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("by.at(Ljava/awt/Graphics;III)V")
    public final void method469(Graphics arg0, int arg1, int arg2) {
        try {
            arg0.drawImage(this.field180, arg1, arg2, this.field179);
        } catch (Exception var5) {
            this.field179.repaint();
        }
    }

    @ObfuscatedName("by.ac(Ljava/awt/Graphics;IIIII)V")
    public final void method467(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            Shape var6 = arg0.getClip();
            arg0.clipRect(arg1, arg2, arg3, arg4);
            arg0.drawImage(this.field180, 0, 0, this.field179);
            arg0.setClip(var6);
        } catch (Exception var8) {
            this.field179.repaint();
        }
    }
}
