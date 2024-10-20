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

@ObfuscatedName("cb")
public final class class79 extends class81 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cb.a")
    public ColorModel field1454;

    @ObfuscatedName("cb.d")
    public ImageConsumer field1452;

    @ObfuscatedName("cb.a(IILjava/awt/Component;I)V")
    public final void method1557(int arg0, int arg1, Component arg2) {
        this.field1469 = arg0;
        this.field1475 = arg1;
        this.field1473 = new int[arg0 * arg1 + 1];
        this.field1454 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1471 = arg2.createImage(this);
        this.method1588();
        arg2.prepareImage(this.field1471, this);
        this.method1588();
        arg2.prepareImage(this.field1471, this);
        this.method1588();
        arg2.prepareImage(this.field1471, this);
        this.method1629();
    }

    @ObfuscatedName("cb.d(Ljava/awt/Graphics;III)V")
    public final void method1558(Graphics arg0, int arg1, int arg2) {
        this.method1588();
        arg0.drawImage(this.field1471, arg1, arg2, this);
    }

    @ObfuscatedName("cb.v(Ljava/awt/Graphics;IIIIB)V")
    public final void method1559(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1562(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1471, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1452 = arg0;
        arg0.setDimensions(this.field1469, this.field1475);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1454);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1452 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1452 == arg0) {
            this.field1452 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cb.r(I)V")
    public synchronized void method1588() {
        if (this.field1452 != null) {
            this.field1452.setPixels(0, 0, this.field1469, this.field1475, this.field1454, this.field1473, 0, this.field1469);
            this.field1452.imageComplete(2);
        }
    }

    @ObfuscatedName("cb.z(IIIII)V")
    public synchronized void method1562(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1452 != null) {
            this.field1452.setPixels(arg0, arg1, arg2, arg3, this.field1454, this.field1473, this.field1469 * arg1 + arg0, this.field1469);
            this.field1452.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
