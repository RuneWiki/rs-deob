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

    @ObfuscatedName("hm.s")
    public ColorModel field3204;

    @ObfuscatedName("hm.g")
    public ImageConsumer field3205;

    @ObfuscatedName("hm.s(IILjava/awt/Component;I)V")
    public final void method3626(int arg0, int arg1, Component arg2) {
        this.field3183 = arg0;
        this.field3184 = arg1;
        this.field3182 = new int[arg0 * arg1 + 1];
        this.field3204 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3185 = arg2.createImage(this);
        this.method3715();
        arg2.prepareImage(this.field3185, this);
        this.method3715();
        arg2.prepareImage(this.field3185, this);
        this.method3715();
        arg2.prepareImage(this.field3185, this);
        this.method3695();
    }

    @ObfuscatedName("hm.c(Ljava/awt/Graphics;IIS)V")
    public final void method3625(Graphics arg0, int arg1, int arg2) {
        this.method3715();
        arg0.drawImage(this.field3185, arg1, arg2, this);
    }

    @ObfuscatedName("hm.f(Ljava/awt/Graphics;IIIII)V")
    public final void method3628(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3716(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field3185, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field3205 = arg0;
        arg0.setDimensions(this.field3183, this.field3184);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3204);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field3205 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3205 == arg0) {
            this.field3205 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("hm.m(I)V")
    public synchronized void method3715() {
        if (this.field3205 != null) {
            this.field3205.setPixels(0, 0, this.field3183, this.field3184, this.field3204, this.field3182, 0, this.field3183);
            this.field3205.imageComplete(2);
        }
    }

    @ObfuscatedName("hm.j(IIIIB)V")
    public synchronized void method3716(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3205 != null) {
            this.field3205.setPixels(arg0, arg1, arg2, arg3, this.field3204, this.field3182, this.field3183 * arg1 + arg0, this.field3183);
            this.field3205.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
