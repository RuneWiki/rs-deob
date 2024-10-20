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

@ObfuscatedName("hm")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hm.q")
    public ColorModel field3217;

    @ObfuscatedName("hm.n")
    public ImageConsumer field3218;

    @ObfuscatedName("hm.q(IILjava/awt/Component;I)V")
    public final void method3793(int arg0, int arg1, Component arg2) {
        this.field3199 = arg0;
        this.field3198 = arg1;
        this.field3197 = new int[arg0 * arg1 + 1];
        this.field3217 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3200 = arg2.createImage(this);
        this.method3908();
        arg2.prepareImage(this.field3200, this);
        this.method3908();
        arg2.prepareImage(this.field3200, this);
        this.method3908();
        arg2.prepareImage(this.field3200, this);
        this.method3884();
    }

    @ObfuscatedName("hm.d(Ljava/awt/Graphics;III)V")
    public final void method3802(Graphics arg0, int arg1, int arg2) {
        this.method3908();
        arg0.drawImage(this.field3200, arg1, arg2, this);
    }

    @ObfuscatedName("hm.h(Ljava/awt/Graphics;IIIII)V")
    public final void method3791(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3909(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3200, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3218 = arg0;
        arg0.setDimensions(this.field3199, this.field3198);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3217);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3218 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3218 == arg0) {
            this.field3218 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hm.k(I)V")
    public synchronized void method3908() {
        if (this.field3218 != null) {
            this.field3218.setPixels(0, 0, this.field3199, this.field3198, this.field3217, this.field3197, 0, this.field3199);
            this.field3218.imageComplete(2);
        }
    }

    @ObfuscatedName("hm.l(IIIII)V")
    public synchronized void method3909(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3218 != null) {
            this.field3218.setPixels(arg0, arg1, arg2, arg3, this.field3217, this.field3197, this.field3199 * arg1 + arg0, this.field3199);
            this.field3218.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
