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

@ObfuscatedName("bu")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bu.o")
    public ColorModel field1365;

    @ObfuscatedName("bu.f")
    public ImageConsumer field1367;

    @ObfuscatedName("bu.o(IILjava/awt/Component;I)V")
    public final void method1465(int arg0, int arg1, Component arg2) {
        this.field1378 = arg0;
        this.field1379 = arg1;
        this.field1377 = new int[arg0 * arg1 + 1];
        this.field1365 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1380 = arg2.createImage(this);
        this.method1461();
        arg2.prepareImage(this.field1380, this);
        this.method1461();
        arg2.prepareImage(this.field1380, this);
        this.method1461();
        arg2.prepareImage(this.field1380, this);
        this.method1527();
    }

    @ObfuscatedName("bu.f(Ljava/awt/Graphics;III)V")
    public final void method1458(Graphics arg0, int arg1, int arg2) {
        this.method1461();
        arg0.drawImage(this.field1380, arg1, arg2, this);
    }

    @ObfuscatedName("bu.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1459(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1462(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1380, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1367 = arg0;
        arg0.setDimensions(this.field1378, this.field1379);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1365);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1367 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1367 == arg0) {
            this.field1367 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bu.h(I)V")
    public synchronized void method1461() {
        if (this.field1367 != null) {
            this.field1367.setPixels(0, 0, this.field1378, this.field1379, this.field1365, this.field1377, 0, this.field1378);
            this.field1367.imageComplete(2);
        }
    }

    @ObfuscatedName("bu.q(IIIIB)V")
    public synchronized void method1462(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1367 != null) {
            this.field1367.setPixels(arg0, arg1, arg2, arg3, this.field1365, this.field1377, this.field1378 * arg1 + arg0, this.field1378);
            this.field1367.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
