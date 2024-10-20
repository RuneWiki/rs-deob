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

@ObfuscatedName("hi")
public final class class228 extends class225 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hi.d")
    public ColorModel field3237;

    @ObfuscatedName("hi.p")
    public ImageConsumer field3235;

    @ObfuscatedName("hi.d(IILjava/awt/Component;B)V")
    public final void method3847(int arg0, int arg1, Component arg2) {
        this.field3219 = arg0;
        this.field3218 = arg1;
        this.field3217 = new int[arg0 * arg1 + 1];
        this.field3237 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3216 = arg2.createImage(this);
        this.method3944();
        arg2.prepareImage(this.field3216, this);
        this.method3944();
        arg2.prepareImage(this.field3216, this);
        this.method3944();
        arg2.prepareImage(this.field3216, this);
        this.method3923();
    }

    @ObfuscatedName("hi.c(Ljava/awt/Graphics;III)V")
    public final void method3848(Graphics arg0, int arg1, int arg2) {
        this.method3944();
        arg0.drawImage(this.field3216, arg1, arg2, this);
    }

    @ObfuscatedName("hi.n(Ljava/awt/Graphics;IIIII)V")
    public final void method3849(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3940(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3216, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3235 = arg0;
        arg0.setDimensions(this.field3219, this.field3218);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3237);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3235 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3235 == arg0) {
            this.field3235 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hi.o(I)V")
    public synchronized void method3944() {
        if (this.field3235 != null) {
            this.field3235.setPixels(0, 0, this.field3219, this.field3218, this.field3237, this.field3217, 0, this.field3219);
            this.field3235.imageComplete(2);
        }
    }

    @ObfuscatedName("hi.m(IIIIB)V")
    public synchronized void method3940(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3235 != null) {
            this.field3235.setPixels(arg0, arg1, arg2, arg3, this.field3237, this.field3217, this.field3219 * arg1 + arg0, this.field3219);
            this.field3235.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
