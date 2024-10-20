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

@ObfuscatedName("be")
public final class class70 extends class72 implements ImageProducer, ImageObserver {

    @ObfuscatedName("be.x")
    public ColorModel field1288;

    @ObfuscatedName("be.v")
    public ImageConsumer field1284;

    @ObfuscatedName("be.x(IILjava/awt/Component;I)V")
    public final void method1374(int arg0, int arg1, Component arg2) {
        this.field1298 = arg0;
        this.field1297 = arg1;
        this.field1299 = new int[arg0 * arg1 + 1];
        this.field1288 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1300 = arg2.createImage(this);
        this.method1369();
        arg2.prepareImage(this.field1300, this);
        this.method1369();
        arg2.prepareImage(this.field1300, this);
        this.method1369();
        arg2.prepareImage(this.field1300, this);
        this.method1443();
    }

    @ObfuscatedName("be.v(Ljava/awt/Graphics;III)V")
    public final void method1366(Graphics arg0, int arg1, int arg2) {
        this.method1369();
        arg0.drawImage(this.field1300, arg1, arg2, this);
    }

    @ObfuscatedName("be.m(Ljava/awt/Graphics;IIIIB)V")
    public final void method1367(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1381(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1300, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1284 = arg0;
        arg0.setDimensions(this.field1298, this.field1297);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1288);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1284 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1284 == arg0) {
            this.field1284 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("be.e(I)V")
    public synchronized void method1369() {
        if (this.field1284 != null) {
            this.field1284.setPixels(0, 0, this.field1298, this.field1297, this.field1288, this.field1299, 0, this.field1298);
            this.field1284.imageComplete(2);
        }
    }

    @ObfuscatedName("be.h(IIIIB)V")
    public synchronized void method1381(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1284 != null) {
            this.field1284.setPixels(arg0, arg1, arg2, arg3, this.field1288, this.field1299, this.field1298 * arg1 + arg0, this.field1298);
            this.field1284.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
