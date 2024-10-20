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

@ObfuscatedName("cv")
public final class class79 extends class81 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cv.k")
    public ColorModel field1433;

    @ObfuscatedName("cv.q")
    public ImageConsumer field1435;

    @ObfuscatedName("cv.k(IILjava/awt/Component;I)V")
    public final void method1585(int arg0, int arg1, Component arg2) {
        this.field1445 = arg0;
        this.field1446 = arg1;
        this.field1444 = new int[arg0 * arg1 + 1];
        this.field1433 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1447 = arg2.createImage(this);
        this.method1568();
        arg2.prepareImage(this.field1447, this);
        this.method1568();
        arg2.prepareImage(this.field1447, this);
        this.method1568();
        arg2.prepareImage(this.field1447, this);
        this.method1624();
    }

    @ObfuscatedName("cv.q(Ljava/awt/Graphics;IIB)V")
    public final void method1588(Graphics arg0, int arg1, int arg2) {
        this.method1568();
        arg0.drawImage(this.field1447, arg1, arg2, this);
    }

    @ObfuscatedName("cv.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1567(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1569(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1447, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1435 = arg0;
        arg0.setDimensions(this.field1445, this.field1446);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1433);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1435 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1435 == arg0) {
            this.field1435 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cv.c(B)V")
    public synchronized void method1568() {
        if (this.field1435 != null) {
            this.field1435.setPixels(0, 0, this.field1445, this.field1446, this.field1433, this.field1444, 0, this.field1445);
            this.field1435.imageComplete(2);
        }
    }

    @ObfuscatedName("cv.v(IIIII)V")
    public synchronized void method1569(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1435 != null) {
            this.field1435.setPixels(arg0, arg1, arg2, arg3, this.field1433, this.field1444, this.field1445 * arg1 + arg0, this.field1445);
            this.field1435.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
