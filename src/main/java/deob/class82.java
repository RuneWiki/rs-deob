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

@ObfuscatedName("cy")
public final class class82 extends class78 {

    @ObfuscatedName("cy.l")
    public Component field1417;

    @ObfuscatedName("cy.l(IILjava/awt/Component;I)V")
    public final void method1559(int arg0, int arg1, Component arg2) {
        this.field1383 = arg0;
        this.field1382 = arg1;
        this.field1387 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field1387, this.field1387.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1383, this.field1382), var4, (Point) null);
        this.field1385 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1417 = arg2;
        this.method1595();
    }

    @ObfuscatedName("cy.e(Ljava/awt/Graphics;III)V")
    public final void method1536(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field1385, arg1, arg2, this.field1417);
    }

    @ObfuscatedName("cy.q(Ljava/awt/Graphics;IIIII)V")
    public final void method1537(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1385, 0, 0, this.field1417);
        arg0.setClip(var6);
    }
}
