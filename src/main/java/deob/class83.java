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

@ObfuscatedName("ca")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ca.g")
    public ColorModel field1432;

    @ObfuscatedName("ca.h")
    public ImageConsumer field1429;

    @ObfuscatedName("ca.g(IILjava/awt/Component;B)V")
    public final void method1629(int arg0, int arg1, Component arg2) {
        this.field1451 = arg0;
        this.field1448 = arg1;
        this.field1454 = new int[arg0 * arg1 + 1];
        this.field1432 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1449 = arg2.createImage(this);
        this.method1633();
        arg2.prepareImage(this.field1449, this);
        this.method1633();
        arg2.prepareImage(this.field1449, this);
        this.method1633();
        arg2.prepareImage(this.field1449, this);
        this.method1702();
    }

    @ObfuscatedName("ca.h(Ljava/awt/Graphics;III)V")
    public final void method1643(Graphics arg0, int arg1, int arg2) {
        this.method1633();
        arg0.drawImage(this.field1449, arg1, arg2, this);
    }

    @ObfuscatedName("ca.s(Ljava/awt/Graphics;IIIII)V")
    public final void method1655(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1634(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1449, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1429 = arg0;
        arg0.setDimensions(this.field1451, this.field1448);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1432);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1429 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1429 == arg0) {
            this.field1429 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ca.o(I)V")
    public synchronized void method1633() {
        if (this.field1429 != null) {
            this.field1429.setPixels(0, 0, this.field1451, this.field1448, this.field1432, this.field1454, 0, this.field1451);
            this.field1429.imageComplete(2);
        }
    }

    @ObfuscatedName("ca.p(IIIII)V")
    public synchronized void method1634(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1429 != null) {
            this.field1429.setPixels(arg0, arg1, arg2, arg3, this.field1432, this.field1454, this.field1451 * arg1 + arg0, this.field1451);
            this.field1429.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
