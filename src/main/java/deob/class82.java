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

@ObfuscatedName("cw")
public final class class82 extends class84 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cw.u")
    public ColorModel field1422;

    @ObfuscatedName("cw.k")
    public ImageConsumer field1419;

    @ObfuscatedName("cw.u(IILjava/awt/Component;I)V")
    public final void method1602(int arg0, int arg1, Component arg2) {
        this.field1434 = arg0;
        this.field1435 = arg1;
        this.field1437 = new int[arg0 * arg1 + 1];
        this.field1422 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1436 = arg2.createImage(this);
        this.method1607();
        arg2.prepareImage(this.field1436, this);
        this.method1607();
        arg2.prepareImage(this.field1436, this);
        this.method1607();
        arg2.prepareImage(this.field1436, this);
        this.method1666();
    }

    @ObfuscatedName("cw.k(Ljava/awt/Graphics;IIS)V")
    public final void method1603(Graphics arg0, int arg1, int arg2) {
        this.method1607();
        arg0.drawImage(this.field1436, arg1, arg2, this);
    }

    @ObfuscatedName("cw.x(Ljava/awt/Graphics;IIIII)V")
    public final void method1621(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1620(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1436, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1419 = arg0;
        arg0.setDimensions(this.field1434, this.field1435);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1422);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1419 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1419 == arg0) {
            this.field1419 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cw.m(B)V")
    public synchronized void method1607() {
        if (this.field1419 != null) {
            this.field1419.setPixels(0, 0, this.field1434, this.field1435, this.field1422, this.field1437, 0, this.field1434);
            this.field1419.imageComplete(2);
        }
    }

    @ObfuscatedName("cw.n(IIIIB)V")
    public synchronized void method1620(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1419 != null) {
            this.field1419.setPixels(arg0, arg1, arg2, arg3, this.field1422, this.field1437, this.field1434 * arg1 + arg0, this.field1434);
            this.field1419.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
