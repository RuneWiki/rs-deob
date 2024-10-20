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

@ObfuscatedName("bg")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bg.c")
    public ColorModel field1364;

    @ObfuscatedName("bg.h")
    public ImageConsumer field1363;

    @ObfuscatedName("bg.c(IILjava/awt/Component;I)V")
    public final void method1488(int arg0, int arg1, Component arg2) {
        this.field1382 = arg0;
        this.field1381 = arg1;
        this.field1377 = new int[arg0 * arg1 + 1];
        this.field1364 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1379 = arg2.createImage(this);
        this.method1502();
        arg2.prepareImage(this.field1379, this);
        this.method1502();
        arg2.prepareImage(this.field1379, this);
        this.method1502();
        arg2.prepareImage(this.field1379, this);
        this.method1557();
    }

    @ObfuscatedName("bg.h(Ljava/awt/Graphics;IIS)V")
    public final void method1486(Graphics arg0, int arg1, int arg2) {
        this.method1502();
        arg0.drawImage(this.field1379, arg1, arg2, this);
    }

    @ObfuscatedName("bg.k(Ljava/awt/Graphics;IIIII)V")
    public final void method1487(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1485(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1379, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1363 = arg0;
        arg0.setDimensions(this.field1382, this.field1381);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1364);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1363 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1363 == arg0) {
            this.field1363 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bg.t(I)V")
    public synchronized void method1502() {
        if (this.field1363 != null) {
            this.field1363.setPixels(0, 0, this.field1382, this.field1381, this.field1364, this.field1377, 0, this.field1382);
            this.field1363.imageComplete(2);
        }
    }

    @ObfuscatedName("bg.g(IIIII)V")
    public synchronized void method1485(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1363 != null) {
            this.field1363.setPixels(arg0, arg1, arg2, arg3, this.field1364, this.field1377, this.field1382 * arg1 + arg0, this.field1382);
            this.field1363.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
