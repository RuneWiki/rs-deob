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
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("by.k")
    public ColorModel field1255;

    @ObfuscatedName("by.y")
    public ImageConsumer field1258;

    @ObfuscatedName("by.k(IILjava/awt/Component;I)V")
    public final void method1340(int arg0, int arg1, Component arg2) {
        this.field1278 = arg0;
        this.field1276 = arg1;
        this.field1272 = new int[arg0 * arg1 + 1];
        this.field1255 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1274 = arg2.createImage(this);
        this.method1372();
        arg2.prepareImage(this.field1274, this);
        this.method1372();
        arg2.prepareImage(this.field1274, this);
        this.method1372();
        arg2.prepareImage(this.field1274, this);
        this.method1412();
    }

    @ObfuscatedName("by.y(Ljava/awt/Graphics;III)V")
    public final void method1345(Graphics arg0, int arg1, int arg2) {
        this.method1372();
        arg0.drawImage(this.field1274, arg1, arg2, this);
    }

    @ObfuscatedName("by.s(Ljava/awt/Graphics;IIIII)V")
    public final void method1342(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1339(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1274, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1258 = arg0;
        arg0.setDimensions(this.field1278, this.field1276);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1255);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1258 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1258 == arg0) {
            this.field1258 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("by.g(B)V")
    public synchronized void method1372() {
        if (this.field1258 != null) {
            this.field1258.setPixels(0, 0, this.field1278, this.field1276, this.field1255, this.field1272, 0, this.field1278);
            this.field1258.imageComplete(2);
        }
    }

    @ObfuscatedName("by.h(IIIIB)V")
    public synchronized void method1339(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1258 != null) {
            this.field1258.setPixels(arg0, arg1, arg2, arg3, this.field1255, this.field1272, this.field1278 * arg1 + arg0, this.field1278);
            this.field1258.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
