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

@ObfuscatedName("ho")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ho.p")
    public ColorModel field3202;

    @ObfuscatedName("ho.k")
    public ImageConsumer field3200;

    @ObfuscatedName("ho.p(IILjava/awt/Component;I)V")
    public final void method3718(int arg0, int arg1, Component arg2) {
        this.field3181 = arg0;
        this.field3182 = arg1;
        this.field3183 = new int[arg0 * arg1 + 1];
        this.field3202 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3180 = arg2.createImage(this);
        this.method3848();
        arg2.prepareImage(this.field3180, this);
        this.method3848();
        arg2.prepareImage(this.field3180, this);
        this.method3848();
        arg2.prepareImage(this.field3180, this);
        this.method3806();
    }

    @ObfuscatedName("ho.g(Ljava/awt/Graphics;IIB)V")
    public final void method3719(Graphics arg0, int arg1, int arg2) {
        this.method3848();
        arg0.drawImage(this.field3180, arg1, arg2, this);
    }

    @ObfuscatedName("ho.x(Ljava/awt/Graphics;IIIII)V")
    public final void method3720(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3831(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3180, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3200 = arg0;
        arg0.setDimensions(this.field3181, this.field3182);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3202);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3200 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3200 == arg0) {
            this.field3200 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ho.n(I)V")
    public synchronized void method3848() {
        if (this.field3200 != null) {
            this.field3200.setPixels(0, 0, this.field3181, this.field3182, this.field3202, this.field3183, 0, this.field3181);
            this.field3200.imageComplete(2);
        }
    }

    @ObfuscatedName("ho.w(IIIIB)V")
    public synchronized void method3831(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3200 != null) {
            this.field3200.setPixels(arg0, arg1, arg2, arg3, this.field3202, this.field3183, this.field3181 * arg1 + arg0, this.field3181);
            this.field3200.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
