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

    @ObfuscatedName("hd.k")
    public ColorModel field3198;

    @ObfuscatedName("hd.j")
    public ImageConsumer field3199;

    @ObfuscatedName("hd.k(IILjava/awt/Component;B)V")
    public final void method3738(int arg0, int arg1, Component arg2) {
        this.field3178 = arg0;
        this.field3179 = arg1;
        this.field3180 = new int[arg0 * arg1 + 1];
        this.field3198 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3177 = arg2.createImage(this);
        this.method3836();
        arg2.prepareImage(this.field3177, this);
        this.method3836();
        arg2.prepareImage(this.field3177, this);
        this.method3836();
        arg2.prepareImage(this.field3177, this);
        this.method3819();
    }

    @ObfuscatedName("hd.y(Ljava/awt/Graphics;IIB)V")
    public final void method3739(Graphics arg0, int arg1, int arg2) {
        this.method3836();
        arg0.drawImage(this.field3177, arg1, arg2, this);
    }

    @ObfuscatedName("hd.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method3740(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3837(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3177, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3199 = arg0;
        arg0.setDimensions(this.field3178, this.field3179);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3198);
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

    @ObfuscatedName("hd.z(I)V")
    public synchronized void method3836() {
        if (this.field3199 != null) {
            this.field3199.setPixels(0, 0, this.field3178, this.field3179, this.field3198, this.field3180, 0, this.field3178);
            this.field3199.imageComplete(2);
        }
    }

    @ObfuscatedName("hd.u(IIIII)V")
    public synchronized void method3837(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3199 != null) {
            this.field3199.setPixels(arg0, arg1, arg2, arg3, this.field3198, this.field3180, this.field3178 * arg1 + arg0, this.field3178);
            this.field3199.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
