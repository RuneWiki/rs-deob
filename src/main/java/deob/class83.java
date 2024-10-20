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

@ObfuscatedName("cv")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cv.t")
    public ColorModel field1483;

    @ObfuscatedName("cv.l")
    public ImageConsumer field1487;

    @ObfuscatedName("cv.t(IILjava/awt/Component;I)V")
    public final void method1635(int arg0, int arg1, Component arg2) {
        this.field1496 = arg0;
        this.field1497 = arg1;
        this.field1500 = new int[arg0 * arg1 + 1];
        this.field1483 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1498 = arg2.createImage(this);
        this.method1632();
        arg2.prepareImage(this.field1498, this);
        this.method1632();
        arg2.prepareImage(this.field1498, this);
        this.method1632();
        arg2.prepareImage(this.field1498, this);
        this.method1678();
    }

    @ObfuscatedName("cv.l(Ljava/awt/Graphics;III)V")
    public final void method1611(Graphics arg0, int arg1, int arg2) {
        this.method1632();
        arg0.drawImage(this.field1498, arg1, arg2, this);
    }

    @ObfuscatedName("cv.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method1609(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1636(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1498, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1487 = arg0;
        arg0.setDimensions(this.field1496, this.field1497);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1483);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1487 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1487 == arg0) {
            this.field1487 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cv.d(I)V")
    public synchronized void method1632() {
        if (this.field1487 != null) {
            this.field1487.setPixels(0, 0, this.field1496, this.field1497, this.field1483, this.field1500, 0, this.field1496);
            this.field1487.imageComplete(2);
        }
    }

    @ObfuscatedName("cv.b(IIIIB)V")
    public synchronized void method1636(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1487 != null) {
            this.field1487.setPixels(arg0, arg1, arg2, arg3, this.field1483, this.field1500, this.field1496 * arg1 + arg0, this.field1496);
            this.field1487.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
