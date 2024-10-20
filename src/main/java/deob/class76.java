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

@ObfuscatedName("bk")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bk.j")
    public ColorModel field1357;

    @ObfuscatedName("bk.h")
    public ImageConsumer field1356;

    @ObfuscatedName("bk.j(IILjava/awt/Component;I)V")
    public final void method1504(int arg0, int arg1, Component arg2) {
        this.field1374 = arg0;
        this.field1375 = arg1;
        this.field1377 = new int[arg0 * arg1 + 1];
        this.field1357 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1381 = arg2.createImage(this);
        this.method1514();
        arg2.prepareImage(this.field1381, this);
        this.method1514();
        arg2.prepareImage(this.field1381, this);
        this.method1514();
        arg2.prepareImage(this.field1381, this);
        this.method1580();
    }

    @ObfuscatedName("bk.h(Ljava/awt/Graphics;III)V")
    public final void method1515(Graphics arg0, int arg1, int arg2) {
        this.method1514();
        arg0.drawImage(this.field1381, arg1, arg2, this);
    }

    @ObfuscatedName("bk.m(Ljava/awt/Graphics;IIIIB)V")
    public final void method1505(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1509(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1381, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1356 = arg0;
        arg0.setDimensions(this.field1374, this.field1375);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1357);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1356 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1356 == arg0) {
            this.field1356 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bk.z(I)V")
    public synchronized void method1514() {
        if (this.field1356 != null) {
            this.field1356.setPixels(0, 0, this.field1374, this.field1375, this.field1357, this.field1377, 0, this.field1374);
            this.field1356.imageComplete(2);
        }
    }

    @ObfuscatedName("bk.x(IIIII)V")
    public synchronized void method1509(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1356 != null) {
            this.field1356.setPixels(arg0, arg1, arg2, arg3, this.field1357, this.field1377, this.field1374 * arg1 + arg0, this.field1374);
            this.field1356.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
