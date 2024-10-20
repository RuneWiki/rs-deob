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
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bh.h")
    public ColorModel field1385;

    @ObfuscatedName("bh.m")
    public ImageConsumer field1383;

    @ObfuscatedName("bh.h(IILjava/awt/Component;B)V")
    public final void method1489(int arg0, int arg1, Component arg2) {
        this.field1398 = arg0;
        this.field1405 = arg1;
        this.field1400 = new int[arg0 * arg1 + 1];
        this.field1385 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1399 = arg2.createImage(this);
        this.method1493();
        arg2.prepareImage(this.field1399, this);
        this.method1493();
        arg2.prepareImage(this.field1399, this);
        this.method1493();
        arg2.prepareImage(this.field1399, this);
        this.method1563();
    }

    @ObfuscatedName("bh.m(Ljava/awt/Graphics;IIB)V")
    public final void method1518(Graphics arg0, int arg1, int arg2) {
        this.method1493();
        arg0.drawImage(this.field1399, arg1, arg2, this);
    }

    @ObfuscatedName("bh.i(Ljava/awt/Graphics;IIIIB)V")
    public final void method1491(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1494(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1399, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1383 = arg0;
        arg0.setDimensions(this.field1398, this.field1405);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1385);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1383 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1383 == arg0) {
            this.field1383 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bh.q(I)V")
    public synchronized void method1493() {
        if (this.field1383 != null) {
            this.field1383.setPixels(0, 0, this.field1398, this.field1405, this.field1385, this.field1400, 0, this.field1398);
            this.field1383.imageComplete(2);
        }
    }

    @ObfuscatedName("bh.p(IIIIB)V")
    public synchronized void method1494(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1383 != null) {
            this.field1383.setPixels(arg0, arg1, arg2, arg3, this.field1385, this.field1400, this.field1398 * arg1 + arg0, this.field1398);
            this.field1383.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
