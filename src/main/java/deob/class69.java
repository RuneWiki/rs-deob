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

@ObfuscatedName("bz")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bz.e")
    public ColorModel field1274;

    @ObfuscatedName("bz.v")
    public ImageConsumer field1270;

    @ObfuscatedName("bz.e(IILjava/awt/Component;I)V")
    public final void method1330(int arg0, int arg1, Component arg2) {
        this.field1289 = arg0;
        this.field1290 = arg1;
        this.field1294 = new int[arg0 * arg1 + 1];
        this.field1274 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1291 = arg2.createImage(this);
        this.method1336();
        arg2.prepareImage(this.field1291, this);
        this.method1336();
        arg2.prepareImage(this.field1291, this);
        this.method1336();
        arg2.prepareImage(this.field1291, this);
        this.method1401();
    }

    @ObfuscatedName("bz.v(Ljava/awt/Graphics;IIB)V")
    public final void method1339(Graphics arg0, int arg1, int arg2) {
        this.method1336();
        arg0.drawImage(this.field1291, arg1, arg2, this);
    }

    @ObfuscatedName("bz.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1354(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1337(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1291, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1270 = arg0;
        arg0.setDimensions(this.field1289, this.field1290);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1274);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1270 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1270 == arg0) {
            this.field1270 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bz.g(I)V")
    public synchronized void method1336() {
        if (this.field1270 != null) {
            this.field1270.setPixels(0, 0, this.field1289, this.field1290, this.field1274, this.field1294, 0, this.field1289);
            this.field1270.imageComplete(2);
        }
    }

    @ObfuscatedName("bz.x(IIIIB)V")
    public synchronized void method1337(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1270 != null) {
            this.field1270.setPixels(arg0, arg1, arg2, arg3, this.field1274, this.field1294, this.field1289 * arg1 + arg0, this.field1289);
            this.field1270.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
