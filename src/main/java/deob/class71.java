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

@ObfuscatedName("bl")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bl.y")
    public ColorModel field1308;

    @ObfuscatedName("bl.k")
    public ImageConsumer field1305;

    @ObfuscatedName("bl.y(IILjava/awt/Component;I)V")
    public final void method1390(int arg0, int arg1, Component arg2) {
        this.field1320 = arg0;
        this.field1324 = arg1;
        this.field1319 = new int[arg0 * arg1 + 1];
        this.field1308 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1322 = arg2.createImage(this);
        this.method1394();
        arg2.prepareImage(this.field1322, this);
        this.method1394();
        arg2.prepareImage(this.field1322, this);
        this.method1394();
        arg2.prepareImage(this.field1322, this);
        this.method1439();
    }

    @ObfuscatedName("bl.k(Ljava/awt/Graphics;III)V")
    public final void method1393(Graphics arg0, int arg1, int arg2) {
        this.method1394();
        arg0.drawImage(this.field1322, arg1, arg2, this);
    }

    @ObfuscatedName("bl.g(Ljava/awt/Graphics;IIIII)V")
    public final void method1392(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1395(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1322, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1305 = arg0;
        arg0.setDimensions(this.field1320, this.field1324);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1308);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1305 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1305 == arg0) {
            this.field1305 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bl.n(B)V")
    public synchronized void method1394() {
        if (this.field1305 != null) {
            this.field1305.setPixels(0, 0, this.field1320, this.field1324, this.field1308, this.field1319, 0, this.field1320);
            this.field1305.imageComplete(2);
        }
    }

    @ObfuscatedName("bl.t(IIIII)V")
    public synchronized void method1395(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1305 != null) {
            this.field1305.setPixels(arg0, arg1, arg2, arg3, this.field1308, this.field1319, this.field1320 * arg1 + arg0, this.field1320);
            this.field1305.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
