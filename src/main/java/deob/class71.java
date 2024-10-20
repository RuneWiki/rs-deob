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

@ObfuscatedName("bj")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bj.t")
    public ColorModel field1287;

    @ObfuscatedName("bj.b")
    public ImageConsumer field1285;

    @ObfuscatedName("bj.t(IILjava/awt/Component;I)V")
    public final void method1434(int arg0, int arg1, Component arg2) {
        this.field1300 = arg0;
        this.field1302 = arg1;
        this.field1311 = new int[arg0 * arg1 + 1];
        this.field1287 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1303 = arg2.createImage(this);
        this.method1422();
        arg2.prepareImage(this.field1303, this);
        this.method1422();
        arg2.prepareImage(this.field1303, this);
        this.method1422();
        arg2.prepareImage(this.field1303, this);
        this.method1468();
    }

    @ObfuscatedName("bj.b(Ljava/awt/Graphics;III)V")
    public final void method1419(Graphics arg0, int arg1, int arg2) {
        this.method1422();
        arg0.drawImage(this.field1303, arg1, arg2, this);
    }

    @ObfuscatedName("bj.p(Ljava/awt/Graphics;IIIII)V")
    public final void method1420(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1425(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1303, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1285 = arg0;
        arg0.setDimensions(this.field1300, this.field1302);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1287);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1285 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1285 == arg0) {
            this.field1285 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bj.e(I)V")
    public synchronized void method1422() {
        if (this.field1285 != null) {
            this.field1285.setPixels(0, 0, this.field1300, this.field1302, this.field1287, this.field1311, 0, this.field1300);
            this.field1285.imageComplete(2);
        }
    }

    @ObfuscatedName("bj.i(IIIII)V")
    public synchronized void method1425(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1285 != null) {
            this.field1285.setPixels(arg0, arg1, arg2, arg3, this.field1287, this.field1311, this.field1300 * arg1 + arg0, this.field1300);
            this.field1285.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
