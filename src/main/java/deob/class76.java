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

@ObfuscatedName("bp")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bp.e")
    public ColorModel field1347;

    @ObfuscatedName("bp.w")
    public ImageConsumer field1351;

    @ObfuscatedName("bp.e(IILjava/awt/Component;I)V")
    public final void method1496(int arg0, int arg1, Component arg2) {
        this.field1367 = arg0;
        this.field1363 = arg1;
        this.field1362 = new int[arg0 * arg1 + 1];
        this.field1347 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1361 = arg2.createImage(this);
        this.method1501();
        arg2.prepareImage(this.field1361, this);
        this.method1501();
        arg2.prepareImage(this.field1361, this);
        this.method1501();
        arg2.prepareImage(this.field1361, this);
        this.method1561();
    }

    @ObfuscatedName("bp.w(Ljava/awt/Graphics;III)V")
    public final void method1497(Graphics arg0, int arg1, int arg2) {
        this.method1501();
        arg0.drawImage(this.field1361, arg1, arg2, this);
    }

    @ObfuscatedName("bp.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1498(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1502(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1361, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1351 = arg0;
        arg0.setDimensions(this.field1367, this.field1363);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1347);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1351 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1351 == arg0) {
            this.field1351 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bp.s(B)V")
    public synchronized void method1501() {
        if (this.field1351 != null) {
            this.field1351.setPixels(0, 0, this.field1367, this.field1363, this.field1347, this.field1362, 0, this.field1367);
            this.field1351.imageComplete(2);
        }
    }

    @ObfuscatedName("bp.p(IIIII)V")
    public synchronized void method1502(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1351 != null) {
            this.field1351.setPixels(arg0, arg1, arg2, arg3, this.field1347, this.field1362, this.field1367 * arg1 + arg0, this.field1367);
            this.field1351.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
