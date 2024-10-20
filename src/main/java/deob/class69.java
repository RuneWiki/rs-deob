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
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bx.p")
    public ColorModel field1278;

    @ObfuscatedName("bx.g")
    public ImageConsumer field1277;

    @ObfuscatedName("bx.p(IILjava/awt/Component;I)V")
    public final void method1395(int arg0, int arg1, Component arg2) {
        this.field1297 = arg0;
        this.field1296 = arg1;
        this.field1298 = new int[arg0 * arg1 + 1];
        this.field1278 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1303 = arg2.createImage(this);
        this.method1400();
        arg2.prepareImage(this.field1303, this);
        this.method1400();
        arg2.prepareImage(this.field1303, this);
        this.method1400();
        arg2.prepareImage(this.field1303, this);
        this.method1462();
    }

    @ObfuscatedName("bx.g(Ljava/awt/Graphics;III)V")
    public final void method1398(Graphics arg0, int arg1, int arg2) {
        this.method1400();
        arg0.drawImage(this.field1303, arg1, arg2, this);
    }

    @ObfuscatedName("bx.x(Ljava/awt/Graphics;IIIII)V")
    public final void method1397(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1401(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1303, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1277 = arg0;
        arg0.setDimensions(this.field1297, this.field1296);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1278);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1277 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1277 == arg0) {
            this.field1277 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bx.c(I)V")
    public synchronized void method1400() {
        if (this.field1277 != null) {
            this.field1277.setPixels(0, 0, this.field1297, this.field1296, this.field1278, this.field1298, 0, this.field1297);
            this.field1277.imageComplete(2);
        }
    }

    @ObfuscatedName("bx.n(IIIIB)V")
    public synchronized void method1401(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1277 != null) {
            this.field1277.setPixels(arg0, arg1, arg2, arg3, this.field1278, this.field1298, this.field1297 * arg1 + arg0, this.field1297);
            this.field1277.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
