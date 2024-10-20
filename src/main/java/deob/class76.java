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

@ObfuscatedName("bx")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bx.i")
    public ColorModel field1373;

    @ObfuscatedName("bx.v")
    public ImageConsumer field1376;

    @ObfuscatedName("bx.i(IILjava/awt/Component;I)V")
    public final void method1485(int arg0, int arg1, Component arg2) {
        this.field1394 = arg0;
        this.field1393 = arg1;
        this.field1391 = new int[arg0 * arg1 + 1];
        this.field1373 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1399 = arg2.createImage(this);
        this.method1479();
        arg2.prepareImage(this.field1399, this);
        this.method1479();
        arg2.prepareImage(this.field1399, this);
        this.method1479();
        arg2.prepareImage(this.field1399, this);
        this.method1535();
    }

    @ObfuscatedName("bx.v(Ljava/awt/Graphics;III)V")
    public final void method1477(Graphics arg0, int arg1, int arg2) {
        this.method1479();
        arg0.drawImage(this.field1399, arg1, arg2, this);
    }

    @ObfuscatedName("bx.f(Ljava/awt/Graphics;IIIII)V")
    public final void method1486(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1484(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1399, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1376 = arg0;
        arg0.setDimensions(this.field1394, this.field1393);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1373);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1376 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1376 == arg0) {
            this.field1376 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bx.h(I)V")
    public synchronized void method1479() {
        if (this.field1376 != null) {
            this.field1376.setPixels(0, 0, this.field1394, this.field1393, this.field1373, this.field1391, 0, this.field1394);
            this.field1376.imageComplete(2);
        }
    }

    @ObfuscatedName("bx.a(IIIII)V")
    public synchronized void method1484(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1376 != null) {
            this.field1376.setPixels(arg0, arg1, arg2, arg3, this.field1373, this.field1391, this.field1394 * arg1 + arg0, this.field1394);
            this.field1376.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
