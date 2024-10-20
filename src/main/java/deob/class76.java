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

@ObfuscatedName("bu")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bu.f")
    public ColorModel field1396;

    @ObfuscatedName("bu.u")
    public ImageConsumer field1390;

    @ObfuscatedName("bu.f(IILjava/awt/Component;B)V")
    public final void method1547(int arg0, int arg1, Component arg2) {
        this.field1403 = arg0;
        this.field1405 = arg1;
        this.field1407 = new int[arg0 * arg1 + 1];
        this.field1396 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1406 = arg2.createImage(this);
        this.method1568();
        arg2.prepareImage(this.field1406, this);
        this.method1568();
        arg2.prepareImage(this.field1406, this);
        this.method1568();
        arg2.prepareImage(this.field1406, this);
        this.method1618();
    }

    @ObfuscatedName("bu.u(Ljava/awt/Graphics;III)V")
    public final void method1548(Graphics arg0, int arg1, int arg2) {
        this.method1568();
        arg0.drawImage(this.field1406, arg1, arg2, this);
    }

    @ObfuscatedName("bu.x(Ljava/awt/Graphics;IIIII)V")
    public final void method1549(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1553(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1406, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1390 = arg0;
        arg0.setDimensions(this.field1403, this.field1405);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1396);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1390 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1390 == arg0) {
            this.field1390 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bu.b(I)V")
    public synchronized void method1568() {
        if (this.field1390 != null) {
            this.field1390.setPixels(0, 0, this.field1403, this.field1405, this.field1396, this.field1407, 0, this.field1403);
            this.field1390.imageComplete(2);
        }
    }

    @ObfuscatedName("bu.l(IIIIB)V")
    public synchronized void method1553(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1390 != null) {
            this.field1390.setPixels(arg0, arg1, arg2, arg3, this.field1396, this.field1407, this.field1403 * arg1 + arg0, this.field1403);
            this.field1390.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
