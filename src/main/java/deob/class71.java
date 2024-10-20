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

@ObfuscatedName("bv")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bv.n")
    public ColorModel field1310;

    @ObfuscatedName("bv.w")
    public ImageConsumer field1304;

    @ObfuscatedName("bv.n(IILjava/awt/Component;I)V")
    public final void method1366(int arg0, int arg1, Component arg2) {
        this.field1321 = arg0;
        this.field1322 = arg1;
        this.field1320 = new int[arg0 * arg1 + 1];
        this.field1310 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1324 = arg2.createImage(this);
        this.method1381();
        arg2.prepareImage(this.field1324, this);
        this.method1381();
        arg2.prepareImage(this.field1324, this);
        this.method1381();
        arg2.prepareImage(this.field1324, this);
        this.method1446();
    }

    @ObfuscatedName("bv.w(Ljava/awt/Graphics;IIS)V")
    public final void method1367(Graphics arg0, int arg1, int arg2) {
        this.method1381();
        arg0.drawImage(this.field1324, arg1, arg2, this);
    }

    @ObfuscatedName("bv.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1368(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1372(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1324, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1304 = arg0;
        arg0.setDimensions(this.field1321, this.field1322);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1310);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1304 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1304 == arg0) {
            this.field1304 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bv.e(I)V")
    public synchronized void method1381() {
        if (this.field1304 != null) {
            this.field1304.setPixels(0, 0, this.field1321, this.field1322, this.field1310, this.field1320, 0, this.field1321);
            this.field1304.imageComplete(2);
        }
    }

    @ObfuscatedName("bv.h(IIIII)V")
    public synchronized void method1372(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1304 != null) {
            this.field1304.setPixels(arg0, arg1, arg2, arg3, this.field1310, this.field1320, this.field1321 * arg1 + arg0, this.field1321);
            this.field1304.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
