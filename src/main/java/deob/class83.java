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

@ObfuscatedName("cp")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cp.f")
    public ColorModel field1429;

    @ObfuscatedName("cp.t")
    public ImageConsumer field1428;

    @ObfuscatedName("cp.f(IILjava/awt/Component;I)V")
    public final void method1631(int arg0, int arg1, Component arg2) {
        this.field1449 = arg0;
        this.field1450 = arg1;
        this.field1455 = new int[arg0 * arg1 + 1];
        this.field1429 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1454 = arg2.createImage(this);
        this.method1630();
        arg2.prepareImage(this.field1454, this);
        this.method1630();
        arg2.prepareImage(this.field1454, this);
        this.method1630();
        arg2.prepareImage(this.field1454, this);
        this.method1693();
    }

    @ObfuscatedName("cp.t(Ljava/awt/Graphics;IIB)V")
    public final void method1626(Graphics arg0, int arg1, int arg2) {
        this.method1630();
        arg0.drawImage(this.field1454, arg1, arg2, this);
    }

    @ObfuscatedName("cp.n(Ljava/awt/Graphics;IIIII)V")
    public final void method1628(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1636(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1454, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1428 = arg0;
        arg0.setDimensions(this.field1449, this.field1450);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1429);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1428 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1428 == arg0) {
            this.field1428 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cp.e(I)V")
    public synchronized void method1630() {
        if (this.field1428 != null) {
            this.field1428.setPixels(0, 0, this.field1449, this.field1450, this.field1429, this.field1455, 0, this.field1449);
            this.field1428.imageComplete(2);
        }
    }

    @ObfuscatedName("cp.l(IIIII)V")
    public synchronized void method1636(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1428 != null) {
            this.field1428.setPixels(arg0, arg1, arg2, arg3, this.field1429, this.field1455, this.field1449 * arg1 + arg0, this.field1449);
            this.field1428.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
