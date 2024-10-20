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

@ObfuscatedName("cc")
public final class class79 extends class81 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cc.m")
    public ColorModel field1452;

    @ObfuscatedName("cc.w")
    public ImageConsumer field1453;

    @ObfuscatedName("cc.m(IILjava/awt/Component;B)V")
    public final void method1601(int arg0, int arg1, Component arg2) {
        this.field1469 = arg0;
        this.field1470 = arg1;
        this.field1468 = new int[arg0 * arg1 + 1];
        this.field1452 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1471 = arg2.createImage(this);
        this.method1617();
        arg2.prepareImage(this.field1471, this);
        this.method1617();
        arg2.prepareImage(this.field1471, this);
        this.method1617();
        arg2.prepareImage(this.field1471, this);
        this.method1676();
    }

    @ObfuscatedName("cc.w(Ljava/awt/Graphics;III)V")
    public final void method1597(Graphics arg0, int arg1, int arg2) {
        this.method1617();
        arg0.drawImage(this.field1471, arg1, arg2, this);
    }

    @ObfuscatedName("cc.e(Ljava/awt/Graphics;IIIIS)V")
    public final void method1599(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1612(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1471, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1453 = arg0;
        arg0.setDimensions(this.field1469, this.field1470);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1452);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1453 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1453 == arg0) {
            this.field1453 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cc.o(I)V")
    public synchronized void method1617() {
        if (this.field1453 != null) {
            this.field1453.setPixels(0, 0, this.field1469, this.field1470, this.field1452, this.field1468, 0, this.field1469);
            this.field1453.imageComplete(2);
        }
    }

    @ObfuscatedName("cc.g(IIIIS)V")
    public synchronized void method1612(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1453 != null) {
            this.field1453.setPixels(arg0, arg1, arg2, arg3, this.field1452, this.field1468, this.field1469 * arg1 + arg0, this.field1469);
            this.field1453.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
