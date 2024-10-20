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

@ObfuscatedName("hj")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hj.x")
    public ColorModel field3220;

    @ObfuscatedName("hj.p")
    public ImageConsumer field3219;

    @ObfuscatedName("hj.x(IILjava/awt/Component;I)V")
    public final void method3787(int arg0, int arg1, Component arg2) {
        this.field3199 = arg0;
        this.field3201 = arg1;
        this.field3202 = new int[arg0 * arg1 + 1];
        this.field3220 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3198 = arg2.createImage(this);
        this.method3904();
        arg2.prepareImage(this.field3198, this);
        this.method3904();
        arg2.prepareImage(this.field3198, this);
        this.method3904();
        arg2.prepareImage(this.field3198, this);
        this.method3882();
    }

    @ObfuscatedName("hj.n(Ljava/awt/Graphics;III)V")
    public final void method3795(Graphics arg0, int arg1, int arg2) {
        this.method3904();
        arg0.drawImage(this.field3198, arg1, arg2, this);
    }

    @ObfuscatedName("hj.g(Ljava/awt/Graphics;IIIII)V")
    public final void method3788(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3905(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3198, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3219 = arg0;
        arg0.setDimensions(this.field3199, this.field3201);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3220);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3219 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3219 == arg0) {
            this.field3219 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hj.q(B)V")
    public synchronized void method3904() {
        if (this.field3219 != null) {
            this.field3219.setPixels(0, 0, this.field3199, this.field3201, this.field3220, this.field3202, 0, this.field3199);
            this.field3219.imageComplete(2);
        }
    }

    @ObfuscatedName("hj.c(IIIIB)V")
    public synchronized void method3905(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3219 != null) {
            this.field3219.setPixels(arg0, arg1, arg2, arg3, this.field3220, this.field3202, this.field3199 * arg1 + arg0, this.field3199);
            this.field3219.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
