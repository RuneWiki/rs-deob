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

@ObfuscatedName("cf")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cf.i")
    public ColorModel field1448;

    @ObfuscatedName("cf.v")
    public ImageConsumer field1450;

    @ObfuscatedName("cf.i(IILjava/awt/Component;I)V")
    public final void method1629(int arg0, int arg1, Component arg2) {
        this.field1471 = arg0;
        this.field1466 = arg1;
        this.field1467 = new int[arg0 * arg1 + 1];
        this.field1448 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1468 = arg2.createImage(this);
        this.method1627();
        arg2.prepareImage(this.field1468, this);
        this.method1627();
        arg2.prepareImage(this.field1468, this);
        this.method1627();
        arg2.prepareImage(this.field1468, this);
        this.method1705();
    }

    @ObfuscatedName("cf.v(Ljava/awt/Graphics;IIB)V")
    public final void method1621(Graphics arg0, int arg1, int arg2) {
        this.method1627();
        arg0.drawImage(this.field1468, arg1, arg2, this);
    }

    @ObfuscatedName("cf.m(Ljava/awt/Graphics;IIIII)V")
    public final void method1636(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1628(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1468, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1450 = arg0;
        arg0.setDimensions(this.field1471, this.field1466);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1448);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1450 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1450 == arg0) {
            this.field1450 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cf.j(I)V")
    public synchronized void method1627() {
        if (this.field1450 != null) {
            this.field1450.setPixels(0, 0, this.field1471, this.field1466, this.field1448, this.field1467, 0, this.field1471);
            this.field1450.imageComplete(2);
        }
    }

    @ObfuscatedName("cf.o(IIIII)V")
    public synchronized void method1628(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1450 != null) {
            this.field1450.setPixels(arg0, arg1, arg2, arg3, this.field1448, this.field1467, this.field1471 * arg1 + arg0, this.field1471);
            this.field1450.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
