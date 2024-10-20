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

@ObfuscatedName("hp")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hp.u")
    public ColorModel field3201;

    @ObfuscatedName("hp.c")
    public ImageConsumer field3199;

    @ObfuscatedName("hp.u(IILjava/awt/Component;B)V")
    public final void method3738(int arg0, int arg1, Component arg2) {
        this.field3178 = arg0;
        this.field3177 = arg1;
        this.field3179 = new int[arg0 * arg1 + 1];
        this.field3201 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3180 = arg2.createImage(this);
        this.method3854();
        arg2.prepareImage(this.field3180, this);
        this.method3854();
        arg2.prepareImage(this.field3180, this);
        this.method3854();
        arg2.prepareImage(this.field3180, this);
        this.method3832();
    }

    @ObfuscatedName("hp.x(Ljava/awt/Graphics;III)V")
    public final void method3745(Graphics arg0, int arg1, int arg2) {
        this.method3854();
        arg0.drawImage(this.field3180, arg1, arg2, this);
    }

    @ObfuscatedName("hp.i(Ljava/awt/Graphics;IIIII)V")
    public final void method3743(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3855(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3180, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3199 = arg0;
        arg0.setDimensions(this.field3178, this.field3177);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3201);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3199 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3199 == arg0) {
            this.field3199 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hp.r(I)V")
    public synchronized void method3854() {
        if (this.field3199 != null) {
            this.field3199.setPixels(0, 0, this.field3178, this.field3177, this.field3201, this.field3179, 0, this.field3178);
            this.field3199.imageComplete(2);
        }
    }

    @ObfuscatedName("hp.y(IIIII)V")
    public synchronized void method3855(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3199 != null) {
            this.field3199.setPixels(arg0, arg1, arg2, arg3, this.field3201, this.field3179, this.field3178 * arg1 + arg0, this.field3178);
            this.field3199.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
