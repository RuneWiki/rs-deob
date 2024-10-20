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

@ObfuscatedName("by")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("by.e")
    public ColorModel field1267;

    @ObfuscatedName("by.p")
    public ImageConsumer field1263;

    @ObfuscatedName("by.e(IILjava/awt/Component;I)V")
    public final void method1357(int arg0, int arg1, Component arg2) {
        this.field1282 = arg0;
        this.field1281 = arg1;
        this.field1285 = new int[arg0 * arg1 + 1];
        this.field1267 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1284 = arg2.createImage(this);
        this.method1356();
        arg2.prepareImage(this.field1284, this);
        this.method1356();
        arg2.prepareImage(this.field1284, this);
        this.method1356();
        arg2.prepareImage(this.field1284, this);
        this.method1426();
    }

    @ObfuscatedName("by.p(Ljava/awt/Graphics;III)V")
    public final void method1358(Graphics arg0, int arg1, int arg2) {
        this.method1356();
        arg0.drawImage(this.field1284, arg1, arg2, this);
    }

    @ObfuscatedName("by.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1359(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1362(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1284, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1263 = arg0;
        arg0.setDimensions(this.field1282, this.field1281);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1267);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1263 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1263 == arg0) {
            this.field1263 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("by.g(I)V")
    public synchronized void method1356() {
        if (this.field1263 != null) {
            this.field1263.setPixels(0, 0, this.field1282, this.field1281, this.field1267, this.field1285, 0, this.field1282);
            this.field1263.imageComplete(2);
        }
    }

    @ObfuscatedName("by.u(IIIII)V")
    public synchronized void method1362(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1263 != null) {
            this.field1263.setPixels(arg0, arg1, arg2, arg3, this.field1267, this.field1285, this.field1282 * arg1 + arg0, this.field1282);
            this.field1263.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
