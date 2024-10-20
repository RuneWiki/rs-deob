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

@ObfuscatedName("hf")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hf.b")
    public ColorModel field3215;

    @ObfuscatedName("hf.j")
    public ImageConsumer field3216;

    @ObfuscatedName("hf.b(IILjava/awt/Component;B)V")
    public final void method3799(int arg0, int arg1, Component arg2) {
        this.field3195 = arg0;
        this.field3194 = arg1;
        this.field3193 = new int[arg0 * arg1 + 1];
        this.field3215 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3196 = arg2.createImage(this);
        this.method3904();
        arg2.prepareImage(this.field3196, this);
        this.method3904();
        arg2.prepareImage(this.field3196, this);
        this.method3904();
        arg2.prepareImage(this.field3196, this);
        this.method3880();
    }

    @ObfuscatedName("hf.e(Ljava/awt/Graphics;IIB)V")
    public final void method3798(Graphics arg0, int arg1, int arg2) {
        this.method3904();
        arg0.drawImage(this.field3196, arg1, arg2, this);
    }

    @ObfuscatedName("hf.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method3801(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3906(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3196, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3216 = arg0;
        arg0.setDimensions(this.field3195, this.field3194);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3215);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3216 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3216 == arg0) {
            this.field3216 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hf.w(I)V")
    public synchronized void method3904() {
        if (this.field3216 != null) {
            this.field3216.setPixels(0, 0, this.field3195, this.field3194, this.field3215, this.field3193, 0, this.field3195);
            this.field3216.imageComplete(2);
        }
    }

    @ObfuscatedName("hf.h(IIIII)V")
    public synchronized void method3906(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3216 != null) {
            this.field3216.setPixels(arg0, arg1, arg2, arg3, this.field3215, this.field3193, this.field3195 * arg1 + arg0, this.field3195);
            this.field3216.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
