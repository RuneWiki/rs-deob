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
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("by.b")
    public ColorModel field1342;

    @ObfuscatedName("by.g")
    public ImageConsumer field1343;

    @ObfuscatedName("by.b(IILjava/awt/Component;I)V")
    public final void method1515(int arg0, int arg1, Component arg2) {
        this.field1364 = arg0;
        this.field1365 = arg1;
        this.field1369 = new int[arg0 * arg1 + 1];
        this.field1342 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1363 = arg2.createImage(this);
        this.method1528();
        arg2.prepareImage(this.field1363, this);
        this.method1528();
        arg2.prepareImage(this.field1363, this);
        this.method1528();
        arg2.prepareImage(this.field1363, this);
        this.method1571();
    }

    @ObfuscatedName("by.g(Ljava/awt/Graphics;IIB)V")
    public final void method1516(Graphics arg0, int arg1, int arg2) {
        this.method1528();
        arg0.drawImage(this.field1363, arg1, arg2, this);
    }

    @ObfuscatedName("by.j(Ljava/awt/Graphics;IIIII)V")
    public final void method1517(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1526(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1363, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1343 = arg0;
        arg0.setDimensions(this.field1364, this.field1365);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1342);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1343 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1343 == arg0) {
            this.field1343 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("by.d(S)V")
    public synchronized void method1528() {
        if (this.field1343 != null) {
            this.field1343.setPixels(0, 0, this.field1364, this.field1365, this.field1342, this.field1369, 0, this.field1364);
            this.field1343.imageComplete(2);
        }
    }

    @ObfuscatedName("by.x(IIIII)V")
    public synchronized void method1526(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1343 != null) {
            this.field1343.setPixels(arg0, arg1, arg2, arg3, this.field1342, this.field1369, this.field1364 * arg1 + arg0, this.field1364);
            this.field1343.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
