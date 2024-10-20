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

@ObfuscatedName("bs")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bs.o")
    public ColorModel field1300;

    @ObfuscatedName("bs.l")
    public ImageConsumer field1302;

    @ObfuscatedName("bs.o(IILjava/awt/Component;B)V")
    public final void method1407(int arg0, int arg1, Component arg2) {
        this.field1320 = arg0;
        this.field1321 = arg1;
        this.field1319 = new int[arg0 * arg1 + 1];
        this.field1300 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1323 = arg2.createImage(this);
        this.method1412();
        arg2.prepareImage(this.field1323, this);
        this.method1412();
        arg2.prepareImage(this.field1323, this);
        this.method1412();
        arg2.prepareImage(this.field1323, this);
        this.method1475();
    }

    @ObfuscatedName("bs.l(Ljava/awt/Graphics;IIB)V")
    public final void method1408(Graphics arg0, int arg1, int arg2) {
        this.method1412();
        arg0.drawImage(this.field1323, arg1, arg2, this);
    }

    @ObfuscatedName("bs.g(Ljava/awt/Graphics;IIIIB)V")
    public final void method1409(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1431(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1323, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1302 = arg0;
        arg0.setDimensions(this.field1320, this.field1321);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1300);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1302 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1302 == arg0) {
            this.field1302 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bs.u(S)V")
    public synchronized void method1412() {
        if (this.field1302 != null) {
            this.field1302.setPixels(0, 0, this.field1320, this.field1321, this.field1300, this.field1319, 0, this.field1320);
            this.field1302.imageComplete(2);
        }
    }

    @ObfuscatedName("bs.q(IIIIB)V")
    public synchronized void method1431(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1302 != null) {
            this.field1302.setPixels(arg0, arg1, arg2, arg3, this.field1300, this.field1319, this.field1320 * arg1 + arg0, this.field1320);
            this.field1302.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
