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

@ObfuscatedName("bo")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bo.d")
    public ColorModel field1380;

    @ObfuscatedName("bo.p")
    public ImageConsumer field1371;

    @ObfuscatedName("bo.d(IILjava/awt/Component;B)V")
    public final void method1506(int arg0, int arg1, Component arg2) {
        this.field1393 = arg0;
        this.field1395 = arg1;
        this.field1394 = new int[arg0 * arg1 + 1];
        this.field1380 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1396 = arg2.createImage(this);
        this.method1509();
        arg2.prepareImage(this.field1396, this);
        this.method1509();
        arg2.prepareImage(this.field1396, this);
        this.method1509();
        arg2.prepareImage(this.field1396, this);
        this.method1578();
    }

    @ObfuscatedName("bo.p(Ljava/awt/Graphics;III)V")
    public final void method1507(Graphics arg0, int arg1, int arg2) {
        this.method1509();
        arg0.drawImage(this.field1396, arg1, arg2, this);
    }

    @ObfuscatedName("bo.v(Ljava/awt/Graphics;IIIIS)V")
    public final void method1508(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1510(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1396, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1371 = arg0;
        arg0.setDimensions(this.field1393, this.field1395);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1380);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1371 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1371 == arg0) {
            this.field1371 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bo.l(B)V")
    public synchronized void method1509() {
        if (this.field1371 != null) {
            this.field1371.setPixels(0, 0, this.field1393, this.field1395, this.field1380, this.field1394, 0, this.field1393);
            this.field1371.imageComplete(2);
        }
    }

    @ObfuscatedName("bo.y(IIIII)V")
    public synchronized void method1510(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1371 != null) {
            this.field1371.setPixels(arg0, arg1, arg2, arg3, this.field1380, this.field1394, this.field1393 * arg1 + arg0, this.field1393);
            this.field1371.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
