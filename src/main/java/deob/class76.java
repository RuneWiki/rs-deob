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

    @ObfuscatedName("bp.h")
    public ColorModel field1383;

    @ObfuscatedName("bp.q")
    public ImageConsumer field1379;

    @ObfuscatedName("bp.h(IILjava/awt/Component;B)V")
    public final void method1519(int arg0, int arg1, Component arg2) {
        this.field1396 = arg0;
        this.field1399 = arg1;
        this.field1398 = new int[arg0 * arg1 + 1];
        this.field1383 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1397 = arg2.createImage(this);
        this.method1524();
        arg2.prepareImage(this.field1397, this);
        this.method1524();
        arg2.prepareImage(this.field1397, this);
        this.method1524();
        arg2.prepareImage(this.field1397, this);
        this.method1593();
    }

    @ObfuscatedName("bp.q(Ljava/awt/Graphics;III)V")
    public final void method1520(Graphics arg0, int arg1, int arg2) {
        this.method1524();
        arg0.drawImage(this.field1397, arg1, arg2, this);
    }

    @ObfuscatedName("bp.v(Ljava/awt/Graphics;IIIII)V")
    public final void method1556(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1525(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1397, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1379 = arg0;
        arg0.setDimensions(this.field1396, this.field1399);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1383);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1379 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1379 == arg0) {
            this.field1379 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bp.n(I)V")
    public synchronized void method1524() {
        if (this.field1379 != null) {
            this.field1379.setPixels(0, 0, this.field1396, this.field1399, this.field1383, this.field1398, 0, this.field1396);
            this.field1379.imageComplete(2);
        }
    }

    @ObfuscatedName("bp.f(IIIII)V")
    public synchronized void method1525(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1379 != null) {
            this.field1379.setPixels(arg0, arg1, arg2, arg3, this.field1383, this.field1398, this.field1396 * arg1 + arg0, this.field1396);
            this.field1379.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
