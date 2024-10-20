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

@ObfuscatedName("bx")
public final class class70 extends class72 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bx.a")
    public ColorModel field1283;

    @ObfuscatedName("bx.v")
    public ImageConsumer field1279;

    @ObfuscatedName("bx.a(IILjava/awt/Component;B)V")
    public final void method1350(int arg0, int arg1, Component arg2) {
        this.field1295 = arg0;
        this.field1302 = arg1;
        this.field1299 = new int[arg0 * arg1 + 1];
        this.field1283 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1297 = arg2.createImage(this);
        this.method1344();
        arg2.prepareImage(this.field1297, this);
        this.method1344();
        arg2.prepareImage(this.field1297, this);
        this.method1344();
        arg2.prepareImage(this.field1297, this);
        this.method1410();
    }

    @ObfuscatedName("bx.v(Ljava/awt/Graphics;III)V")
    public final void method1366(Graphics arg0, int arg1, int arg2) {
        this.method1344();
        arg0.drawImage(this.field1297, arg1, arg2, this);
    }

    @ObfuscatedName("bx.i(Ljava/awt/Graphics;IIIIB)V")
    public final void method1341(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1345(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1297, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1279 = arg0;
        arg0.setDimensions(this.field1295, this.field1302);
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

    @ObfuscatedName("bx.b(I)V")
    public synchronized void method1344() {
        if (this.field1279 != null) {
            this.field1279.setPixels(0, 0, this.field1295, this.field1302, this.field1283, this.field1299, 0, this.field1295);
            this.field1279.imageComplete(2);
        }
    }

    @ObfuscatedName("bx.l(IIIII)V")
    public synchronized void method1345(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1279 != null) {
            this.field1279.setPixels(arg0, arg1, arg2, arg3, this.field1283, this.field1299, this.field1295 * arg1 + arg0, this.field1295);
            this.field1279.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
