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
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bj.k")
    public ColorModel field1353;

    @ObfuscatedName("bj.h")
    public ImageConsumer field1348;

    @ObfuscatedName("bj.k(IILjava/awt/Component;I)V")
    public final void method1490(int arg0, int arg1, Component arg2) {
        this.field1362 = arg0;
        this.field1363 = arg1;
        this.field1365 = new int[arg0 * arg1 + 1];
        this.field1353 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1364 = arg2.createImage(this);
        this.method1494();
        arg2.prepareImage(this.field1364, this);
        this.method1494();
        arg2.prepareImage(this.field1364, this);
        this.method1494();
        arg2.prepareImage(this.field1364, this);
        this.method1562();
    }

    @ObfuscatedName("bj.h(Ljava/awt/Graphics;III)V")
    public final void method1525(Graphics arg0, int arg1, int arg2) {
        this.method1494();
        arg0.drawImage(this.field1364, arg1, arg2, this);
    }

    @ObfuscatedName("bj.o(Ljava/awt/Graphics;IIIII)V")
    public final void method1515(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1495(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1364, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1348 = arg0;
        arg0.setDimensions(this.field1362, this.field1363);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1353);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1348 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1348 == arg0) {
            this.field1348 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bj.z(I)V")
    public synchronized void method1494() {
        if (this.field1348 != null) {
            this.field1348.setPixels(0, 0, this.field1362, this.field1363, this.field1353, this.field1365, 0, this.field1362);
            this.field1348.imageComplete(2);
        }
    }

    @ObfuscatedName("bj.c(IIIII)V")
    public synchronized void method1495(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1348 != null) {
            this.field1348.setPixels(arg0, arg1, arg2, arg3, this.field1353, this.field1365, this.field1362 * arg1 + arg0, this.field1362);
            this.field1348.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
