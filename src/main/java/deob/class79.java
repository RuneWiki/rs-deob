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

@ObfuscatedName("cj")
public final class class79 extends class81 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cj.s")
    public ColorModel field1414;

    @ObfuscatedName("cj.z")
    public ImageConsumer field1413;

    @ObfuscatedName("cj.s(IILjava/awt/Component;S)V")
    public final void method1571(int arg0, int arg1, Component arg2) {
        this.field1432 = arg0;
        this.field1433 = arg1;
        this.field1436 = new int[arg0 * arg1 + 1];
        this.field1414 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1434 = arg2.createImage(this);
        this.method1551();
        arg2.prepareImage(this.field1434, this);
        this.method1551();
        arg2.prepareImage(this.field1434, this);
        this.method1551();
        arg2.prepareImage(this.field1434, this);
        this.method1612();
    }

    @ObfuscatedName("cj.z(Ljava/awt/Graphics;III)V")
    public final void method1547(Graphics arg0, int arg1, int arg2) {
        this.method1551();
        arg0.drawImage(this.field1434, arg1, arg2, this);
    }

    @ObfuscatedName("cj.t(Ljava/awt/Graphics;IIIIB)V")
    public final void method1548(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1552(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1434, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1413 = arg0;
        arg0.setDimensions(this.field1432, this.field1433);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1414);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1413 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1413 == arg0) {
            this.field1413 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cj.y(I)V")
    public synchronized void method1551() {
        if (this.field1413 != null) {
            this.field1413.setPixels(0, 0, this.field1432, this.field1433, this.field1414, this.field1436, 0, this.field1432);
            this.field1413.imageComplete(2);
        }
    }

    @ObfuscatedName("cj.p(IIIII)V")
    public synchronized void method1552(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1413 != null) {
            this.field1413.setPixels(arg0, arg1, arg2, arg3, this.field1414, this.field1436, this.field1432 * arg1 + arg0, this.field1432);
            this.field1413.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
