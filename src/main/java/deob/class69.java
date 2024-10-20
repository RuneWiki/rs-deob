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
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bb.y")
    public ColorModel field1260;

    @ObfuscatedName("bb.u")
    public ImageConsumer field1261;

    @ObfuscatedName("bb.y(IILjava/awt/Component;I)V")
    public final void method1331(int arg0, int arg1, Component arg2) {
        this.field1284 = arg0;
        this.field1281 = arg1;
        this.field1283 = new int[arg0 * arg1 + 1];
        this.field1260 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1282 = arg2.createImage(this);
        this.method1336();
        arg2.prepareImage(this.field1282, this);
        this.method1336();
        arg2.prepareImage(this.field1282, this);
        this.method1336();
        arg2.prepareImage(this.field1282, this);
        this.method1398();
    }

    @ObfuscatedName("bb.u(Ljava/awt/Graphics;III)V")
    public final void method1332(Graphics arg0, int arg1, int arg2) {
        this.method1336();
        arg0.drawImage(this.field1282, arg1, arg2, this);
    }

    @ObfuscatedName("bb.k(Ljava/awt/Graphics;IIIII)V")
    public final void method1338(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1337(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1282, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1261 = arg0;
        arg0.setDimensions(this.field1284, this.field1281);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1260);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1261 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1261 == arg0) {
            this.field1261 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bb.v(B)V")
    public synchronized void method1336() {
        if (this.field1261 != null) {
            this.field1261.setPixels(0, 0, this.field1284, this.field1281, this.field1260, this.field1283, 0, this.field1284);
            this.field1261.imageComplete(2);
        }
    }

    @ObfuscatedName("bb.l(IIIII)V")
    public synchronized void method1337(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1261 != null) {
            this.field1261.setPixels(arg0, arg1, arg2, arg3, this.field1260, this.field1283, this.field1284 * arg1 + arg0, this.field1284);
            this.field1261.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
