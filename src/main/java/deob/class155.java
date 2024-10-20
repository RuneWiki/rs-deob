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

@ObfuscatedName("ch")
public final class class155 extends class137 {

    @ObfuscatedName("ch.j")
    public Component field2337;

    @ObfuscatedName("ch.j(IILjava/awt/Component;S)V")
    public final void method2281(int arg0, int arg1, Component arg2) {
        this.field2024 = arg0;
        this.field2027 = arg1;
        this.field2025 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field2025, this.field2025.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field2024, this.field2027), var4, (Point) null);
        this.field2026 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field2337 = arg2;
        this.method2282();
    }

    @ObfuscatedName("ch.p(Ljava/awt/Graphics;III)V")
    public final void method2293(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field2026, arg1, arg2, this.field2337);
    }

    @ObfuscatedName("ch.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method2284(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field2026, 0, 0, this.field2337);
        arg0.setClip(var6);
    }
}
