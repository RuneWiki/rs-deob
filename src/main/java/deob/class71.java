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

@ObfuscatedName("bq")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bq.n")
    public ColorModel field1329;

    @ObfuscatedName("bq.g")
    public ImageConsumer field1332;

    @ObfuscatedName("bq.n(IILjava/awt/Component;I)V")
    public final void method1426(int arg0, int arg1, Component arg2) {
        this.field1351 = arg0;
        this.field1352 = arg1;
        this.field1350 = new int[arg0 * arg1 + 1];
        this.field1329 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1353 = arg2.createImage(this);
        this.method1432();
        arg2.prepareImage(this.field1353, this);
        this.method1432();
        arg2.prepareImage(this.field1353, this);
        this.method1432();
        arg2.prepareImage(this.field1353, this);
        this.method1500();
    }

    @ObfuscatedName("bq.g(Ljava/awt/Graphics;III)V")
    public final void method1454(Graphics arg0, int arg1, int arg2) {
        this.method1432();
        arg0.drawImage(this.field1353, arg1, arg2, this);
    }

    @ObfuscatedName("bq.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1430(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1433(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1353, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1332 = arg0;
        arg0.setDimensions(this.field1351, this.field1352);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1329);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1332 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1332 == arg0) {
            this.field1332 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bq.m(I)V")
    public synchronized void method1432() {
        if (this.field1332 != null) {
            this.field1332.setPixels(0, 0, this.field1351, this.field1352, this.field1329, this.field1350, 0, this.field1351);
            this.field1332.imageComplete(2);
        }
    }

    @ObfuscatedName("bq.s(IIIII)V")
    public synchronized void method1433(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1332 != null) {
            this.field1332.setPixels(arg0, arg1, arg2, arg3, this.field1329, this.field1350, this.field1351 * arg1 + arg0, this.field1351);
            this.field1332.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
