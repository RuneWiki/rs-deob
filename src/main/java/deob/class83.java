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

    @ObfuscatedName("ca.i")
    public ColorModel field1456;

    @ObfuscatedName("ca.p")
    public ImageConsumer field1457;

    @ObfuscatedName("ca.i(IILjava/awt/Component;I)V")
    public final void method1545(int arg0, int arg1, Component arg2) {
        this.field1470 = arg0;
        this.field1471 = arg1;
        this.field1472 = new int[arg0 * arg1 + 1];
        this.field1456 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1473 = arg2.createImage(this);
        this.method1548();
        arg2.prepareImage(this.field1473, this);
        this.method1548();
        arg2.prepareImage(this.field1473, this);
        this.method1548();
        arg2.prepareImage(this.field1473, this);
        this.method1606();
    }

    @ObfuscatedName("ca.p(Ljava/awt/Graphics;IIB)V")
    public final void method1573(Graphics arg0, int arg1, int arg2) {
        this.method1548();
        arg0.drawImage(this.field1473, arg1, arg2, this);
    }

    @ObfuscatedName("ca.a(Ljava/awt/Graphics;IIIIS)V")
    public final void method1546(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1547(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1473, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1457 = arg0;
        arg0.setDimensions(this.field1470, this.field1471);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1456);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1457 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1457 == arg0) {
            this.field1457 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ca.l(I)V")
    public synchronized void method1548() {
        if (this.field1457 != null) {
            this.field1457.setPixels(0, 0, this.field1470, this.field1471, this.field1456, this.field1472, 0, this.field1470);
            this.field1457.imageComplete(2);
        }
    }

    @ObfuscatedName("ca.q(IIIIB)V")
    public synchronized void method1547(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1457 != null) {
            this.field1457.setPixels(arg0, arg1, arg2, arg3, this.field1456, this.field1472, this.field1470 * arg1 + arg0, this.field1470);
            this.field1457.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
