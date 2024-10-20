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
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bs.k")
    public ColorModel field1279;

    @ObfuscatedName("bs.b")
    public ImageConsumer field1276;

    @ObfuscatedName("bs.k(IILjava/awt/Component;B)V")
    public final void method1337(int arg0, int arg1, Component arg2) {
        this.field1305 = arg0;
        this.field1297 = arg1;
        this.field1303 = new int[arg0 * arg1 + 1];
        this.field1279 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1296 = arg2.createImage(this);
        this.method1339();
        arg2.prepareImage(this.field1296, this);
        this.method1339();
        arg2.prepareImage(this.field1296, this);
        this.method1339();
        arg2.prepareImage(this.field1296, this);
        this.method1409();
    }

    @ObfuscatedName("bs.b(Ljava/awt/Graphics;IIB)V")
    public final void method1338(Graphics arg0, int arg1, int arg2) {
        this.method1339();
        arg0.drawImage(this.field1296, arg1, arg2, this);
    }

    @ObfuscatedName("bs.e(Ljava/awt/Graphics;IIIII)V")
    public final void method1343(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1342(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1296, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1276 = arg0;
        arg0.setDimensions(this.field1305, this.field1297);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1279);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1276 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1276 == arg0) {
            this.field1276 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bs.i(B)V")
    public synchronized void method1339() {
        if (this.field1276 != null) {
            this.field1276.setPixels(0, 0, this.field1305, this.field1297, this.field1279, this.field1303, 0, this.field1305);
            this.field1276.imageComplete(2);
        }
    }

    @ObfuscatedName("bs.t(IIIII)V")
    public synchronized void method1342(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1276 != null) {
            this.field1276.setPixels(arg0, arg1, arg2, arg3, this.field1279, this.field1303, this.field1305 * arg1 + arg0, this.field1305);
            this.field1276.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
