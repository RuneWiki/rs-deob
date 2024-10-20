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

@ObfuscatedName("ct")
public final class class142 extends class159 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ct.c")
    public ImageConsumer field2157;

    @ObfuscatedName("ct.v")
    public ColorModel field2159;

    @ObfuscatedName("ct.v(IILjava/awt/Component;S)V")
    public final void method2596(int arg0, int arg1, Component arg2) {
        this.field2385 = arg0;
        this.field2384 = arg1;
        this.field2386 = new int[arg0 * arg1 + 1];
        this.field2159 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2387 = arg2.createImage(this);
        this.method2600();
        arg2.prepareImage(this.field2387, this);
        this.method2600();
        arg2.prepareImage(this.field2387, this);
        this.method2600();
        arg2.prepareImage(this.field2387, this);
        this.method2826();
    }

    @ObfuscatedName("ct.c(Ljava/awt/Graphics;III)V")
    public final void method2597(Graphics arg0, int arg1, int arg2) {
        this.method2600();
        arg0.drawImage(this.field2387, arg1, arg2, this);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field2157 = arg0;
        arg0.setDimensions(this.field2385, this.field2384);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2159);
        arg0.setHints(14);
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2157 == arg0) {
            this.field2157 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ct.i(B)V")
    public synchronized void method2600() {
        if (this.field2157 != null) {
            this.field2157.setPixels(0, 0, this.field2385, this.field2384, this.field2159, this.field2386, 0, this.field2385);
            this.field2157.imageComplete(2);
        }
    }

    @ObfuscatedName("ct.m(IIIII)V")
    public synchronized void method2601(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2157 != null) {
            this.field2157.setPixels(arg0, arg1, arg2, arg3, this.field2159, this.field2386, this.field2385 * arg1 + arg0, this.field2385);
            this.field2157.imageComplete(2);
        }
    }

    @ObfuscatedName("ct.b(Ljava/awt/Graphics;IIIII)V")
    public final void method2627(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2601(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field2387, 0, 0, this);
        arg0.setClip(var6);
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field2157 == arg0;
    }
}
