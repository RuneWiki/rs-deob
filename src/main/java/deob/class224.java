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

@ObfuscatedName("hd")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hd.b")
    public ColorModel field3214;

    @ObfuscatedName("hd.h")
    public ImageConsumer field3212;

    @ObfuscatedName("hd.b(IILjava/awt/Component;I)V")
    public final void method3861(int arg0, int arg1, Component arg2) {
        this.field3191 = arg0;
        this.field3194 = arg1;
        this.field3193 = new int[arg0 * arg1 + 1];
        this.field3214 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3192 = arg2.createImage(this);
        this.method3972();
        arg2.prepareImage(this.field3192, this);
        this.method3972();
        arg2.prepareImage(this.field3192, this);
        this.method3972();
        arg2.prepareImage(this.field3192, this);
        this.method3948();
    }

    @ObfuscatedName("hd.l(Ljava/awt/Graphics;III)V")
    public final void method3860(Graphics arg0, int arg1, int arg2) {
        this.method3972();
        arg0.drawImage(this.field3192, arg1, arg2, this);
    }

    @ObfuscatedName("hd.i(Ljava/awt/Graphics;IIIII)V")
    public final void method3862(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3973(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3192, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3212 = arg0;
        arg0.setDimensions(this.field3191, this.field3194);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3214);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3212 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3212 == arg0) {
            this.field3212 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hd.j(I)V")
    public synchronized void method3972() {
        if (this.field3212 != null) {
            this.field3212.setPixels(0, 0, this.field3191, this.field3194, this.field3214, this.field3193, 0, this.field3191);
            this.field3212.imageComplete(2);
        }
    }

    @ObfuscatedName("hd.d(IIIII)V")
    public synchronized void method3973(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3212 != null) {
            this.field3212.setPixels(arg0, arg1, arg2, arg3, this.field3214, this.field3193, this.field3191 * arg1 + arg0, this.field3191);
            this.field3212.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
