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

@ObfuscatedName("cr")
public final class class82 extends class84 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cr.v")
    public ColorModel field1426;

    @ObfuscatedName("cr.f")
    public ImageConsumer field1423;

    @ObfuscatedName("cr.v(IILjava/awt/Component;B)V")
    public final void method1628(int arg0, int arg1, Component arg2) {
        this.field1435 = arg0;
        this.field1434 = arg1;
        this.field1442 = new int[arg0 * arg1 + 1];
        this.field1426 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1436 = arg2.createImage(this);
        this.method1633();
        arg2.prepareImage(this.field1436, this);
        this.method1633();
        arg2.prepareImage(this.field1436, this);
        this.method1633();
        arg2.prepareImage(this.field1436, this);
        this.method1698();
    }

    @ObfuscatedName("cr.f(Ljava/awt/Graphics;III)V")
    public final void method1641(Graphics arg0, int arg1, int arg2) {
        this.method1633();
        arg0.drawImage(this.field1436, arg1, arg2, this);
    }

    @ObfuscatedName("cr.n(Ljava/awt/Graphics;IIIII)V")
    public final void method1630(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1634(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1436, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1423 = arg0;
        arg0.setDimensions(this.field1435, this.field1434);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1426);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1423 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1423 == arg0) {
            this.field1423 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cr.c(I)V")
    public synchronized void method1633() {
        if (this.field1423 != null) {
            this.field1423.setPixels(0, 0, this.field1435, this.field1434, this.field1426, this.field1442, 0, this.field1435);
            this.field1423.imageComplete(2);
        }
    }

    @ObfuscatedName("cr.r(IIIII)V")
    public synchronized void method1634(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1423 != null) {
            this.field1423.setPixels(arg0, arg1, arg2, arg3, this.field1426, this.field1442, this.field1435 * arg1 + arg0, this.field1435);
            this.field1423.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
