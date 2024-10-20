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

@ObfuscatedName("co")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("co.q")
    public ColorModel field1449;

    @ObfuscatedName("co.c")
    public ImageConsumer field1450;

    @ObfuscatedName("co.q(IILjava/awt/Component;I)V")
    public final void method1636(int arg0, int arg1, Component arg2) {
        this.field1467 = arg0;
        this.field1468 = arg1;
        this.field1470 = new int[arg0 * arg1 + 1];
        this.field1449 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1469 = arg2.createImage(this);
        this.method1643();
        arg2.prepareImage(this.field1469, this);
        this.method1643();
        arg2.prepareImage(this.field1469, this);
        this.method1643();
        arg2.prepareImage(this.field1469, this);
        this.method1677();
    }

    @ObfuscatedName("co.c(Ljava/awt/Graphics;III)V")
    public final void method1645(Graphics arg0, int arg1, int arg2) {
        this.method1643();
        arg0.drawImage(this.field1469, arg1, arg2, this);
    }

    @ObfuscatedName("co.p(Ljava/awt/Graphics;IIIIB)V")
    public final void method1618(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1622(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1469, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1450 = arg0;
        arg0.setDimensions(this.field1467, this.field1468);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1449);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1450 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1450 == arg0) {
            this.field1450 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("co.z(B)V")
    public synchronized void method1643() {
        if (this.field1450 != null) {
            this.field1450.setPixels(0, 0, this.field1467, this.field1468, this.field1449, this.field1470, 0, this.field1467);
            this.field1450.imageComplete(2);
        }
    }

    @ObfuscatedName("co.m(IIIIB)V")
    public synchronized void method1622(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1450 != null) {
            this.field1450.setPixels(arg0, arg1, arg2, arg3, this.field1449, this.field1470, this.field1467 * arg1 + arg0, this.field1467);
            this.field1450.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
