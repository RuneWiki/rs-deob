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

@ObfuscatedName("bh")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bh.g")
    public ColorModel field1283;

    @ObfuscatedName("bh.i")
    public ImageConsumer field1279;

    @ObfuscatedName("bh.g(IILjava/awt/Component;B)V")
    public final void method1319(int arg0, int arg1, Component arg2) {
        this.field1301 = arg0;
        this.field1303 = arg1;
        this.field1299 = new int[arg0 * arg1 + 1];
        this.field1283 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1302 = arg2.createImage(this);
        this.method1335();
        arg2.prepareImage(this.field1302, this);
        this.method1335();
        arg2.prepareImage(this.field1302, this);
        this.method1335();
        arg2.prepareImage(this.field1302, this);
        this.method1380();
    }

    @ObfuscatedName("bh.i(Ljava/awt/Graphics;III)V")
    public final void method1314(Graphics arg0, int arg1, int arg2) {
        this.method1335();
        arg0.drawImage(this.field1302, arg1, arg2, this);
    }

    @ObfuscatedName("bh.k(Ljava/awt/Graphics;IIIIB)V")
    public final void method1315(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1342(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1302, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1279 = arg0;
        arg0.setDimensions(this.field1301, this.field1303);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1283);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1279 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1279 == arg0) {
            this.field1279 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bh.e(B)V")
    public synchronized void method1335() {
        if (this.field1279 != null) {
            this.field1279.setPixels(0, 0, this.field1301, this.field1303, this.field1283, this.field1299, 0, this.field1301);
            this.field1279.imageComplete(2);
        }
    }

    @ObfuscatedName("bh.w(IIIIB)V")
    public synchronized void method1342(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1279 != null) {
            this.field1279.setPixels(arg0, arg1, arg2, arg3, this.field1283, this.field1299, this.field1301 * arg1 + arg0, this.field1301);
            this.field1279.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
