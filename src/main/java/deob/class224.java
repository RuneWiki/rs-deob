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

@ObfuscatedName("hv")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hv.f")
    public ColorModel field3216;

    @ObfuscatedName("hv.o")
    public ImageConsumer field3217;

    @ObfuscatedName("hv.f(IILjava/awt/Component;B)V")
    public final void method3761(int arg0, int arg1, Component arg2) {
        this.field3199 = arg0;
        this.field3198 = arg1;
        this.field3197 = new int[arg0 * arg1 + 1];
        this.field3216 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3196 = arg2.createImage(this);
        this.method3857();
        arg2.prepareImage(this.field3196, this);
        this.method3857();
        arg2.prepareImage(this.field3196, this);
        this.method3857();
        arg2.prepareImage(this.field3196, this);
        this.method3843();
    }

    @ObfuscatedName("hv.i(Ljava/awt/Graphics;IIB)V")
    public final void method3762(Graphics arg0, int arg1, int arg2) {
        this.method3857();
        arg0.drawImage(this.field3196, arg1, arg2, this);
    }

    @ObfuscatedName("hv.u(Ljava/awt/Graphics;IIIII)V")
    public final void method3763(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3860(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3196, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3217 = arg0;
        arg0.setDimensions(this.field3199, this.field3198);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3216);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3217 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3217 == arg0) {
            this.field3217 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hv.a(I)V")
    public synchronized void method3857() {
        if (this.field3217 != null) {
            this.field3217.setPixels(0, 0, this.field3199, this.field3198, this.field3216, this.field3197, 0, this.field3199);
            this.field3217.imageComplete(2);
        }
    }

    @ObfuscatedName("hv.v(IIIII)V")
    public synchronized void method3860(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3217 != null) {
            this.field3217.setPixels(arg0, arg1, arg2, arg3, this.field3216, this.field3197, this.field3199 * arg1 + arg0, this.field3199);
            this.field3217.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
