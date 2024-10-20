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

@ObfuscatedName("cw")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cw.g")
    public ColorModel field1439;

    @ObfuscatedName("cw.m")
    public ImageConsumer field1443;

    @ObfuscatedName("cw.g(IILjava/awt/Component;I)V")
    public final void method1586(int arg0, int arg1, Component arg2) {
        this.field1459 = arg0;
        this.field1460 = arg1;
        this.field1462 = new int[arg0 * arg1 + 1];
        this.field1439 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1461 = arg2.createImage(this);
        this.method1590();
        arg2.prepareImage(this.field1461, this);
        this.method1590();
        arg2.prepareImage(this.field1461, this);
        this.method1590();
        arg2.prepareImage(this.field1461, this);
        this.method1645();
    }

    @ObfuscatedName("cw.m(Ljava/awt/Graphics;III)V")
    public final void method1587(Graphics arg0, int arg1, int arg2) {
        this.method1590();
        arg0.drawImage(this.field1461, arg1, arg2, this);
    }

    @ObfuscatedName("cw.v(Ljava/awt/Graphics;IIIII)V")
    public final void method1609(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1591(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1461, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1443 = arg0;
        arg0.setDimensions(this.field1459, this.field1460);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1439);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1443 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1443 == arg0) {
            this.field1443 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cw.r(I)V")
    public synchronized void method1590() {
        if (this.field1443 != null) {
            this.field1443.setPixels(0, 0, this.field1459, this.field1460, this.field1439, this.field1462, 0, this.field1459);
            this.field1443.imageComplete(2);
        }
    }

    @ObfuscatedName("cw.n(IIIII)V")
    public synchronized void method1591(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1443 != null) {
            this.field1443.setPixels(arg0, arg1, arg2, arg3, this.field1439, this.field1462, this.field1459 * arg1 + arg0, this.field1459);
            this.field1443.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
