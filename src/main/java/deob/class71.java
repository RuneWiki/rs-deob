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

@ObfuscatedName("br")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("br.n")
    public ColorModel field1322;

    @ObfuscatedName("br.o")
    public ImageConsumer field1323;

    @ObfuscatedName("br.n(IILjava/awt/Component;B)V")
    public final void method1466(int arg0, int arg1, Component arg2) {
        this.field1335 = arg0;
        this.field1337 = arg1;
        this.field1336 = new int[arg0 * arg1 + 1];
        this.field1322 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1338 = arg2.createImage(this);
        this.method1439();
        arg2.prepareImage(this.field1338, this);
        this.method1439();
        arg2.prepareImage(this.field1338, this);
        this.method1439();
        arg2.prepareImage(this.field1338, this);
        this.method1503();
    }

    @ObfuscatedName("br.o(Ljava/awt/Graphics;III)V")
    public final void method1435(Graphics arg0, int arg1, int arg2) {
        this.method1439();
        arg0.drawImage(this.field1338, arg1, arg2, this);
    }

    @ObfuscatedName("br.a(Ljava/awt/Graphics;IIIIB)V")
    public final void method1436(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1440(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1338, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1323 = arg0;
        arg0.setDimensions(this.field1335, this.field1337);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1322);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1323 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1323 == arg0) {
            this.field1323 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("br.w(I)V")
    public synchronized void method1439() {
        if (this.field1323 != null) {
            this.field1323.setPixels(0, 0, this.field1335, this.field1337, this.field1322, this.field1336, 0, this.field1335);
            this.field1323.imageComplete(2);
        }
    }

    @ObfuscatedName("br.m(IIIII)V")
    public synchronized void method1440(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1323 != null) {
            this.field1323.setPixels(arg0, arg1, arg2, arg3, this.field1322, this.field1336, this.field1335 * arg1 + arg0, this.field1335);
            this.field1323.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
