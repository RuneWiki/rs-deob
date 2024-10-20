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

@ObfuscatedName("co")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("co.x")
    public ColorModel field1416;

    @ObfuscatedName("co.p")
    public ImageConsumer field1417;

    @ObfuscatedName("co.x(IILjava/awt/Component;B)V")
    public final void method1566(int arg0, int arg1, Component arg2) {
        this.field1430 = arg0;
        this.field1431 = arg1;
        this.field1435 = new int[arg0 * arg1 + 1];
        this.field1416 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1433 = arg2.createImage(this);
        this.method1580();
        arg2.prepareImage(this.field1433, this);
        this.method1580();
        arg2.prepareImage(this.field1433, this);
        this.method1580();
        arg2.prepareImage(this.field1433, this);
        this.method1620();
    }

    @ObfuscatedName("co.p(Ljava/awt/Graphics;III)V")
    public final void method1568(Graphics arg0, int arg1, int arg2) {
        this.method1580();
        arg0.drawImage(this.field1433, arg1, arg2, this);
    }

    @ObfuscatedName("co.k(Ljava/awt/Graphics;IIIII)V")
    public final void method1562(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1567(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1433, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1417 = arg0;
        arg0.setDimensions(this.field1430, this.field1431);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1416);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1417 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1417 == arg0) {
            this.field1417 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("co.a(I)V")
    public synchronized void method1580() {
        if (this.field1417 != null) {
            this.field1417.setPixels(0, 0, this.field1430, this.field1431, this.field1416, this.field1435, 0, this.field1430);
            this.field1417.imageComplete(2);
        }
    }

    @ObfuscatedName("co.q(IIIII)V")
    public synchronized void method1567(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1417 != null) {
            this.field1417.setPixels(arg0, arg1, arg2, arg3, this.field1416, this.field1435, this.field1430 * arg1 + arg0, this.field1430);
            this.field1417.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
