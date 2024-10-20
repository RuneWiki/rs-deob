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

@ObfuscatedName("cw")
public final class class79 extends class81 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cw.l")
    public ColorModel field1452;

    @ObfuscatedName("cw.g")
    public ImageConsumer field1448;

    @ObfuscatedName("cw.l(IILjava/awt/Component;B)V")
    public final void method1621(int arg0, int arg1, Component arg2) {
        this.field1471 = arg0;
        this.field1473 = arg1;
        this.field1475 = new int[arg0 * arg1 + 1];
        this.field1452 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1476 = arg2.createImage(this);
        this.method1626();
        arg2.prepareImage(this.field1476, this);
        this.method1626();
        arg2.prepareImage(this.field1476, this);
        this.method1626();
        arg2.prepareImage(this.field1476, this);
        this.method1691();
    }

    @ObfuscatedName("cw.g(Ljava/awt/Graphics;III)V")
    public final void method1622(Graphics arg0, int arg1, int arg2) {
        this.method1626();
        arg0.drawImage(this.field1476, arg1, arg2, this);
    }

    @ObfuscatedName("cw.r(Ljava/awt/Graphics;IIIIB)V")
    public final void method1623(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1627(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1476, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1448 = arg0;
        arg0.setDimensions(this.field1471, this.field1473);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1452);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1448 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1448 == arg0) {
            this.field1448 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cw.e(S)V")
    public synchronized void method1626() {
        if (this.field1448 != null) {
            this.field1448.setPixels(0, 0, this.field1471, this.field1473, this.field1452, this.field1475, 0, this.field1471);
            this.field1448.imageComplete(2);
        }
    }

    @ObfuscatedName("cw.h(IIIII)V")
    public synchronized void method1627(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1448 != null) {
            this.field1448.setPixels(arg0, arg1, arg2, arg3, this.field1452, this.field1475, this.field1471 * arg1 + arg0, this.field1471);
            this.field1448.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
