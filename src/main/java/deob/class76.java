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

@ObfuscatedName("by")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("by.w")
    public ColorModel field1381;

    @ObfuscatedName("by.x")
    public ImageConsumer field1382;

    @ObfuscatedName("by.w(IILjava/awt/Component;B)V")
    public final void method1523(int arg0, int arg1, Component arg2) {
        this.field1397 = arg0;
        this.field1398 = arg1;
        this.field1396 = new int[arg0 * arg1 + 1];
        this.field1381 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1399 = arg2.createImage(this);
        this.method1511();
        arg2.prepareImage(this.field1399, this);
        this.method1511();
        arg2.prepareImage(this.field1399, this);
        this.method1511();
        arg2.prepareImage(this.field1399, this);
        this.method1571();
    }

    @ObfuscatedName("by.x(Ljava/awt/Graphics;III)V")
    public final void method1503(Graphics arg0, int arg1, int arg2) {
        this.method1511();
        arg0.drawImage(this.field1399, arg1, arg2, this);
    }

    @ObfuscatedName("by.t(Ljava/awt/Graphics;IIIII)V")
    public final void method1504(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1507(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1399, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1382 = arg0;
        arg0.setDimensions(this.field1397, this.field1398);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1381);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1382 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1382 == arg0) {
            this.field1382 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("by.p(I)V")
    public synchronized void method1511() {
        if (this.field1382 != null) {
            this.field1382.setPixels(0, 0, this.field1397, this.field1398, this.field1381, this.field1396, 0, this.field1397);
            this.field1382.imageComplete(2);
        }
    }

    @ObfuscatedName("by.e(IIIII)V")
    public synchronized void method1507(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1382 != null) {
            this.field1382.setPixels(arg0, arg1, arg2, arg3, this.field1381, this.field1396, this.field1397 * arg1 + arg0, this.field1397);
            this.field1382.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
