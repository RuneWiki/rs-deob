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

@ObfuscatedName("bf")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bf.e")
    public ColorModel field1281;

    @ObfuscatedName("bf.o")
    public ImageConsumer field1278;

    @ObfuscatedName("bf.e(IILjava/awt/Component;I)V")
    public final void method1323(int arg0, int arg1, Component arg2) {
        this.field1298 = arg0;
        this.field1297 = arg1;
        this.field1300 = new int[arg0 * arg1 + 1];
        this.field1281 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1299 = arg2.createImage(this);
        this.method1326();
        arg2.prepareImage(this.field1299, this);
        this.method1326();
        arg2.prepareImage(this.field1299, this);
        this.method1326();
        arg2.prepareImage(this.field1299, this);
        this.method1383();
    }

    @ObfuscatedName("bf.o(Ljava/awt/Graphics;III)V")
    public final void method1324(Graphics arg0, int arg1, int arg2) {
        this.method1326();
        arg0.drawImage(this.field1299, arg1, arg2, this);
    }

    @ObfuscatedName("bf.y(Ljava/awt/Graphics;IIIII)V")
    public final void method1325(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1328(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1299, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1278 = arg0;
        arg0.setDimensions(this.field1298, this.field1297);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1281);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1278 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1278 == arg0) {
            this.field1278 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bf.b(I)V")
    public synchronized void method1326() {
        if (this.field1278 != null) {
            this.field1278.setPixels(0, 0, this.field1298, this.field1297, this.field1281, this.field1300, 0, this.field1298);
            this.field1278.imageComplete(2);
        }
    }

    @ObfuscatedName("bf.w(IIIII)V")
    public synchronized void method1328(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1278 != null) {
            this.field1278.setPixels(arg0, arg1, arg2, arg3, this.field1281, this.field1300, this.field1298 * arg1 + arg0, this.field1298);
            this.field1278.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
