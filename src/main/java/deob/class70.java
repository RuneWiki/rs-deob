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

@ObfuscatedName("bu")
public final class class70 extends class72 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bu.l")
    public ColorModel field1264;

    @ObfuscatedName("bu.y")
    public ImageConsumer field1266;

    @ObfuscatedName("bu.l(IILjava/awt/Component;B)V")
    public final void method1353(int arg0, int arg1, Component arg2) {
        this.field1282 = arg0;
        this.field1283 = arg1;
        this.field1281 = new int[arg0 * arg1 + 1];
        this.field1264 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1284 = arg2.createImage(this);
        this.method1350();
        arg2.prepareImage(this.field1284, this);
        this.method1350();
        arg2.prepareImage(this.field1284, this);
        this.method1350();
        arg2.prepareImage(this.field1284, this);
        this.method1423();
    }

    @ObfuscatedName("bu.y(Ljava/awt/Graphics;III)V")
    public final void method1379(Graphics arg0, int arg1, int arg2) {
        this.method1350();
        arg0.drawImage(this.field1284, arg1, arg2, this);
    }

    @ObfuscatedName("bu.g(Ljava/awt/Graphics;IIIII)V")
    public final void method1374(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1351(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1284, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1266 = arg0;
        arg0.setDimensions(this.field1282, this.field1283);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1264);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1266 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1266 == arg0) {
            this.field1266 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bu.j(I)V")
    public synchronized void method1350() {
        if (this.field1266 != null) {
            this.field1266.setPixels(0, 0, this.field1282, this.field1283, this.field1264, this.field1281, 0, this.field1282);
            this.field1266.imageComplete(2);
        }
    }

    @ObfuscatedName("bu.w(IIIII)V")
    public synchronized void method1351(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1266 != null) {
            this.field1266.setPixels(arg0, arg1, arg2, arg3, this.field1264, this.field1281, this.field1282 * arg1 + arg0, this.field1282);
            this.field1266.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
