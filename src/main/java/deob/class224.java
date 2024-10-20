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

@ObfuscatedName("hb")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hb.x")
    public ColorModel field3219;

    @ObfuscatedName("hb.h")
    public ImageConsumer field3217;

    @ObfuscatedName("hb.x(IILjava/awt/Component;I)V")
    public final void method3764(int arg0, int arg1, Component arg2) {
        this.field3195 = arg0;
        this.field3197 = arg1;
        this.field3196 = new int[arg0 * arg1 + 1];
        this.field3219 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3198 = arg2.createImage(this);
        this.method3867();
        arg2.prepareImage(this.field3198, this);
        this.method3867();
        arg2.prepareImage(this.field3198, this);
        this.method3867();
        arg2.prepareImage(this.field3198, this);
        this.method3852();
    }

    @ObfuscatedName("hb.j(Ljava/awt/Graphics;IIB)V")
    public final void method3765(Graphics arg0, int arg1, int arg2) {
        this.method3867();
        arg0.drawImage(this.field3198, arg1, arg2, this);
    }

    @ObfuscatedName("hb.c(Ljava/awt/Graphics;IIIII)V")
    public final void method3773(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3868(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3198, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3217 = arg0;
        arg0.setDimensions(this.field3195, this.field3197);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3219);
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

    @ObfuscatedName("hb.t(I)V")
    public synchronized void method3867() {
        if (this.field3217 != null) {
            this.field3217.setPixels(0, 0, this.field3195, this.field3197, this.field3219, this.field3196, 0, this.field3195);
            this.field3217.imageComplete(2);
        }
    }

    @ObfuscatedName("hb.z(IIIII)V")
    public synchronized void method3868(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3217 != null) {
            this.field3217.setPixels(arg0, arg1, arg2, arg3, this.field3219, this.field3196, this.field3195 * arg1 + arg0, this.field3195);
            this.field3217.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
