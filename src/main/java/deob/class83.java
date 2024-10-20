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

@ObfuscatedName("cy")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cy.c")
    public ColorModel field1460;

    @ObfuscatedName("cy.q")
    public ImageConsumer field1457;

    @ObfuscatedName("cy.c(IILjava/awt/Component;B)V")
    public final void method1532(int arg0, int arg1, Component arg2) {
        this.field1485 = arg0;
        this.field1479 = arg1;
        this.field1477 = new int[arg0 * arg1 + 1];
        this.field1460 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1481 = arg2.createImage(this);
        this.method1557();
        arg2.prepareImage(this.field1481, this);
        this.method1557();
        arg2.prepareImage(this.field1481, this);
        this.method1557();
        arg2.prepareImage(this.field1481, this);
        this.method1586();
    }

    @ObfuscatedName("cy.q(Ljava/awt/Graphics;III)V")
    public final void method1533(Graphics arg0, int arg1, int arg2) {
        this.method1557();
        arg0.drawImage(this.field1481, arg1, arg2, this);
    }

    @ObfuscatedName("cy.y(Ljava/awt/Graphics;IIIII)V")
    public final void method1534(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1537(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1481, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1457 = arg0;
        arg0.setDimensions(this.field1485, this.field1479);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1460);
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

    @ObfuscatedName("cy.v(B)V")
    public synchronized void method1557() {
        if (this.field1457 != null) {
            this.field1457.setPixels(0, 0, this.field1485, this.field1479, this.field1460, this.field1477, 0, this.field1485);
            this.field1457.imageComplete(2);
        }
    }

    @ObfuscatedName("cy.g(IIIII)V")
    public synchronized void method1537(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1457 != null) {
            this.field1457.setPixels(arg0, arg1, arg2, arg3, this.field1460, this.field1477, this.field1485 * arg1 + arg0, this.field1485);
            this.field1457.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
