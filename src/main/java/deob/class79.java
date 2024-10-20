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

@ObfuscatedName("ck")
public final class class79 extends class81 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ck.e")
    public ColorModel field1443;

    @ObfuscatedName("ck.l")
    public ImageConsumer field1444;

    @ObfuscatedName("ck.e(IILjava/awt/Component;I)V")
    public final void method1609(int arg0, int arg1, Component arg2) {
        this.field1460 = arg0;
        this.field1462 = arg1;
        this.field1465 = new int[arg0 * arg1 + 1];
        this.field1443 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1463 = arg2.createImage(this);
        this.method1635();
        arg2.prepareImage(this.field1463, this);
        this.method1635();
        arg2.prepareImage(this.field1463, this);
        this.method1635();
        arg2.prepareImage(this.field1463, this);
        this.method1688();
    }

    @ObfuscatedName("ck.l(Ljava/awt/Graphics;III)V")
    public final void method1610(Graphics arg0, int arg1, int arg2) {
        this.method1635();
        arg0.drawImage(this.field1463, arg1, arg2, this);
    }

    @ObfuscatedName("ck.c(Ljava/awt/Graphics;IIIIB)V")
    public final void method1611(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1608(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1463, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1444 = arg0;
        arg0.setDimensions(this.field1460, this.field1462);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1443);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1444 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1444 == arg0) {
            this.field1444 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ck.h(I)V")
    public synchronized void method1635() {
        if (this.field1444 != null) {
            this.field1444.setPixels(0, 0, this.field1460, this.field1462, this.field1443, this.field1465, 0, this.field1460);
            this.field1444.imageComplete(2);
        }
    }

    @ObfuscatedName("ck.r(IIIIB)V")
    public synchronized void method1608(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1444 != null) {
            this.field1444.setPixels(arg0, arg1, arg2, arg3, this.field1443, this.field1465, this.field1460 * arg1 + arg0, this.field1460);
            this.field1444.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
