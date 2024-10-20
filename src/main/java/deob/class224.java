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

@ObfuscatedName("hg")
public final class class224 extends class221 implements ImageProducer, ImageObserver {

    @ObfuscatedName("hg.n")
    public ColorModel field3193;

    @ObfuscatedName("hg.r")
    public ImageConsumer field3194;

    @ObfuscatedName("hg.n(IILjava/awt/Component;B)V")
    public final void method3776(int arg0, int arg1, Component arg2) {
        this.field3176 = arg0;
        this.field3175 = arg1;
        this.field3174 = new int[arg0 * arg1 + 1];
        this.field3193 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3173 = arg2.createImage(this);
        this.method3880();
        arg2.prepareImage(this.field3173, this);
        this.method3880();
        arg2.prepareImage(this.field3173, this);
        this.method3880();
        arg2.prepareImage(this.field3173, this);
        this.method3856();
    }

    @ObfuscatedName("hg.d(Ljava/awt/Graphics;III)V")
    public final void method3777(Graphics arg0, int arg1, int arg2) {
        this.method3880();
        arg0.drawImage(this.field3173, arg1, arg2, this);
    }

    @ObfuscatedName("hg.m(Ljava/awt/Graphics;IIIIB)V")
    public final void method3780(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3879(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3173, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3194 = arg0;
        arg0.setDimensions(this.field3176, this.field3175);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3193);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3194 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3194 == arg0) {
            this.field3194 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hg.b(I)V")
    public synchronized void method3880() {
        if (this.field3194 != null) {
            this.field3194.setPixels(0, 0, this.field3176, this.field3175, this.field3193, this.field3174, 0, this.field3176);
            this.field3194.imageComplete(2);
        }
    }

    @ObfuscatedName("hg.j(IIIIB)V")
    public synchronized void method3879(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3194 != null) {
            this.field3194.setPixels(arg0, arg1, arg2, arg3, this.field3193, this.field3174, this.field3176 * arg1 + arg0, this.field3176);
            this.field3194.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
