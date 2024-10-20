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

@ObfuscatedName("ce")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ce.p")
    public ColorModel field1431;

    @ObfuscatedName("ce.l")
    public ImageConsumer field1433;

    @ObfuscatedName("ce.p(IILjava/awt/Component;I)V")
    public final void method1657(int arg0, int arg1, Component arg2) {
        this.field1452 = arg0;
        this.field1453 = arg1;
        this.field1455 = new int[arg0 * arg1 + 1];
        this.field1431 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1457 = arg2.createImage(this);
        this.method1661();
        arg2.prepareImage(this.field1457, this);
        this.method1661();
        arg2.prepareImage(this.field1457, this);
        this.method1661();
        arg2.prepareImage(this.field1457, this);
        this.method1715();
    }

    @ObfuscatedName("ce.l(Ljava/awt/Graphics;III)V")
    public final void method1686(Graphics arg0, int arg1, int arg2) {
        this.method1661();
        arg0.drawImage(this.field1457, arg1, arg2, this);
    }

    @ObfuscatedName("ce.d(Ljava/awt/Graphics;IIIIS)V")
    public final void method1658(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1662(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1457, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1433 = arg0;
        arg0.setDimensions(this.field1452, this.field1453);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1431);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1433 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1433 == arg0) {
            this.field1433 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ce.x(B)V")
    public synchronized void method1661() {
        if (this.field1433 != null) {
            this.field1433.setPixels(0, 0, this.field1452, this.field1453, this.field1431, this.field1455, 0, this.field1452);
            this.field1433.imageComplete(2);
        }
    }

    @ObfuscatedName("ce.o(IIIIB)V")
    public synchronized void method1662(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1433 != null) {
            this.field1433.setPixels(arg0, arg1, arg2, arg3, this.field1431, this.field1455, this.field1452 * arg1 + arg0, this.field1452);
            this.field1433.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
