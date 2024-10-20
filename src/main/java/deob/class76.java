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

@ObfuscatedName("bc")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bc.t")
    public ColorModel field1385;

    @ObfuscatedName("bc.i")
    public ImageConsumer field1381;

    @ObfuscatedName("bc.t(IILjava/awt/Component;I)V")
    public final void method1458(int arg0, int arg1, Component arg2) {
        this.field1403 = arg0;
        this.field1397 = arg1;
        this.field1402 = new int[arg0 * arg1 + 1];
        this.field1385 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1396 = arg2.createImage(this);
        this.method1470();
        arg2.prepareImage(this.field1396, this);
        this.method1470();
        arg2.prepareImage(this.field1396, this);
        this.method1470();
        arg2.prepareImage(this.field1396, this);
        this.method1539();
    }

    @ObfuscatedName("bc.i(Ljava/awt/Graphics;III)V")
    public final void method1459(Graphics arg0, int arg1, int arg2) {
        this.method1470();
        arg0.drawImage(this.field1396, arg1, arg2, this);
    }

    @ObfuscatedName("bc.g(Ljava/awt/Graphics;IIIII)V")
    public final void method1460(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1463(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1396, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1381 = arg0;
        arg0.setDimensions(this.field1403, this.field1397);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1385);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1381 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1381 == arg0) {
            this.field1381 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bc.h(I)V")
    public synchronized void method1470() {
        if (this.field1381 != null) {
            this.field1381.setPixels(0, 0, this.field1403, this.field1397, this.field1385, this.field1402, 0, this.field1403);
            this.field1381.imageComplete(2);
        }
    }

    @ObfuscatedName("bc.z(IIIII)V")
    public synchronized void method1463(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1381 != null) {
            this.field1381.setPixels(arg0, arg1, arg2, arg3, this.field1385, this.field1402, this.field1403 * arg1 + arg0, this.field1403);
            this.field1381.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
