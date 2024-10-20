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

@ObfuscatedName("bd")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bd.q")
    public ColorModel field1284;

    @ObfuscatedName("bd.s")
    public ImageConsumer field1279;

    @ObfuscatedName("bd.q(IILjava/awt/Component;B)V")
    public final void method1356(int arg0, int arg1, Component arg2) {
        this.field1293 = arg0;
        this.field1300 = arg1;
        this.field1297 = new int[arg0 * arg1 + 1];
        this.field1284 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1295 = arg2.createImage(this);
        this.method1361();
        arg2.prepareImage(this.field1295, this);
        this.method1361();
        arg2.prepareImage(this.field1295, this);
        this.method1361();
        arg2.prepareImage(this.field1295, this);
        this.method1418();
    }

    @ObfuscatedName("bd.s(Ljava/awt/Graphics;III)V")
    public final void method1357(Graphics arg0, int arg1, int arg2) {
        this.method1361();
        arg0.drawImage(this.field1295, arg1, arg2, this);
    }

    @ObfuscatedName("bd.h(Ljava/awt/Graphics;IIIIB)V")
    public final void method1358(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1375(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1295, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1279 = arg0;
        arg0.setDimensions(this.field1293, this.field1300);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1284);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1279 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1279 == arg0) {
            this.field1279 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bd.e(B)V")
    public synchronized void method1361() {
        if (this.field1279 != null) {
            this.field1279.setPixels(0, 0, this.field1293, this.field1300, this.field1284, this.field1297, 0, this.field1293);
            this.field1279.imageComplete(2);
        }
    }

    @ObfuscatedName("bd.n(IIIII)V")
    public synchronized void method1375(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1279 != null) {
            this.field1279.setPixels(arg0, arg1, arg2, arg3, this.field1284, this.field1297, this.field1293 * arg1 + arg0, this.field1293);
            this.field1279.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
