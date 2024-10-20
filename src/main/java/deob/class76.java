package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("bb")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bb.j")
    public ColorModel field1359;

    @ObfuscatedName("bb.m")
    public ImageConsumer field1360;

    @ObfuscatedName("bb.j(IILjava/awt/Component;I)V")
    public final void method1520(int arg0, int arg1, Component arg2) {
        this.field1382 = arg0;
        this.field1381 = arg1;
        this.field1388 = new int[arg0 * arg1 + 1];
        this.field1359 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1383 = arg2.createImage(this);
        this.method1550();
        arg2.prepareImage(this.field1383, this);
        this.method1550();
        arg2.prepareImage(this.field1383, this);
        this.method1550();
        arg2.prepareImage(this.field1383, this);
        this.method1591();
    }

    @ObfuscatedName("bb.m(Ljava/awt/Graphics;IIB)V")
    public final void method1516(Graphics arg0, int arg1, int arg2) {
        this.method1550();
        arg0.drawImage(this.field1383, arg1, arg2, this);
    }

    @ObfuscatedName("bb.f(Ljava/awt/Graphics;IIIII)V")
    public final void method1519(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1521(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1383, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1360 = arg0;
        arg0.setDimensions(this.field1382, this.field1381);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1359);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1360 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1360 == arg0) {
            this.field1360 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bb.l(B)V")
    public synchronized void method1550() {
        if (this.field1360 != null) {
            this.field1360.setPixels(0, 0, this.field1382, this.field1381, this.field1359, this.field1388, 0, this.field1382);
            this.field1360.imageComplete(2);
        }
    }

    @ObfuscatedName("bb.u(IIIIB)V")
    public synchronized void method1521(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1360 != null) {
            this.field1360.setPixels(arg0, arg1, arg2, arg3, this.field1359, this.field1388, this.field1382 * arg1 + arg0, this.field1382);
            this.field1360.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
