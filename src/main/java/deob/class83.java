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

    @ObfuscatedName("cy.d")
    public ColorModel field1438;

    @ObfuscatedName("cy.g")
    public ImageConsumer field1439;

    @ObfuscatedName("cy.d(IILjava/awt/Component;B)V")
    public final void method1563(int arg0, int arg1, Component arg2) {
        this.field1457 = arg0;
        this.field1453 = arg1;
        this.field1452 = new int[arg0 * arg1 + 1];
        this.field1438 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1451 = arg2.createImage(this);
        this.method1568();
        arg2.prepareImage(this.field1451, this);
        this.method1568();
        arg2.prepareImage(this.field1451, this);
        this.method1568();
        arg2.prepareImage(this.field1451, this);
        this.method1626();
    }

    @ObfuscatedName("cy.g(Ljava/awt/Graphics;III)V")
    public final void method1572(Graphics arg0, int arg1, int arg2) {
        this.method1568();
        arg0.drawImage(this.field1451, arg1, arg2, this);
    }

    @ObfuscatedName("cy.a(Ljava/awt/Graphics;IIIIB)V")
    public final void method1564(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1569(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1451, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1439 = arg0;
        arg0.setDimensions(this.field1457, this.field1453);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1438);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1439 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1439 == arg0) {
            this.field1439 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cy.t(I)V")
    public synchronized void method1568() {
        if (this.field1439 != null) {
            this.field1439.setPixels(0, 0, this.field1457, this.field1453, this.field1438, this.field1452, 0, this.field1457);
            this.field1439.imageComplete(2);
        }
    }

    @ObfuscatedName("cy.f(IIIII)V")
    public synchronized void method1569(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1439 != null) {
            this.field1439.setPixels(arg0, arg1, arg2, arg3, this.field1438, this.field1452, this.field1457 * arg1 + arg0, this.field1457);
            this.field1439.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
