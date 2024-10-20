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

@ObfuscatedName("ca")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ca.b")
    public ColorModel field1429;

    @ObfuscatedName("ca.e")
    public ImageConsumer field1427;

    @ObfuscatedName("ca.b(IILjava/awt/Component;B)V")
    public final void method1599(int arg0, int arg1, Component arg2) {
        this.field1444 = arg0;
        this.field1443 = arg1;
        this.field1442 = new int[arg0 * arg1 + 1];
        this.field1429 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1446 = arg2.createImage(this);
        this.method1605();
        arg2.prepareImage(this.field1446, this);
        this.method1605();
        arg2.prepareImage(this.field1446, this);
        this.method1605();
        arg2.prepareImage(this.field1446, this);
        this.method1659();
    }

    @ObfuscatedName("ca.e(Ljava/awt/Graphics;III)V")
    public final void method1616(Graphics arg0, int arg1, int arg2) {
        this.method1605();
        arg0.drawImage(this.field1446, arg1, arg2, this);
    }

    @ObfuscatedName("ca.g(Ljava/awt/Graphics;IIIII)V")
    public final void method1601(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1603(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1446, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1427 = arg0;
        arg0.setDimensions(this.field1444, this.field1443);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1429);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1427 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1427 == arg0) {
            this.field1427 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ca.o(I)V")
    public synchronized void method1605() {
        if (this.field1427 != null) {
            this.field1427.setPixels(0, 0, this.field1444, this.field1443, this.field1429, this.field1442, 0, this.field1444);
            this.field1427.imageComplete(2);
        }
    }

    @ObfuscatedName("ca.a(IIIIB)V")
    public synchronized void method1603(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1427 != null) {
            this.field1427.setPixels(arg0, arg1, arg2, arg3, this.field1429, this.field1442, this.field1444 * arg1 + arg0, this.field1444);
            this.field1427.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
