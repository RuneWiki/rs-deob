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

@ObfuscatedName("bk")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bk.a")
    public ColorModel field1374;

    @ObfuscatedName("bk.r")
    public ImageConsumer field1372;

    @ObfuscatedName("bk.a(IILjava/awt/Component;B)V")
    public final void method1524(int arg0, int arg1, Component arg2) {
        this.field1396 = arg0;
        this.field1390 = arg1;
        this.field1395 = new int[arg0 * arg1 + 1];
        this.field1374 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1393 = arg2.createImage(this);
        this.method1529();
        arg2.prepareImage(this.field1393, this);
        this.method1529();
        arg2.prepareImage(this.field1393, this);
        this.method1529();
        arg2.prepareImage(this.field1393, this);
        this.method1597();
    }

    @ObfuscatedName("bk.r(Ljava/awt/Graphics;III)V")
    public final void method1525(Graphics arg0, int arg1, int arg2) {
        this.method1529();
        arg0.drawImage(this.field1393, arg1, arg2, this);
    }

    @ObfuscatedName("bk.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1526(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1530(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1393, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1372 = arg0;
        arg0.setDimensions(this.field1396, this.field1390);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1374);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1372 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1372 == arg0) {
            this.field1372 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bk.s(B)V")
    public synchronized void method1529() {
        if (this.field1372 != null) {
            this.field1372.setPixels(0, 0, this.field1396, this.field1390, this.field1374, this.field1395, 0, this.field1396);
            this.field1372.imageComplete(2);
        }
    }

    @ObfuscatedName("bk.y(IIIII)V")
    public synchronized void method1530(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1372 != null) {
            this.field1372.setPixels(arg0, arg1, arg2, arg3, this.field1374, this.field1395, this.field1396 * arg1 + arg0, this.field1396);
            this.field1372.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
