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

    @ObfuscatedName("bo.y")
    public ColorModel field1377;

    @ObfuscatedName("bo.d")
    public ImageConsumer field1378;

    @ObfuscatedName("bo.y(IILjava/awt/Component;B)V")
    public final void method1510(int arg0, int arg1, Component arg2) {
        this.field1396 = arg0;
        this.field1398 = arg1;
        this.field1394 = new int[arg0 * arg1 + 1];
        this.field1377 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1397 = arg2.createImage(this);
        this.method1521();
        arg2.prepareImage(this.field1397, this);
        this.method1521();
        arg2.prepareImage(this.field1397, this);
        this.method1521();
        arg2.prepareImage(this.field1397, this);
        this.method1566();
    }

    @ObfuscatedName("bo.d(Ljava/awt/Graphics;III)V")
    public final void method1511(Graphics arg0, int arg1, int arg2) {
        this.method1521();
        arg0.drawImage(this.field1397, arg1, arg2, this);
    }

    @ObfuscatedName("bo.g(Ljava/awt/Graphics;IIIIB)V")
    public final void method1513(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1514(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1397, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1378 = arg0;
        arg0.setDimensions(this.field1396, this.field1398);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1377);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1378 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1378 == arg0) {
            this.field1378 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bo.w(I)V")
    public synchronized void method1521() {
        if (this.field1378 != null) {
            this.field1378.setPixels(0, 0, this.field1396, this.field1398, this.field1377, this.field1394, 0, this.field1396);
            this.field1378.imageComplete(2);
        }
    }

    @ObfuscatedName("bo.e(IIIII)V")
    public synchronized void method1514(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1378 != null) {
            this.field1378.setPixels(arg0, arg1, arg2, arg3, this.field1377, this.field1394, this.field1396 * arg1 + arg0, this.field1396);
            this.field1378.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
