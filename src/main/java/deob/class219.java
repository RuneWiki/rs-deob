package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("hw")
public final class class219 extends class221 {

    @ObfuscatedName("hw.b")
    public Component field3182;

    @ObfuscatedName("hw.b(IILjava/awt/Component;I)V")
    public final void method3861(int arg0, int arg1, Component arg2) {
        this.field3191 = arg0;
        this.field3194 = arg1;
        this.field3193 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field3193, this.field3193.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3191, this.field3194), var4, (Point) null);
        this.field3192 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field3182 = arg2;
        this.method3948();
    }

    @ObfuscatedName("hw.l(Ljava/awt/Graphics;III)V")
    public final void method3860(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field3192, arg1, arg2, this.field3182);
    }

    @ObfuscatedName("hw.i(Ljava/awt/Graphics;IIIII)V")
    public final void method3862(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3192, 0, 0, this.field3182);
        arg0.setClip(var6);
    }
}
