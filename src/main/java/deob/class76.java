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

@ObfuscatedName("bx")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bx.n")
    public ColorModel field1366;

    @ObfuscatedName("bx.q")
    public ImageConsumer field1363;

    @ObfuscatedName("bx.n(IILjava/awt/Component;B)V")
    public final void method1513(int arg0, int arg1, Component arg2) {
        this.field1381 = arg0;
        this.field1382 = arg1;
        this.field1384 = new int[arg0 * arg1 + 1];
        this.field1366 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1380 = arg2.createImage(this);
        this.method1517();
        arg2.prepareImage(this.field1380, this);
        this.method1517();
        arg2.prepareImage(this.field1380, this);
        this.method1517();
        arg2.prepareImage(this.field1380, this);
        this.method1590();
    }

    @ObfuscatedName("bx.q(Ljava/awt/Graphics;IIB)V")
    public final void method1514(Graphics arg0, int arg1, int arg2) {
        this.method1517();
        arg0.drawImage(this.field1380, arg1, arg2, this);
    }

    @ObfuscatedName("bx.c(Ljava/awt/Graphics;IIIII)V")
    public final void method1542(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1541(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1380, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1363 = arg0;
        arg0.setDimensions(this.field1381, this.field1382);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1366);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1363 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1363 == arg0) {
            this.field1363 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bx.l(B)V")
    public synchronized void method1517() {
        if (this.field1363 != null) {
            this.field1363.setPixels(0, 0, this.field1381, this.field1382, this.field1366, this.field1384, 0, this.field1381);
            this.field1363.imageComplete(2);
        }
    }

    @ObfuscatedName("bx.r(IIIII)V")
    public synchronized void method1541(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1363 != null) {
            this.field1363.setPixels(arg0, arg1, arg2, arg3, this.field1366, this.field1384, this.field1381 * arg1 + arg0, this.field1381);
            this.field1363.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
