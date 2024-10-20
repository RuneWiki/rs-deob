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

@ObfuscatedName("cd")
public final class class159 extends class140 {

    @ObfuscatedName("cd.b")
    public Component field2412;

    @ObfuscatedName("cd.h(Ljava/awt/Graphics;IIB)V")
    public final void method1475(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field2148, arg1, arg2, this.field2412);
    }

    @ObfuscatedName("cd.k(Ljava/awt/Graphics;IIIII)V")
    public final void method1496(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field2148, 0, 0, this.field2412);
        arg0.setClip(var6);
    }

    @ObfuscatedName("cd.b(IILjava/awt/Component;I)V")
    public final void method1464(int arg0, int arg1, Component arg2) {
        this.field2145 = arg0;
        this.field2151 = arg1;
        this.field2149 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field2149, this.field2149.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field2145, this.field2151), var4, (Point) null);
        this.field2148 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field2412 = arg2;
        this.method2374();
    }
}
